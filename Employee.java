import java.util.Random;

public class Employee{
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch"); 
        String company=args[0];
        int workingHours=Integer.parseInt(args[1]);
        int workingDays=Integer.parseInt(args[2]);
        int dailyWages=Integer.parseInt(args[3]);
        int partTimeHours=Integer.parseInt(args[4]);
        int fullTimeHours=Integer.parseInt(args[5]);
        // EmployeeWagesCalculation empWages=new EmployeeWagesCalculation(company,workingHours,workingDays,dailyWages,partTimeHours,fullTimeHours);
        // System.out.println(empWages.getMonthlySalarr());
        EmpWageBuilder empWageBuilder=new EmpWageBuilder();
        empWageBuilder.addCompanYWages(company, workingHours, workingDays, dailyWages, partTimeHours, fullTimeHours);
    }
}
class EmployeeWagesCalculation{
    public static Random random=new Random();
    public static int isFullTime=1;
    public static int isPartTime=2;
    private String company;
    private int workingHours;
    private int workingDays;
    private int dailyWages;
    private int partTimeHours;
    private int fullTimeHours;
    public EmployeeWagesCalculation(String company,int workingHours,int workingDays,int dailyWages,int partTimeHours,int fullTimeHours){
 this.company=company;
 this.workingHours=workingHours;
 this.workingDays=workingDays;
 this.dailyWages=dailyWages;
 this.partTimeHours=partTimeHours;
 this.fullTimeHours=fullTimeHours;
    }
   public int getMonthlySalarr(){
    int monthlySalary=0;
    int worked_days=0;
    int worked_hours=0;
     while(worked_days<workingDays && worked_hours<workingHours){    
 int attendence=random.nextInt(2);
if(attendence==1){
    int workingType=random.nextInt(2)+1;
switch (workingType) {
    case 1:
        monthlySalary=monthlySalary+fullTimeHours*dailyWages;
        worked_hours=worked_hours+fullTimeHours;
        break;

    case 2:
        monthlySalary=monthlySalary+partTimeHours*dailyWages;
        worked_hours=worked_hours+partTimeHours;
        break;
    default :
      break;    
}
}
else{
    monthlySalary=monthlySalary+0;
}
worked_days++;
 }
return monthlySalary;
   } 
}
class EmpWageBuilder{
    public void addCompanYWages(String company,int workingHours,int workingDays,int dailyWages,int partTimeHours,int fullTimeHours){
     EmployeeWagesCalculation empWages=new EmployeeWagesCalculation(company,workingHours,workingDays,dailyWages,partTimeHours,fullTimeHours);
     System.out.println(empWages.getMonthlySalarr());
    }
}