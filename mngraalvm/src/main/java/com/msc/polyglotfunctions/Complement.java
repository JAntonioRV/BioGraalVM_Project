package com.msc.polyglotfunctions;

import com.msc.graalvmcontext.GraalVMContext;
import io.micronaut.core.annotation.Introspected;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.HostAccess;
import org.graalvm.polyglot.PolyglotAccess;
import org.graalvm.polyglot.Value;

@Introspected
public class Complement extends SequenceResourses implements ISequence{
    @Override
    public String run(String sequence) {
        String complement = "";
        String pythonscript="";

        //Create context instance
        Context context = GraalVMContext.getInstance();
        //Get python script from resources
        pythonscript = readResource("com/msc/pythonscripts/SeqComplement.py");
        //Execute eval to load python function
        context.eval("python",pythonscript);
        //Execute python function setting sequence
        Value pyfunction = context.getPolyglotBindings().getMember("complement");
        Value sqcomplement = pyfunction.execute(sequence);
        //Casting result as String
        complement = sqcomplement.asString();

        return complement;
    }
}