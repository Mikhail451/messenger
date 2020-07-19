package hero;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Creator {
    private int age;
    private int id;
    private String name;
    private String nationality;
    public Creator (){}
    public Creator(int age, String name, String nationality, int id) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.nationality = nationality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
