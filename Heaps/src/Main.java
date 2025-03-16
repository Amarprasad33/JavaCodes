import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println(areaOfIntersection(x1, y1, r1, x2, y2, r2));
    }

    static double areaOfIntersection(int centerX1, int centerY1, int radius1, int centerX2, int centerY2, int radius2)
    {
        double Pi = 3.14;
        double d, alpha, beta, a1, a2;
        double ans;

        // Calculate the euclidean distance
        // between the two points
        d = Math.sqrt((centerX2 - centerX1) * (centerX2 - centerX1)
                + (centerY2 - centerY1) * (centerY2 - centerY1));

        if (d > radius1 + radius2)
            ans = 0;

        else if (d <= (radius1 - radius2) && radius1 >= radius2)
            ans = (int)Math.floor(Pi * (double)radius2 * (double)radius2);

        else if (d <= (radius2 - radius1) && radius2 >= radius1)
            ans = (int)Math.floor(Pi * (double)radius1 * (double)radius1);

        else {
            alpha = Math.acos((radius1 * radius1 + d * d - radius2 * radius2) / (2 * radius1 * d)) * 2;
            beta = Math.acos((radius2 * radius2 + d * d - radius1 * radius1) / (2 * radius2 * d)) * 2;
            a1 = 0.5 * beta * radius2 * radius2 - 0.5 * radius2 * radius2 * Math.sin(beta);
            a2 = 0.5 * alpha * radius1 * radius1 - 0.5 * radius1 * radius1 * Math.sin(alpha);
            ans = a1 + a2;
        }

        return ans;
    }
}