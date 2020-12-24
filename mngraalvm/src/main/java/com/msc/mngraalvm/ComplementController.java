package com.msc.mngraalvm;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/complement")
public class ComplementController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

    @Get("/complement")
    String complement(String s) {
        String result = "AGTACACTGG"; //HC for now
        return result;
    }
}