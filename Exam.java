import javax.swing.*;

public class Exam extends Assessment {

    private int questions;
    private int missed;

    //constructor
    public Exam(int questions, int missed){
        setQuestions(questions);
        setMissed(missed);

        scoreCalc();

    }

    // Setter methods
    public void setQuestions(int newQuestions){
        this.questions = newQuestions;
    }
    public void setMissed(int newMissed){
        this.missed = newMissed;
    }

    // Other methods.

    public void scoreCalc(){
        int questionScore = getQuestions();
        int missedScore = getNumMissed();

        int pointsPerQuestion = getPointsEach();
        int finalScore = pointsPerQuestion * (questionScore-missedScore);
        setScore(finalScore);
    }

    public int getQuestions(){
        return questions;
    }

    public int getNumMissed(){
        return missed;
    }

    public int getPointsEach(){
        int result = 0;
        try {
            result = 100/getQuestions();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Cannot divide by 0. Please try again.");
            System.exit(0);
        }
        return result;
    }
}
