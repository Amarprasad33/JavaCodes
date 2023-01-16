package com.Stringg;

public class StringSkipA {
    public static void main(String[] args) {
      // skip("", "baccdah");
      //  System.out.println( skipWithoutargs("baccdah"));

    //    System.out.println( skipApple("bacapplecdah"));

        System.out.println( skipAppifNotApple("bacapplecdah"));


    }

    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            skip(p, up.substring(1));
        }else {
            skip(p + ch, up.substring(1));
        }
    }
// without taking variable in args creating a new variable in the function
    static String skipWithoutargs( String up){
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            return skipWithoutargs( up.substring(1));
        }else {
           return ch + skipWithoutargs(up.substring(1));
        }
    }

    //if we have to skip a word

    static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple( up.substring(5));
        }else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
      // skip app if its not apple
    static String skipAppifNotApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppifNotApple( up.substring(3));
        }else {
            return up.charAt(0) + skipAppifNotApple(up.substring(1));
        }
    }


}
