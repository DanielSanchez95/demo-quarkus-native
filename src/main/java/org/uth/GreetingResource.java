package org.uth;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @Path("/subdir")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String systemTime() {
        return "Systime: " + System.currentTimeMillis();
    }
}
