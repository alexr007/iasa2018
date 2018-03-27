package iasa.lesson6.observer;

import iasa.lesson6.observer.interf.Subscriber;

public class ObserverDesignExample {
    private static Subscriber sasha = new SubscriberType2("Sasha");
    private static Subscriber masha = new SubscriberType2("Masha");
    private static Subscriber pasha = new SubscriberType1("Pasha");
    private static Subscriber petro = new SubscriberType1("Petro");

    public static void main(String args[]) {
        Publisher publisher = new Publisher();

        publisher.subscribe(sasha);
        publisher.subscribe(pasha);
        publisher.subscribe(petro);

        System.out.println("-- stage 1 --");
        publisher.publishMagazine(); // add "Document #1"
        printMe(); // sasha pasha petro got Document #1

        System.out.println("-- stage 2 --");
        publisher.publishMagazine(); // add "Document #2"
        printMe(); // sasha pasha petro got Document #2

        System.out.println("-- stage 3 --");
        publisher.subscribe(masha); // masha won't get Document #3
        publisher.unsubscribe(sasha); // sasha will get Document #3

        publisher.publishMagazine(); // add "Document #3"
        printMe();
    }

    static void printMe() {
        System.out.println(sasha);
        System.out.println(masha);
        System.out.println(pasha);
        System.out.println(petro);
    }
}