import java.util.ArrayList;

public class Battle {
    ArrayList<Monster> monsters = new ArrayList<>();
    int count = 0;

    void add(Monster monster) {
        if (count < 5) {
        monsters.add(monster);
            count++;
        } else
            System.out.println("No more monsters!");
    }

    void start() {
        run();
    }

    void run() {
//        for (Monster m : monsters) {
//            m.attack();
//        }
        for (int i = 0; i < monsters.size(); i++) {
            monsters.get(i).attack(monsters.get(i+1));
        }
    }
}
