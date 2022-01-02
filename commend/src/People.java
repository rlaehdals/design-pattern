import java.util.ArrayList;
import java.util.List;

public class People {

    List<Commend> commendList = new ArrayList<>();

    public void addCommend(Commend commend) {
        commendList.add(commend);
    }

    public double execute(int index, double n1, double n2){
        return commendList.get(index).execute(n1,n2);
    }
}
