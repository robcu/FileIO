import java.util.ArrayList;

public class QsAndAs {
    static ArrayList<QandAPair> qsAndAs = new ArrayList<>();

    public QsAndAs(){}

    public QsAndAs(ArrayList<QandAPair> qsAndAs) {
        this.qsAndAs = qsAndAs;
    }

    public ArrayList<QandAPair> getQsAndAs() {
        return qsAndAs;
    }

    public void setQsAndAs(ArrayList<QandAPair> qsAndAs) {
        this.qsAndAs = qsAndAs;
    }
}
