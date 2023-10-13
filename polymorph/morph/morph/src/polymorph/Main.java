package polymorph;
public class Main {
    public static void main(String[] args) {

      Enemy se = new StrongEnemy();
      Enemy we = new WeakEnemy();

      se.dialog();
      we.dialog();

    }
}