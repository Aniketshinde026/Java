/*
following pattern:
*
**
***
****

 */

import java.util.*;
class half_pyramid{
    public static void main(String[] args){

    int i,j;
    int n=4;//rows
   

    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            
            System.out.print("*");
            
        }
        System.out.println();
    }

    }
}