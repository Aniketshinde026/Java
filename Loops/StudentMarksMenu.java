

/*
Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)


ChatGPT said:
Here's a menu-driven Java program based on your requirements, using a do-while loop:

Why do-while?
Because you want to keep asking the user to input marks at least once and then continue based on their choice (1 to continue, 0 to stop). do-while guarantees the loop runs at least once before checking the condition.

*/


import java.util.Scanner;

public class StudentMarksMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 to input student marks or 0 to stop: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well\nBecause marks don’t matter but our effort does.");
                } else {
                    System.out.println("Invalid marks entered! Please enter between 0 and 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice! Please enter 1 or 0.");
            }

        } while (choice != 0);

        System.out.println("Program stopped. Thank you!");
        sc.close();
    }
}
