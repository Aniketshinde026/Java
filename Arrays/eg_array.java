
/* Problem: Take an array as input from the user .Search for given number x and print the index at which it occurs.*/

import java.util.*;

class eg_array{

    public static void main(String[] args) {
         int n,i;
        System.out.println("Enter The Size Of Array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the"+n+"Arrat elements:");

        int[] num=new int[n];

        for(i=0;i<n;i++){
            num[i]=sc.nextInt();

        }

       

      System.out.println("The Array elements are:");
        for(i=0;i<n;i++){
            System.out.println(num[i]);

        }
         int x=sc.nextInt();
         System.out.println("Enter the u want to search:");
         for(i=0;i<n;i++){

            if(num[i]==x){
            System.out.println(x+"found at"+i);
            }

        }

        
        
    }
}