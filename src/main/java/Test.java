import db.HeroBase;
import hero.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Hero> heroes = new HashMap<>();
        heroes.put(1, new Hero(1, "Batman", "Money", 32));
        heroes.put(2, new Hero(2, "SpiderMan", "Web", 18));
        int age = 32;
        for (int i = 1; i <= heroes.size(); i++) {
            if (age == heroes.get(i).getAge()) {
                System.out.println(heroes.get(i));
            }

        }
    }
}
