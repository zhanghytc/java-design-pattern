package sigleletion;

public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    private static SingletonHungry getInstance() {
        return instance;
    }

    public static void  process() {
        System.out.println("对象调用成功");
    }
}
