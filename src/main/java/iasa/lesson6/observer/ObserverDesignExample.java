package iasa.lesson6.observer;

import iasa.lesson6.observer.interf.Subscriber;

public class ObserverDesignExample {
    private static Subscriber sasha = new SubscriberType2("Sasha");
    private static Subscriber masha = new SubscriberType2("Masha");
    private static Subscriber pasha = new SubscriberType1("Pasha");
    private static Subscriber petro = new SubscriberType1("Petro");

    public static void main(String args[]) {
        Publisher pub = new Publisher();

        pub.subscribe(sasha);
        pub.subscribe(pasha);
        pub.subscribe(petro);

        System.out.println("-- stage 1 --");
        pub.publishDocument(1); // add "Document #1"
        printMe(); // sasha pasha petro got Document #1

        System.out.println("-- stage 2 --");
        pub.publishDocument(2); // add "Document #2"
        printMe(); // sasha pasha petro got Document #2

        System.out.println("-- stage 3 --");
        pub.subscribe(masha); // masha will get Document #3
        pub.unsubscribe(sasha); // sasha won't get Document #3

        pub.publishDocument(3); // add "Document #3"
        printMe();
    }

    static void printMe() {
        System.out.println(sasha);
        System.out.println(masha);
        System.out.println(pasha);
        System.out.println(petro);
    }
}