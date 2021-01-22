package com.msc.polyglotfunctions;

import com.msc.graalvmcontext.GraalVMContext;
import io.micronaut.core.annotation.Introspected;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

@Introspected
public class Transcription extends SequenceResourses implements ISequence {

    @Override
    public String run(String sequence) { return null; }

    @Override
    public Object run_object(String sequence) {
        com.msc.model.Transcription tanscriptionvalues = new com.msc.model.Transcription();
        String pythonscript="";
        int codonproteinlen = 0;
        String[] codonsvalues;
        String[] proteinsvalues;

        //Create context instance
        Context context = GraalVMContext.getInstance();
        //Get python script from resources
        pythonscript = readResource("com/msc/pythonscripts/SeqTranscription.py");
        //Execute eval to load python function
        context.eval("python",pythonscript);
        //Execute python function setting sequence
        Value pyfunction = context.getPolyglotBindings().getMember("transcription");
        Value sqTranscription = pyfunction.execute(sequence);

        //Adding results in tanscriptionvalues
        //Adding RNA
        tanscriptionvalues.setRna(sqTranscription.getArrayElement(0).asString().replace("'", ""));

        //Adding frames lenght
        codonproteinlen = sqTranscription.getArrayElement(1).asInt();
        tanscriptionvalues.setCodonproteinlen(codonproteinlen);

        //Getting codons and proteins
        codonsvalues = new String[codonproteinlen];
        proteinsvalues = new String[codonproteinlen];

        //Retrieving values from GraalVMContext
        Value codones = sqTranscription.getArrayElement(2);
        Value proteinas = sqTranscription.getArrayElement(3);

        for(int i=0;i<codonproteinlen;i++){
            codonsvalues[i] = codones.getArrayElement(i).asString().replace("'", "");
            proteinsvalues[i] = proteinas.getArrayElement(i).asString().replace("'", "");
        }

        //Adding codons
        tanscriptionvalues.setCodons(codonsvalues);

        //Adding proteins
        tanscriptionvalues.setProteins(proteinsvalues);

        return tanscriptionvalues;
    }
}