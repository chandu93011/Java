public class Pattern {
    public static void main(String[] args) {
        Pattern5(5);

    }

    static void Pattern1(int n){
        for(int row=1;row<=n;row++){
            //for every row run the col
            for(int col=1;col<=n;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern2(int n){
        for(int row=1;row<=n;row++){
            //for every row run the col
            for(int col=1;col<=row;col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    static void Pattern3(int n){
        for(int row=n;row>=1;row--){
            for(int col=1;col<=row;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern4(int n){
        for(int row=1;row<=n;row++){
            int sum=0;
            for(int col=1;col<=row;col++) {
                sum=sum+col;
                System.out.print(col);
            }
            sum=0;
            System.out.println();
        }
    }
    static void Pattern5(int n) {
            for (int row = 1; row <= 2*n; row++) {
                if(row>n)
                    break;
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");

                }
                System.out.println();
            }
            for (int row =n+1; row >= 1; row--) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                System.out.println();

        }
    }

}
