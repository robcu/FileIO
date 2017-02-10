import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionAndAnswer {
    private String question;
    private String answer;
    static ArrayList<String> questions = new ArrayList<>();

    //static ArrayList<QandAPairs> pairs = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public QuestionAndAnswer(){   }

    static void askQuestions(){
        questions.add("Where were you born?");
        questions.add("How old are you?");
        questions.add("What is your favorite color?");
        questions.add("What did you dream last night?");
        questions.add("Why does it matter?");

        for(int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            QandAPairs.pairs.add(new QandAPairs(questions.get(i), scanner.nextLine()));
        }
    }

    static void save() throws IOException {
        QandAPairs temp = new QandAPairs();
        File f = new File("answers.json");
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.include("pairs").serialize(temp);    //todo: am i using serializer correctly? pairs?
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }

    static void readFile() throws IOException{
        File f = new File("answers.json");
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        s.close();
        JsonParser parser = new JsonParser();

        System.out.println("contents = " + contents);
        QandAPairs temp = parser.parse(contents, QandAPairs.class);
        System.out.println(temp.getQuestion() + " " + temp.getAnswer());
    }

    public static void main(String[] args) {

    }
}

