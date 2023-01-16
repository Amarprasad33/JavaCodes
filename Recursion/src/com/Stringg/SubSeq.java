package com.Stringg;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
      //   subseq("", "abc");
        //subseqAscii("", "abc");


       System.out.println(subsetRet("", "abc"));
      //  System.out.println(subsetAsciiRet("", "abc"));
    }
         // debug and see the process
    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subsetRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetRet(p + ch, up.substring(1));
        ArrayList<String> right = subsetRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseqAscii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> subsetAsciiRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subsetAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subsetAsciiRet(p, up.substring(1));
        ArrayList<String> third = subsetAsciiRet(p+ (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
