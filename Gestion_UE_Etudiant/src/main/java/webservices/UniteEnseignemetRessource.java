package webservices;

import metiers.ModuleBusiness;
import metiers.UniteEnseignementBusiness;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/unite")

public class UniteEnseignemetRessource {
    static UniteEnseignementBusiness help=new UniteEnseignementBusiness();
    @Path("/listunite")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){

        return  Response.status(200)
                .entity(help.getListeUE())
                .build();
    }
    @Path("/search")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response searchByDomaine(@QueryParam("domaine") String domaine){

        return Response
                .status(200).
                entity(help.getUEByDomaine(domaine)).build();
    }

}
