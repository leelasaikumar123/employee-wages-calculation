import java.util.Random;

public class Employee{
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        Random random=new Random();
        int attendence=random.nextInt(2);
        System.out.println(attendence);
        if(attendence==0){
            System.out.println("Employee is absent");
        }
        else{
            System.out.println("Employee is Present");
        }
    }
}