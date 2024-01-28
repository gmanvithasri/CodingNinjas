import java.util.Scanner;

public class 1.1_c_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        String result = compareIfElse(a, b);
        
        System.out.println(result);
        
        scanner.close();
    }
    
    public static String compareIfElse(int a, int b) {
        if (a < b) {
            return "smaller";
        } else if (a > b) {
            return "greater";
        } else {
            return "equal";
        }
    }
}
