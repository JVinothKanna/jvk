public class Patterns {
    public static void main(String[] args) {
        //reverseStairCase(5);

       /* int n=5;
          for(int row =1 ; row <= n; row++){
            for(int col = 1; col<= row; col++){
                if(col%2 != 0){
                    System.out.print(col);
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }*/

        /*int n=4;
           for(int row = 1; row <=n ; row++){
            for(int col = 1,spc = n-row; col <= n-row+1; col++, spc--){
                System.out.print(col);
                if(spc >0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        /*int n=5;
        for(int row =n; row >= 1; row--){
            for(int str =1; str <= row; str++){
                System.out.print("*");
            }
            for(int spc =1; spc <= ((n*2) - (row*2)); spc++){
                System.out.print(" ");
            }
            for(int str =1; str <= row; str++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        int n =6;
        for(int row =n,i=0; row > 0; row--,i++){
                if(row == n || row == 1 ){
                    for(int cols = row; cols >= 1; cols-- ){
                        System.out.print("*");
                    }
                }else{
                    System.out.print("*");
                    for(int spcClo=1; spcClo <=(n-i)-2 ; spcClo++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
        }
    }

    public static void reverseStairCase(int n){
        for(int row=1; row<= n; row++){
            for(int col=1; col<= n-row; col++){
                 System.out.print(" ");
            }
            for(int colStr=1; colStr <=row;colStr++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
