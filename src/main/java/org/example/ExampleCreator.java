package org.example;

import hero.Creator;
import hero.Hero;
import serviceHero.CreatorService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("creators")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExampleCreator {

    private CreatorService creSer = new CreatorService();

    @GET
   public List<Creator> getCreators() {
       return creSer.getAllCreators();
   }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Creator addCreator(Creator creator){
        return creSer.addCreator(creator);
    }

    @PUT
    @Path("/{creatorName}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Creator updateCreatorInfo(@PathParam("creatorName") String name,Creator creator){
        creator.setName(name);
        return creSer.updateCreator(creator);
    }
    @DELETE
    @Path("/{creatorName}")
    @Produces(MediaType.APPLICATION_JSON)

    public void deleteCreator (@PathParam("creatorName") String name){
        creSer.removeCreator(name);
    }

    @GET
    @Path("/{creatorName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Creator getCreatorByName(@PathParam("creatorName") String name){
        return creSer.getCreator(name);
    }

}
