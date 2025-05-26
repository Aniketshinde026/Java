import java.util.*;
class switch_statement{
    public static void main(String[] args){

        int button;
        Scanner sc =new Scanner(System.in);
      
        System.out.print("Enter The Button \n1\n2\n3\n4:");
          button=sc.nextInt();
          switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaskar");
            break;
            case 3: System.out.println("Namastey");
            break;
            case 4: System.out.println("Bonjour");
            break;
            default: System.out.println("Enter the Valid Button");
          }

    }
}