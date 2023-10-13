package morph;

public class Enemy {

    String name;
    int hp;

    void dialog(){
        System.out.println("Override me");
    }

    void showStatus(){
        System.out.println("Name: "+ name);
        System.out.println("HP: "+hp);
    }

}
