import java.util.*;
class if_else{
    public static void main(String args[]){
        System.out.println("Enter Your Age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are elligible for Voting.\nYES YOU CAN VOTE...!");
        }
        else{
            System.out.println("Your age is not fit for voting.\nNO YOU CAN NOT VOTE...!");
        }
    } 
}