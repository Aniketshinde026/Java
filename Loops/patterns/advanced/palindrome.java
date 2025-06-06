/*
following pattern:
  

 */
class palindrome{
    public static void main(String[] args){

    int i,j;
    int n=5;//rows
   

    for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
            
            System.out.print(" ");
            
        }
        for(j=1;j>=1;j--){
            
            System.out.print(j);
            
        }

         for(j=2;j<=i;j++){
            
            System.out.print(j);
            
        }


        System.out.println();
    }

    }
}