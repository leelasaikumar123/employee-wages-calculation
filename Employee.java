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
            System.out.print("Enter hourly Wages: ");
            int hourlyWage = scanner.nextInt();
            System.out.print("Enter Part Time Hours: ");
            int partTimeHours = scanner.nextInt();
            System.out.print("Enter Full Time Hours: ");
            int fullTimeHours = scanner.nextInt();
            empWageBuilder.addCompanYWages(company, workingHours, workingDays, hourlyWage, partTimeHours, fullTimeHours);
            System.out.println("Do you want to continue? Type true or false: ");
            flag = scanner.nextBoolean();
            scanner.nextLine();
          
        }
        flag =true;
        while (flag) {
        System.out.println("enter the company name you want to check the salary");
       String salaryOfCompanyName=scanner.nextLine();
        empWageBuilder.getSalaryOfACompany(salaryOfCompanyName);
        System.out.println("If You Still Want to search Salary of a particular company type true or else to end the searching type false");
        flag=scanner.nextBoolean();
        scanner.nextLine();
        }
    }
}
class CompanyEmpWage{
    public static Random random=new Random();
    public static int isFullTime=1;
    public static int isPartTime=2;
    private String company;
    private int workingHours;
    private int workingDays;
    private int hourlyWage;
    private int partTimeHours;
    private int fullTimeHours;
    public CompanyEmpWage(String company,int workingHours,int workingDays,int hourlyWage,int partTimeHours,int fullTimeHours){
 this.company=company;
 this.workingHours=workingHours;
 this.workingDays=workingDays;
 this.hourlyWage=hourlyWage;
 this.partTimeHours=partTimeHours;
 this.fullTimeHours=fullTimeHours;
    }
   public List<Integer> getMonthlySalarr(){
    int monthlySalary=0;
    int worked_days=0;
    int worked_hours=0;
    List<Integer> dailyWagesList =new ArrayList<>();
     while(worked_days<workingDays && worked_hours<workingHours){    
 int attendence=random.nextInt(2);
if(attendence==1){
    int workingType=random.nextInt(2)+1;
switch (workingType) {
    case 1:
        monthlySalary=monthlySalary+fullTimeHours*hourlyWage;
        worked_hours=worked_hours+fullTimeHours;
        dailyWagesList.add(fullTimeHours*hourlyWage);
        break;

    case 2:
        monthlySalary=monthlySalary+partTimeHours*hourlyWage;
        worked_hours=worked_hours+partTimeHours;
        dailyWagesList.add(partTimeHours*hourlyWage);
        break;
    default :
      break;    
}
}
else{
    monthlySalary=monthlySalary+0;
    dailyWagesList.add(0);
}
worked_days++;
 }
return dailyWagesList;
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
    public void addCompanYWages(String company,int workingHours,int workingDays,int hourlyWage,int partTimeHours,int fullTimeHours){
     list.add(new CompanyEmpWage(company,workingHours,workingDays,hourlyWage,partTimeHours,fullTimeHours));
     map.put(company, workingHours*hourlyWage);
    List<Integer> dailyWagesList=list.get(numberOfCompany).getMonthlySalarr();
    //  System.out.println("The Salary of an Emploee in "+ list.get(numberOfCompany).getCompany()+" is: " +list.get(numberOfCompany).getMonthlySalarr());
    System.out.println("The Daily Wages Earned by an employee day by day");
 displayDailyWages(dailyWagesList);
 System.out.println("In a Month He Earned ");
 displayMonthlyWages(dailyWagesList);
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

    public  void displayDailyWages(List<Integer> dailyWages){
    for(int i=0;i<dailyWages.size();i++){
        System.out.println("On "+(i+1)+" Day He Earned "+(dailyWages.get(i)) +" $");
    }
    } 
    public void displayMonthlyWages(List<Integer> dailyWages){
        int salary=0;
        for(int wages:dailyWages){
            salary=salary+wages;
        }
        System.out.println("In A Month He Earned "+salary+" $");
    }
}