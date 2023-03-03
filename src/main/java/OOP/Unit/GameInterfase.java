package OOP.Unit;

import java.util.ArrayList;

public interface GameInterfase {
    StringBuilder getInfo();
    String getProfession();
    void step(ArrayList<Human> team1, ArrayList<Human> team2, ArrayList<Barrier> barriers);

}
