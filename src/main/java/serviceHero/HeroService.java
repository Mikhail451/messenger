package serviceHero;

import db.HeroBase;
import hero.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HeroService {


    private Map<Integer, Hero> heroes= HeroBase.getHeroMap();
    public HeroService(){
        heroes.put(1,new Hero(1,"Batman","Money",32));
        heroes.put(2,new Hero(2,"SpiderMan","Web",18));
    }
    public List<Hero> getAllHeroes(){
        return new ArrayList<Hero>(heroes.values());
    }

    public ArrayList<Hero> getHeroesByAge(int age) {
        ArrayList<Hero> her = new ArrayList<>();
      for (int i =1; i <= heroes.size(); i++){
          if (age == heroes.get(i).getAge()){
              her.add(heroes.get(i));
              System.out.println(heroes.get(i));
          }
      }
      return her;
    }
    public List<Hero> getAllHeroPaginated(int start, int size){
        ArrayList <Hero> list= new ArrayList<>(heroes.values());
        return list.subList(start,start+size);
        
    }

    public Hero getHero(Integer id){
        return heroes.get(id);
    }
    public Hero addHero(Hero hero){
        hero.setId(heroes.size()+1);
        heroes.put(hero.getId(),hero);
        return hero;
    }
    public Hero updateHero(Hero hero){
        if(hero.getId()<=0){
            return null;
        }
        heroes.put(hero.getId(),hero);
        return hero;
    }
    public Hero removeHero(Integer id){
        return heroes.remove(id);
    }
}
