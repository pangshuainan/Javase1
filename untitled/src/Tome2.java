public class Tome2 {
    public static void main(String[] args) {
//空心正方形案例
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <6 ; j++) {
                if (j==0|| j==5){
                    System.out.print("* ");
                }else{
                   if (i ==0 || i ==5){
                       System.out.print("* ");
                   }else{
                       System.out.print("  ");
                   }
                }
            }
            System.out.println();
        }

    }
}
