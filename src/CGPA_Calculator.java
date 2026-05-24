import java.util.Scanner;

public class CGPA_Calculator {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Subjects: ");
        int subjects = Integer.valueOf(sc.nextLine());
        double totalPoints = 0;
        int totalCredits = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Subject: " + i + " Grade Points(0.0-4.0): ");
            double grade = (double) Double.valueOf(sc.nextLine());
            System.out.print("Subject: " + i + " and its Credit Hours: " );
            int credits = Integer.valueOf(sc.nextLine());
            totalPoints  = 1.0*grade*credits;
            totalCredits += credits;
        }
        double CGPA = totalPoints/totalCredits;
        System.out.printf("Your CGPA is: %.2f%n", CGPA);

    }
}


