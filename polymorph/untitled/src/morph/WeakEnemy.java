package morph;

public class WeakEnemy extends Enemy{


    //constructor
    WeakEnemy(){
        name = "weak enemy ako";
        hp = 10;
    }

    void dialog(){
        System.out.println("I am Weak");
    }
}
