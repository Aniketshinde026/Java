import java.util.*;
class fn_sum{

public static int sum(int a,int b,int s){
    s=a+b;
    System.out.println("Sum of A and B :"+s);
    return 0;

}

    public static void main(String args[]){
     
     Scanner sc= new Scanner(System.in);
      int a,b,s;
      System.out.print("Enter value of A:");
     a=sc.nextInt();
     System.out.print("Enter value of B:");
     b=sc.nextInt();
     s=0;
     sum(a,b,s);

    }
}