package hero;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hero {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String ability;
    private int age;
    public Hero(){

    }

    public Hero(int id,String name,String ability,int age){
        this.id=id;
        this.name=name;
        this.ability=ability;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
