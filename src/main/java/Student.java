import lombok.Builder;
import lombok.Data;


public class Student extends People{
    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, boolean isMale, int score){
        super(name,age,isMale);
        this.score = score;
    }
    @Override

    public String toString(){

        return "Student {"+ "Name:" + name + "/" + "Age:" + age + "/" + "IsMale:" + isMale + "/" + "Score:" + score + "}";

    }
}
