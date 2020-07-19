package db;

import hero.Creator;
import hero.Hero;

import java.util.HashMap;
import java.util.Map;

public class HeroBase {
    private static Map<Integer, Hero> heroMap= new HashMap<>();
    private static Map <String, Creator> creatorMap = new HashMap<>();
    public static  Map<Integer,Hero> getHeroMap(){
        return heroMap;
    }
    public static Map <String,Creator> getCreatorMap(){
        return creatorMap;
    }
}
