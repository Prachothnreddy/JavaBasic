public class pattern {

    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                if(i == 1 || j == 2 || i == n || j == m) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    }
}