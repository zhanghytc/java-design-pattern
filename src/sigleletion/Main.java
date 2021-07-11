package sigleletion;

public class Main {

    public static void main(String[] args) {

        SingletonLazy.getInstance3().process();

        SingletonHungry.process();
    }
}
