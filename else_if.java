import java.util.*;
class else_if{
    public static void main(String[] args){
        System.out.println("Enter A:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt();

        if(a==b){
            System.out.println("A and B are EQUAL...!");
        }
         else if(a<b){
            System.out.println("A is LESS THAN B...!");
        }
        else if(a>b){
            System.out.println("A GREATER THAN B...!");
        }
    }
}