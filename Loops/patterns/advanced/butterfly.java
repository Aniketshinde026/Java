/*
following pattern:
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 */
class butterfly{
    public static void main(String[] args){

    int i,j;
    int n=5;//rows
    

    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            
            System.out.print("*");
        }
         
         int spaces=2*(n-i);
        for(j=1;j<=spaces;j++){
            
            System.out.print(" ");
        }

        for(j=1;j<=i;j++){
            
            System.out.print("*");
        }
        System.out.println();
        
    }



    for(i=n;i>=1;i--){
        for(j=1;j<=i;j++){
            
            System.out.print("*");
        }
         
         int spaces=2*(n-i);
        for(j=1;j<=spaces;j++){
            
            System.out.print(" ");
        }

        for(j=1;j<=i;j++){
            
            System.out.print("*");
        }
        System.out.println();
        
    }



    }
}