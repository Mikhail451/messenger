package serviceHero;

import db.HeroBase;
import hero.Creator;
import hero.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreatorService {
    private Map<String, Creator> cm = HeroBase.getCreatorMap();
    public CreatorService(){
        cm.put("Bob Kane",new Creator(83,"Bob Kane", "american", 1));
        cm.put("Stan Lee",new Creator(95,"Stan Lee", "american", 2));
    }
    public List<Creator> getAllCreators(){
        return new ArrayList<Creator>(cm.values());
    }
    public Creator getCreator(String name){
        return cm.get(name);
    }
    public Creator addCreator(Creator creator){
        creator.setId(cm.size()+1);
        cm.put(creator.getName(),creator);
        return creator;
    }
    public Creator updateCreator(Creator creator){
        if(creator.getName().isEmpty()){
            return null;
        }
        cm.put(creator.getName(),creator);
        return creator;
    }
    public Creator removeCreator(String name){
        return cm.remove(name);
    }
}
