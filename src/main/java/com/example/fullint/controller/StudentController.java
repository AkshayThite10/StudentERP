package com.example.fullint.controller;

import com.example.fullint.Service.StudentService;
import com.example.fullint.bean.Student;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;


@Path("student")
public class StudentController {

    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN) //return type
    @Consumes(MediaType.APPLICATION_JSON) //parameter
    public Response addStudent(Student student) throws URISyntaxException {
        System.out.println("In controller");
        boolean val = new StudentService().addStudent(student); //in service
        if (val == true)
            return Response.ok().build();
        else
            return Response.status(203).build();
    }
}