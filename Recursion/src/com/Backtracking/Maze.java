package com.Backtracking;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Maze {

    public static void main(String[] args) {
       // System.out.println(countWays(3,3));
//        CompletePath("", 3,3);

        //System.out.println(CompletePathRet("", 3,3));
       // System.out.println(CompletePathDiagonal("", 3 ,3));

        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        PathRestrictions("", maze, 0,0);


    }

    static int countWays(int r, int c){
        if (r == 1 || c == 1 ){
            return 1;
        }
        int left = countWays(r-1, c);
        int right = countWays(r, c-1);
        return left + right;
    }

    static void CompletePath(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if (r > 1){
            CompletePath(p + 'D', r-1, c);
        }
        if (c > 1){
            CompletePath(p + 'R', r, c-1);
        }
    }

    static ArrayList<String> CompletePathRet(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
            ArrayList<String> ans = new ArrayList<>();

        if (r > 1){
            ans.addAll(CompletePathRet(p + 'D', r-1, c));
        }
        if (c > 1){
            ans.addAll(CompletePathRet(p + 'R', r, c-1));
        }
        return ans;
    }

    static ArrayList<String> CompletePathDiagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if (r > 1 && c > 1){
            ans.addAll(CompletePathDiagonal(p + 'D', r-1, c-1 ));
        }
        if (r > 1){
            ans.addAll(CompletePathDiagonal(p + 'V', r-1, c));
        }
        if (c > 1){
            ans.addAll(CompletePathDiagonal(p + 'H', r, c-1));
        }
        return ans;
    }

    static void PathRestrictions(String p, boolean[][] maze, int r, int c){
        if (r == maze.length - 1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){          // if false given ! of that is true and its recursion stopping condition
            return;
        }

        if (r < maze.length - 1){
            PathRestrictions(p + 'D', maze, r+1, c);
        }
        if (c < maze[0].length - 1){
            PathRestrictions(p + 'R', maze, r, c+1);
        }
    }




}
