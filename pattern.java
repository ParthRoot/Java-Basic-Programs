public class pattern {
    public static void main(String[] args) {
        System.out.println("print Pattern-1");
        pattern obj = new pattern();
        int m = 5;
        obj.pattern1(m);

        System.out.println("Pattern - 2");

        obj.pattern2(m)

    }

    void pattern1(int m){
        for(int i=0;i<m;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    void pattern2(int m){
        for(int i=m-1;i>=0;i--){

            for(int j=0;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println("");

        }
    }

}
