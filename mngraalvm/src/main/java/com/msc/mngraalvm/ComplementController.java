package com.msc.mngraalvm;

import com.msc.model.Result;
import com.msc.sequences.Sequences;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Post;

import javax.annotation.Nullable;

@Controller("/complement")
public class ComplementController {

    private final Result result;

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

    @Post("/complement")
    Result complement(String s) {
        try{
            result.setResult(Sequences.complement(s));
            result.setOk(true);
        }catch(Exception ex){
            result.setError(ex.getMessage());
        }
        return result;
    }

    public ComplementController(@Nullable Result result) {
        this.result = result;
    }
}