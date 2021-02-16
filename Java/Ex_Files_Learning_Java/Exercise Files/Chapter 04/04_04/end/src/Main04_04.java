import java.util.Random;

public class Main04_04 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        Cat c = new Cat();

        if (c instanceof Pet) {
            c.play();
        }

        if (d instanceof Pet) {
            d.play();
        }

        Pet p;
        Random rand = new Random();
        int n = rand.nextInt(2);

        if (n == 0) {
            p = new Dog2();	// we want that pet to be a dog
        } else {
            p = new Cat();	// we want that pet to be a cat
        }

        p.play();

    }

}
