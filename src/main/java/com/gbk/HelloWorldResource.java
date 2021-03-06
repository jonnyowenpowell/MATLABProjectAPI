package com.gbk;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Author: jonny.
 */

@Path("hello")
public class HelloWorldResource {

    @GET
    @Produces("text/plain")
    public String sayHelloWorld(@QueryParam("name") String name) {
        if ( name!=null ) {
            return "Hello, " +name;
        }
        return "Hello buddy!";
    }

}
