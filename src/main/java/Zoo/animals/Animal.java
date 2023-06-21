package Zoo.animals;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Animal {

    String name;
    int age;
    int mass;

    public Animal(String name,int age,int mass){
        this.age = age;
        this.name = name;
        this.mass = mass;

    }




    public String toString() {
        return "{" +"Name:" + name +
                "/" + "Age:" + age +
                "/" + "mass:" + mass +
                "/" +
                "}";
    }


}
