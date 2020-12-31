package com.msc.mngraalvm;

import com.msc.model.Result;
import com.msc.model.ResultSequence;
import com.msc.sequences.Sequences;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

import javax.annotation.Nullable;

@Controller("/sequences")
public class SequencesController {

    private final ResultSequence result;

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

    @Get("/all")
    ResultSequence sequencesall(String s) {
        try{
            result.setComplement(Sequences.complement(s));
            result.setReversecomplement(Sequences.reverse_complement(s));
            result.setOk(true);
        }catch(Exception ex){
            result.setError(ex.getMessage());
        }
        return result;
    }

    public SequencesController(@Nullable ResultSequence result) {
        this.result = result;
    }
}