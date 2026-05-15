import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.LinkedHashMap;
public class Employee{
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch"); 
 Scanner scanner = new Scanner(System.in);
        boolean flag = true;
  EmpWageBuilder empWageBuilder=new EmpWageBuilder();
        while (flag) {
            System.out.println("Enter Company Name");
  String company=scanner.nextLine();
            System.out.print("Enter Working Hours: ");
            int workingHours = scanner.nextInt();
            System.out.print("Enter Working Days: ");
            int workingDays = scanner.nextInt();
            System.out.print("Enter Daily Wages: ");
            int dailyWages = scanner.nextInt();
            System.out.print("Enter Part Time Hours: ");
            int partTimeHours = scanner.nextInt();
            System.out.print("Enter Full Time Hours: ");
            int fullTimeHours = scanner.nextInt();
            empWageBuilder.addCompanYWages(company, workingHours, workingDays, dailyWages, partTimeHours, fullTimeHours);
            System.out.println("Do you want to continue? Type true or false: ");
            flag = scanner.nextBoolean();
            scanner.nextLine();
          
        }
        System.out.println("enter the company name you want to check the salary");
       String salaryOfCompanyName=scanner.nextLine();
        empWageBuilder.getSalaryOfACompany(salaryOfCompanyName);
    }
}
class CompanyEmpWage{
    public static Random random=new Random();
    public static int isFullTime=1;
    public static int isPartTime=2;
    private String company;
    private int workingHours;
    private int workingDays;
    private int dailyWages;
    private int partTimeHours;
    private int fullTimeHours;
    public CompanyEmpWage(String company,int workingHours,int workingDays,int dailyWages,int partTimeHours,int fullTimeHours){
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
   public String getCompany(){
    return company;
   }
}
interface  EmpWageBuilderInterface {
public void addCompanYWages(String company,int workingHours,int workingDays,int dailyWages,int partTimeHours,int fullTimeHours);
    
}
class EmpWageBuilder implements EmpWageBuilderInterface{
    public static List<CompanyEmpWage> list=new ArrayList<>();
    public static LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
    int numberOfCompany=0;
    @Override
    public void addCompanYWages(String company,int workingHours,int workingDays,int dailyWages,int partTimeHours,int fullTimeHours){
     list.add(new CompanyEmpWage(company,workingHours,workingDays,dailyWages,partTimeHours,fullTimeHours));
     map.put(company, workingHours*dailyWages);
     System.out.println("The Salary of an Emploee in "+ list.get(numberOfCompany).getCompany()+" is: " +list.get(numberOfCompany).getMonthlySalarr());
     numberOfCompany++;
    }
    public void getSalaryOfACompany(String companyName){
        if(!map.containsKey(companyName)){
            System.out.println("The Company You Searched isn't available");
        }
        else{
            System.out.println("The Salary of "+companyName+" is : "+map.get(companyName));
        }
    }
}