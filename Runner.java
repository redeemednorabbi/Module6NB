import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {

        public static void main(String[] args)
        {
            String input;     // To hold input
            int questions = 0;    // Number of questions
            int missed = 0;       // Number of questions missed

            // Get the number of questions on the exam

            boolean intEntered = true;
            while (intEntered){
                try {
                    input = JOptionPane.showInputDialog("How many questions are on the exam?");
                    questions = Integer.parseInt(input);
                    intEntered = false;
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Please input a valid integer.");
                }
            }

            // Get the number of questions the student missed

            boolean intEntered2 = true;
            while (intEntered2) {
                try {
                    input = JOptionPane.showInputDialog("How many questions did the student miss?");
                    missed = Integer.parseInt(input);
                    intEntered2 = false;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Please input a valid integer.");
                }
            }



            // Create an Exam object
            Exam exam = new Exam(questions, missed);

            // Display the test results
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\n10The exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);

            System.exit(0);
        }
    }


