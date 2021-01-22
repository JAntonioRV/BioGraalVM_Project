package com.msc.polyglotfunctions;

import com.msc.graalvmcontext.GraalVMContext;
import io.micronaut.core.annotation.Introspected;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

@Introspected
public class ReverseComplement extends SequenceResourses implements ISequence {
    @Override
    public String run(String sequence) {
        String reversecomplement = "";
        String pythonscript="";

        //Create context instance
        Context context = GraalVMContext.getInstance();
        //Get python script from resources
        pythonscript = readResource("com/msc/pythonscripts/SeqReverseComplement.py");
        //Execute eval to load python function
        context.eval("python",pythonscript);
        //Execute python function setting sequence
        Value pyfunction = context.getPolyglotBindings().getMember("reverse_complement");
        Value sqrevcomplement = pyfunction.execute(sequence);
        //Casting result as String
        reversecomplement = sqrevcomplement.asString();

        return reversecomplement;
    }

    @Override
    public Object run_object(String sequence) { return null; }
}