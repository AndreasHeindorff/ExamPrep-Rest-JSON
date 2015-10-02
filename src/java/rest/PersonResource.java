/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import TestData.RandomTestData;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("person")
public class PersonResource {

    Gson gson;
    
    @Context
    private UriInfo context;

    public PersonResource() {
         gson = new GsonBuilder()
                .setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .create();
    }

    @GET
    @Path("/{n}/{p}")
    @Produces("application/json")
    public Response getJson(@PathParam("n") int n, @PathParam("p") String p) {
        return Response.status(Response.Status.OK).entity(RandomTestData.getData(n, p)).build();
    }
}
