package com.msc.mngraalvm;

import com.msc.model.About;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

import javax.inject.Inject;

@Controller("/home")
public class HomeController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

    @Get("/about")
    About command(String command) {
        About about = null;

        if(command.toUpperCase().equals("V"))
            about = new About();

        return about;
    }
}