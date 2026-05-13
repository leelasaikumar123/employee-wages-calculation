import java.util.Random;

public class Employee{
    public static int isPartTime=1;
    public static int isFullTime=2;
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
        System.out.println("The Employee Can earn 160 if we work that day");
if(attendence==1){
            int workingType=random.nextInt(2)+1;
switch (workingType) {
    case 1:
        System.out.println("Today Employee is doing Part Time");
        break;

    default:
        System.out.println("Today Employee is Full Time");
        break;
}
}
    }
}