
import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class People {
    String name;
    int age;
    boolean isMale;

    public People(String name,int age,boolean isMale){
        this.age = age;
        this.isMale = isMale;
        this.name = name;
    }
    public String toString(){
        return "Person {"+ "Name:" + name +
                "/" + "Age:" + age +
                "/" + "IsMale:" + isMale +
                "/" +
                "}";


    }
}
