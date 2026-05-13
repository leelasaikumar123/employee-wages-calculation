import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
      System.out.println("welcome to line comparision program on main"); 
         Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        int x4=sc.nextInt();
        int y4=sc.nextInt();
        CalculationLine cl1=new CalculationLine(x1, y1, x2, y2);
CalculationLine cl2=new CalculationLine(x3, y3, x4, y4);

double lineOneHeight=cl1.lineHeight();
double lineTwoHeight=cl2.lineHeight();
        System.out.println("The Height of Line one is : "+lineOneHeight);
        System.out.println("the height of second line is : "+lineTwoHeight);
        if(Double.valueOf(lineOneHeight).equals(Double.valueOf(lineTwoHeight))){
         System.out.println("Both Lines Are Equal");
        }
        else{
            System.out.println("Both Lines Are Not Same");
         }
         int value=Double.valueOf(lineOneHeight).compareTo(Double.valueOf(lineTwoHeight));
        if(value>0){
            System.out.println("Line one is bigger");
        }
        else if(value==0){
            System.out.println("Both lines are equal");
        }
        else{
            System.out.println("Line two is IS bigger");
        }
        }
    }
        class CalculationLine{
           private int x1;
          private   int y1;
           private  int x2;
           private  int y2;
             CalculationLine(int x1,int y1,int x2,int y2){
                this.x1=x1;
                this.y1=y1;
                this.x2=x2;
                this.y2=y2;
            }
            public double lineHeight(){
                return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
            }

        }
    

