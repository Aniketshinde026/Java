import java.util.*;
class fn_printName{

public static void printName(String name){
    System.out.println("Your name is:"+name);
    return;

}

    public static void main(String args[]){
     System.out.print("Enter Your Name:");
     Scanner sc= new Scanner(System.in);
     String name;
     name=sc.next();
     printName(name);

    }
}