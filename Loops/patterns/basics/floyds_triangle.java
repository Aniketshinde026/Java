/*
following pattern:
*
**
***
****

 */
class floyds_triangle{
    public static void main(String[] args){

    int i,j;
    int n=5;//rows
    int a=1;

    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            
            System.out.print(a+" ");
            a++;//a=a+1;
            
        }
        System.out.println();
    }

    }
}