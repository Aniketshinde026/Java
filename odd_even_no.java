import java.util.*;
class odd_even_no{
    public static void main(String [] args){
        System.out.println("Enter the Number:");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if((n % 2) == 0){
            System.out.println("The entered number is EVEN...!");
        }
        else{
             System.out.println("The entered number is ODD...!");
        }
    }
}