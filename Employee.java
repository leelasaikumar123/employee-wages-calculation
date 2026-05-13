import java.util.Random;

public class Employee{
    public static int isPartTime=1;
    public static int isFullTime=2;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int monthlySalary=0;
        Random random=new Random();
        int worked_hours=0;
        int worked_days=0;
 while(worked_days<20 && worked_hours<100){    
 int attendence=random.nextInt(2);
if(attendence==1){
            int workingType=random.nextInt(2)+1;
switch (workingType) {
    case 1:
        monthlySalary=monthlySalary+20*4;
        worked_hours=worked_hours+4;
        break;

    default:
        monthlySalary=monthlySalary+20*8;
        worked_hours=worked_hours+8;
        break;
}
}
else{
    monthlySalary=monthlySalary+0;
}
worked_days++;
 }
 System.out.println("In 20 Days he earned "+monthlySalary);
    }
}