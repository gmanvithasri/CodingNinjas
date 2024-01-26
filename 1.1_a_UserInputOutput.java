import java.util.Scanner;

public class UserOutputInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        
        int result = classifyCharacter(inputChar);
        
        System.out.println("Output: " + result);
        
        scanner.close();
    }
    
    public static int classifyCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            // Uppercase alphabet
            return 1;
        } else if (ch >= 'a' && ch <= 'z') {
            // Lowercase alphabet
            return 0;
        } else {
            // Not an alphabet
            return -1;
        }
    }
}
