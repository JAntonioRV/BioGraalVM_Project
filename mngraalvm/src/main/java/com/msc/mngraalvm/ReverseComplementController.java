package com.msc.mngraalvm;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/reverseComplement")
public class ReverseComplementController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

    @Get("/reversecomplement")
    String reversecomplement(String s) {
        String result = "GCATATCGATC"; //HC for now
        return result;
    }
}