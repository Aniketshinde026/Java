

//Print all even numbers till n.
import java.util.*;
class hw_one{
    public static void main(String[] args) {
        int n,even;
        System.out.println("Enter any Number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i;
        System.out.println("The Even Numbers upto "+n+" are as follows:");
        for(i=1;i<=n;i++){
            if(i%2==0){
                even=i;
                System.out.println(even);
            }
            
        }
}
}