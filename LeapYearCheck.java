import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid year.");
        } else {
            int year = scanner.nextInt();
            String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 
                            ? "Leap Year" 
                            : "Not a Leap Year";
            System.out.println(year + " is a " + result);
        }
        
        scanner.close();
    }
}
