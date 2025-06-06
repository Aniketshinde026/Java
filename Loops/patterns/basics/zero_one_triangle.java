/*
following pattern:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */
class zero_one_triangle{
    public static void main(String[] args){

    int i,j;
    int n=5;//rows


    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            int sum=i+j;
            if(sum % 2==0){
            System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        
            
        }
        System.out.println();
    }

    }
}