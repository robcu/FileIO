import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Questionnaire questionnaire = new Questionnaire();

        questionnaire.readFileAndPrint();
        questionnaire.askQuestionsSaveAnswers();
        questionnaire.save();
    }
}