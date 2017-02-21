import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Questionnaire {

    static Scanner scanner = new Scanner(System.in);
    static Answers answers = new Answers();

    static void readFileAndPrint() throws IOException{
        File f = new File("answers.json");
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        s.close();
        JsonParser parser = new JsonParser();
        Answers readAnswers = parser.parse(contents, Answers.class);

        System.out.println(readAnswers);

        throw new IOException("Parsing error.");
    }

    static void askQuestionsSaveAnswers(){

        System.out.println("Would you like to update the answers? [y/n]");
        if(scanner.nextLine().contentEquals("y")) {
            System.out.println(answers.q1 = "Where were you born?");
            answers.a1 = scanner.nextLine();
            System.out.println(answers.q2 = "How old are you?");
            answers.a2 = scanner.nextLine();
            System.out.println(answers.q3 = "What is your favorite color?");
            answers.a3 = scanner.nextLine();
            System.out.println(answers.q4 = "What did you dream last night?");
            answers.a4 = scanner.nextLine();
            System.out.println(answers.q5 = "Why does it matter?");
            answers.a5 = scanner.nextLine();
        }
        else System.exit(0);
    }

    static void save() throws IOException {

        File f = new File("answers.json");
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(answers);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        System.out.println("Answers updated.");
    }

}

