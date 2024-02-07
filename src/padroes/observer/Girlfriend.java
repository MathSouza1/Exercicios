package padroes.observer;

public class Girlfriend implements ObserverArrivalBirthdayBoy {
    @Override
    public void arrived(EventArrivalBirthday event) {
        System.out.println("Notify the guests...");
        System.out.println("Turn off the lights...");
        System.out.println("Wait for it...");
        System.out.println("and... surprise!!!!");
    }
}
