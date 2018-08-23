package com.hexaware;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.*;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/students")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})

public class MyResource {

    @GET
    public String getStudents() {
        System.out.println("Came inside the getStudents method ");
        return "Got it!";
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Student save(Student student) {
        System.out.println("Came inside the save method "+ student);
        return student;
    }   

    @GET
    @Path("/{id}")
    public Response getStudents(@PathParam("id") int id) {
        System.out.println("Came inside the getStudents method "+ id);
        //dao
        if(id == 1){
            return Response.ok().entity("Student not found").build();
        } else if (id == 2){
            return Response.status(Response.Status.BAD_REQUEST).entity("Student not found").build();
        } else{
            return Response.status(Response.Status.FORBIDDEN).entity("Student not found").build();
        }
    } 


}
