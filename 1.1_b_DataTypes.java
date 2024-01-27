import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int ans = dataTypes(type);
        
        if (ans != -1) {
            System.out.println(ans);
        } else {
            System.out.println("Invalid data type");
        }

        scanner.close();
    }

    public static int dataTypes(String dataType) {
        switch (dataType) {
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            case "Character":
                return 1;
            default:
                return -1; // Invalid data type
        }
    }
}
