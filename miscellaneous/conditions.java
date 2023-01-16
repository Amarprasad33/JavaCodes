import java.util.*;

 class Conditions{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        if (age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
        sc.close();
    }
}