package Zoo.persons;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employe {

    String name;
    int age;

    public Employe(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "{" +"Name:" + name +
                "/" + "Age:" + age +
                "/" +
                "}";
    }
}
