/*
following pattern:
1
12
123
1234
12345

 */
class no_half_pyramid{
    public static void main(String[] args){

    int i,j;
    int n=5;//rows
   

    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            
            System.out.print(j);
            
        }
        System.out.println();
    }

    }
}