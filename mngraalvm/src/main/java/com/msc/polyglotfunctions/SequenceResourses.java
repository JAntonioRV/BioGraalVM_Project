package com.msc.polyglotfunctions;

import com.msc.mngraalvm.HomeController;
import io.micronaut.core.annotation.Introspected;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Introspected
public class SequenceResourses {
    public String readResource(String resource){
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(HomeController.class.getResourceAsStream("/"+resource)));
            String line = null;

            String data = "";
            while((line = in.readLine()) != null) {
                if(data!="")data+="\n";
                data+=line;
            }
            return data;
        }catch(Exception exception){
            exception.printStackTrace();
            return "";
        }
    }
}
