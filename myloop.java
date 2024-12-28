import java.util.Scanner;

public class myloop {
    public static void main(String[] args) {
        int x, y;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        x = obj.nextInt();
        
        System.out.print("Enter the value of y: ");
        y = obj.nextInt();
        
        for (int i = 1; i <= y; i++) {
            System.out.println(x);
        }
        
        obj.close(); // Close the scanner to prevent resource leaks
    }
}
