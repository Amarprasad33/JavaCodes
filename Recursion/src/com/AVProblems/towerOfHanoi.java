package com.AVProblems;

import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for no. of Disks in tower of Hanoi --");
        int n = sc.nextInt();
        int source = 1;
        int helper = 2;
        int destination = 3;
        solve(n, source, helper, destination);
    }

    // In the function solve: s -> Source, d -> Destination, h -> helper
    private static void solve(int n, int s, int d, int h) {
        if(n == 1){
            System.out.println("Moving " + s + " --to-- " +  d);
            return;
        }
        solve(n-1, s, h, d);
        System.out.println("Moving " + n + "plates" + "from" + s + "--to-- " +  d);
        solve(n-1, h, d, s);
    }
}
