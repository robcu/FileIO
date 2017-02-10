import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        QuestionAndAnswer.readFile();
        QuestionAndAnswer.askQuestions();
        QuestionAndAnswer.save();


    }
}
//ask user 5 questions, record answer
//save answers into JSON file

//at beginning of program - read JSON file, parse, print

//give user option to update answers
//include error msg if JSON parsing fails