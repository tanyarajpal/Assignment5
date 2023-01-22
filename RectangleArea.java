import java.util.Scanner;

public class RectangleArea {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length and breadth of rectangle");
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();
            double area = length *breadth;
            System.out.println("Area of rectangle = " + area);
        }
}
