/*
following pattern:
****
***
**
*

 */

import java.util.*;
class inverted_half_pyramid{
    public static void main(String[] args){

    int i,j;
    int n=4;//rows
   

    for(i=n;i>=1;i--){
        for(j=1;j<=i;j++){
            
            System.out.print("*");
            
        }
        System.out.println();
    }

    }
}