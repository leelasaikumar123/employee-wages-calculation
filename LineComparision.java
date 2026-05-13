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
        double lineOneHeight=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double lineTwoHeight=Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
        System.out.println("The Height of Line one is : "+lineOneHeight);
        System.out.println("the height of second line is : "+lineTwoHeight);
        if(Double.valueOf(lineOneHeight).equals(Double.valueOf(lineTwoHeight))){
         System.out.println("Both Lines Are Equal");
        }
         else{
            System.out.println("Both Lines Are Not Same");
         }
        }
    }

