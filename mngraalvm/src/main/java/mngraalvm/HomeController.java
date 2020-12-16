package mngraalvm;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/home")
public class HomeController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}