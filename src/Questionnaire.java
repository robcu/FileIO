import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Questionnaire {

    public Questionnaire(){}

    static ArrayList<String> questions = new ArrayList<>();
    //static ArrayList<QandAPair> pairs = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static QsAndAs localQsAndAs = new QsAndAs();

    static void readFile() throws IOException{
        File f = new File("answers.json");
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        s.close();
        JsonParser parser = new JsonParser();


        //one solution would be to structure things differently, avoid an array altogether by making a 5 field class
        localQsAndAs.setQsAndAs(parser.parse(contents, QsAndAs.class));
    }

    static void askQuestions(){
        questions.add("Where were you born?");
        questions.add("How old are you?");
        questions.add("What is your favorite color?");
        questions.add("What did you dream last night?");
        questions.add("Why does it matter?");

        for(String question : questions) {
            System.out.println(question);
            QsAndAs.qsAndAs.add(new QandAPair(question, scanner.nextLine()));
        }
        //test print - succeeded
        for(QandAPair pair : QsAndAs.qsAndAs){
            System.out.println(pair.getQuestion() + " " + pair.getAnswer());
        }
    }

    static void save() throws IOException {
        QandAPair temp = new QandAPair();
        File f = new File("answers.json");
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.include("pairs").serialize(temp);    //todo: am i using serializer correctly? pairs?
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }

}

