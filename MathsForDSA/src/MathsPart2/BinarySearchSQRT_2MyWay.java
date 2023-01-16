package MathsPart2;

public class BinarySearchSQRT_2MyWay {
    public static void main(String[] args) {
         int n = 40;
         int p = 3;

        //System.out.println( sqrt(n , p));
        // By Pretty Printing
        System.out.printf("%.3f" , sqrt(n , p) );
    }
     // O(Log(n))
    static double sqrt( int n , int p){         // Correct One Boiiiiiii
        int s = 0;
        int e = n;

         double pre = 0 ;
         while ( s <= e){
            int m = s + (e - s) / 2;

            if (m * m == n){
                return m;
            }
            if (m * m > n){
                e = m-1;
            }else   {
                s = m + 1;
            }
            pre = e;
        }

        System.out.println(pre);

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
             while ( pre * pre <= n){
                 pre += incr;                      // Problem : Pre Not incrementing
             }
            pre -= incr;
             incr /= 10;
        }
        return pre;

    }

}
