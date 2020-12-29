package com.msc.mngraalvm;

import com.msc.model.Result;
import com.msc.sequences.Sequences;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

import javax.annotation.Nullable;

@Controller("/reverseComplement")
public class ReverseComplementController {

    private final Result result;

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

    @Get("/reversecomplement")
    Result reversecomplement(String s) {
        try{
            result.setResult(Sequences.reverse_complement(s));
            result.setOk(true);
        }catch(Exception ex){
            result.setError(ex.getMessage());
        }
        return result;
    }

    public ReverseComplementController(@Nullable Result result) {
        this.result = result;
    }
}