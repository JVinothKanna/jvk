import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        /*for(int i=5 ; i > 0 ; i--){
            int temp = i-1;
            for(int j = 5 ; j > 0 ; j--,temp--){
                if(temp > 0){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }*/
        /*int n = 101;
        int i = 1;

        while(i <= n){
            System.out.print(i + " ");
            i = i+2;
        }*/
        ArrayList<Integer> nList = new ArrayList<>();
        /*nList.add(36657);
        nList.add(22032);
        nList.add(74681);
        nList.add(3077);
        nList.add(20485);
        nList.add(60852);
        nList.add(10938);
        nList.add(4141);
        nList.add(30707);
        nList.add(64336);
        nList.add(14714);
        nList.add(1823);
        nList.add(41492);
        nList.add(19470);
        nList.add(12877);
        nList.add(8170);
        nList.add(13813);
        nList.add(259);
        nList.add(11065);
        nList.add(27);
        nList.add(56911);
        nList.add(23218);
        nList.add(5);*/
        //nList.add(10938);
        //test(1,nList);

       /*nList.add(0);
       nList.add(100);
        test2(2,nList);*/
        pattern();


    }

    public static void test(int TCase, ArrayList<Integer> nlist){

        int i = 1;
        Iterator<Integer> iterator = nlist.iterator();
        while(i<= TCase){
            int n = iterator.next();
            int last = n%10;
            int frist = n;
            while(n > 10 && frist >= 10){
                frist = frist/10;
            }
            System.out.println(frist + " " + last);
            i++;
        }
    }

    public static void test2(int TCase, ArrayList<Integer> nlist){

        int i = 1;
        Iterator<Integer> iterator = nlist.iterator();
        while(i<= TCase){
            int n = iterator.next();

            int total = 0;
            if(n == 0){
                total = 1;
            }else{
                while(n > 0){
                    total++;
                    n=n/10;
                }
            }

            System.out.println(total);
            i++;
        }
    }

    public static void pattern(){
        int n = 4;

        for(int i = 1 ; i <= n ; i++){
            System.out.print("*");

            for(int j = 1;j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

        }



    }


}