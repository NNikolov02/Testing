import lombok.Builder;
import lombok.Data;


public class Employee extends People {
    double daySalary;

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public Employee(String name, int age, boolean isMale, double daySalary) {
        super(name, age, isMale);
        this.daySalary = daySalary;
    }

    @Override
    public String toString(){

        return "Employee{"+ "Name:" + name + "/" + "Age:" + age + "/" + "IsMale:" + isMale + "/" + "SaySalary:" + daySalary + "}";

    }

    public double calculateOvertime(double hours) {
        double overtime = (daySalary / 8) * 1.5;
        double sum = 0.0;
        if (super.age <= 18) {
            return 0;






        }
        for(double i = 8;i< hours;i++){
            sum += overtime;
        }
        return sum;
    }
}
