/*
following pattern:


          *****
         *****
        *****
       *****
      *****

 */
class solid_rhombus{
    public static void main(String[] args){

    int i,j;
    int n=5;//rows
    

    for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
            
            System.out.print(" ");
        }
         
         
        for(j=1;j<=5;j++){
            
            System.out.print("*");
        }
        System.out.println();
        

        
        
    }



    



    }
}