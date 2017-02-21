import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by robculclasure on 2/8/17.
 */
public class QandAPair {
    String question;
    String answer;
    static ArrayList<QandAPair> pairs = new ArrayList<>();

    public QandAPair() {}


    public QandAPair(String q, String a) {
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

