package org.example;

import hero.Hero;
import serviceHero.HeroService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("hero")
public class Example {
    HeroService hs=new HeroService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hero> getHeroes(@QueryParam("age") int age, @QueryParam("start") int start,@QueryParam("size") int size){
        if (age > 0) {
            return hs.getHeroesByAge(age);
        }
        if (start>=0 && size>0){
            return hs.getAllHeroPaginated(start,size);
        }
        return hs.getAllHeroes();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Hero addHero(Hero hero){
        return hs.addHero(hero);
    }

    @PUT
    @Path("/{heroId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Hero updateHeroInfo(@PathParam("heroId") Integer id,Hero hero){
        hero.setId(id);
        return hs.updateHero(hero);
    }
    @DELETE
    @Path("/{heroId}")
    @Produces(MediaType.APPLICATION_JSON)

    public void deleteHero (@PathParam("heroId") Integer id){
        hs.removeHero(id);
    }

    @GET
    @Path("/{heroId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Hero getHeroById(@PathParam("heroId") Integer id){
        return hs.getHero(id);
    }

}
