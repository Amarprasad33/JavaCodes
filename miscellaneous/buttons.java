import java.util.*;

 public class buttons {
     public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int num = sc.nextInt();

        if(num==1){
            System.out.println("Hello");
        }else if(num==2){
            System.out.println("Namaste");
        }else if(num==3){
              System.out.println("Bonjour");
        }else{
        System.out.println("Invalid Button");
        }
        sc.close();
    }
    
}
