package com.msc.mngraalvm;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/home")
public class HomeController {

    final private String _VERSION="v0.1";

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

    @Get("/about")
    String command(String command) {
        String result = "";

        if(command.toUpperCase().equals("V"))
            result = _VERSION;

        return result;
    }
}