import java.util.*;
class calculator{
    public static void main(String[] args){

        int a;
        int b;
        Scanner sc =new Scanner(System.in);
      
        System.out.print("Enter the value of A:");
        a=sc.nextInt();
        System.out.print("Enter the value of B:");
        b=sc.nextInt();

        System.out.println("Enter the operator:\n 1 -> +\n2 -> -\n3 -> *\n4 -> /\n5 -> %\nThe Operator:");
        int operator = sc.nextInt();


       /**
        * 1 -> +
        * 2 -> -
        * 3 -> *
        * 4 -> /
        * 5 -> %
        */


 
          switch(operator){
            case 1: System.out.println("The addition of A and B is "+(a+b));
            break;
            case 2: System.out.println("The substraction of A and B is "+(a-b));
            break;
            case 3: System.out.println("The multiplication of A and B is "+(a*b));
            break;
            case 4: System.out.println("The division of A and B is "+(a/b));
            break;
            case 5: System.out.println("The modulus of A and B is "+(a%b));
            break;
            default: System.out.println("Select the Valid Operator ");
          }

    }
    
}