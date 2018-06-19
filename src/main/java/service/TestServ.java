package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Date;

@Path("sample")
public class TestServ {

    @Path("greet")
    @GET
    public String doGreet() {
        return "Hello Stranger, the time is "+ new Date();
    }

}
