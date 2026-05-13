import java.util.Random;

public class Employee{
    public static int isPartTime=1;
    public static int isFullTime=2;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int monthlySalary=0;
        Random random=new Random();
 for(int i=0;i<20;i++){     
 int attendence=random.nextInt(2);
if(attendence==1){
            int workingType=random.nextInt(2)+1;
switch (workingType) {
    case 1:
        monthlySalary=monthlySalary+20*8;
        break;

    default:
        System.out.println("Today Employee is Full Time");
        break;
}
}
else{
    monthlySalary=monthlySalary+0;
}
 }
 System.out.println("In 20 Days he earned "+monthlySalary);
    }
}