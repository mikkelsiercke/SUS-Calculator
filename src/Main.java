import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner s          = new Scanner(System.in);
        String  is         = "Input score ";
        ArrayList<Double> scores = new ArrayList<Double>();

        int[]   ints         = new int[10];

        int     participants = 0;
        int     evenScore    = 0;
        int     oddScore     = 0;

        double  susScore     = 0;

        print("Enter number of participants: ");
        participants = s.nextInt();

        for (int j = 0; j < participants; j++) {
            //Reset scores
            susScore  = 0;
            evenScore = 0;
            oddScore  = 0;

            int participantNumber = j + 1;

            if (participants > 1) {
                print("\nParticipant " + participantNumber + ":");
            }

            for (int i = 0; i < ints.length; i++) {
                int scoreNumber = i + 1;
                print(is + scoreNumber);
                ints[i] = s.nextInt();
            }

            for (int i = 0; i < ints.length; i++) {
                if (i % 2 == 0) {
                    evenScore += 5 - ints[i];
                }
                if (i % 2 != 0) {
                    oddScore += ints[i] - 1;
                }
            }

            print("Even score is: " + evenScore);
            print(" Odd score is: " + oddScore);

            scores.add(susScore = (Double.valueOf(evenScore) + Double.valueOf(oddScore)) * 2.5);

            print(" SUS Score is: " + susScore);

        }

        double total   = 0;
        double average = 0;

        for (int i = 0; i < scores.size(); i++) {
            total += scores.get(i);
        }

        average = total / scores.size();
        print("\nThe average SUS score is:\n" + average);

        if (average > 80.3) {
            printGrades("A","Excellent");
        } else if (average > 68 && average < 80.3) {
            printGrades("B","Good");
        } else if (average == 68) {
            printGrades("C","Okay");
        } else if (average < 68 && average > 51) {
            printGrades("D","Poor");
        } else if (average < 51) {
            printGrades("F","Awful");
        }
    }

    public static void print(String string) {
        System.out.println(string);
    }

    public static void print(int integer) {
        System.out.println(integer);
    }

    public static void printGrades(String grade, String rating) {
        System.out.println("Grade:\n" + grade + "\nAdjective Rating:\n" + rating);
    }
}
