public class Battle {
    Monster[] monsters = new Monster[5];
    int count = 0;

    void add(Monster monster) {
        if (count < 5)
            monsters[count++] = monster;
        else
            System.out.println("No more monsters!");
    }

    void start() {
        run();
    }

    void run() {
        for (Monster m : monsters) {
            m.attack();
        }
    }
}
