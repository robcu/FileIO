import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by robculclasure on 2/8/17.
 */
public class QandAPairs {
    String question;
    String answer;
    static ArrayList<QandAPairs> pairs = new ArrayList<>();

    //static HashMap<String, String> qAndA = new HashMap<>();

    public QandAPairs() {}


    public QandAPairs(String q, String a) {
        this.question = q;
        this.answer = a;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

