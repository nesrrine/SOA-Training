package webservices;

import entities.Module;
import metiers.ModuleBusiness;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/module")
public class ModulesRessources {
    static   ModuleBusiness help=new ModuleBusiness();
@Path("/list")
@GET
@Produces(MediaType.APPLICATION_JSON)
   public Response getAll(){

    return  Response.status(200)
            .entity(help.getAllModules())
            .build();
}
    @Path("/add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(Module module){

            return Response.ok(help.addModule(module)).build();
        }


    @Path("/delete/{id}")
    @DELETE

    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") String matricule){

        return Response.ok(help.deleteModule(matricule)).build();
    }
    @Path("/update/{id}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") String matricule,Module module){

        return Response.ok(help.updateModule(matricule,module)).build();
    }

}
