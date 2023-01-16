package com.Set1;

public class rupees {
    public static void main(String[] args) {
        int Ru1= 1, Ru2=2, Ru5=5, Ru10=10, Ru20=20, Ru50=50, Ru100=100;
        fin(205);

}
    static void fin(int r){
        int rem=0;
        int div=0;
        do{
            if(r>=100){
                rem = r%100;
                div = r/100;
                r = rem;
            }else if(r>=50){
                rem = r%50;
                div = div + r/50;
                r = rem;
            }else if(r>=20){
                rem = r%20;
                div = div + r/20;
                r = rem;
            }else if(r>=10){
                rem = r%10;
                div = div + r/10;
                r = rem;
            }else if(r>=5){
                rem = r%5;
                div = div + r/5;
                r = rem;
            }else if(r>=2){
                rem = r%2;
                div = div + r/2;
                r = rem;
            }else if(r>=1){
                rem = r%1;
                div = div + r/1;
                r = rem;
            }
        }while (rem >0);

        System.out.println( div);
    }
}
