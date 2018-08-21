package com.hexaware;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class MyResource {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public String getStudents() {
        System.out.println("Came inside the getStudents method ");
        return "Got it!";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String save(String str) {
        System.out.println("Came inside the save method "+ str);
        return str;
    }    
}
