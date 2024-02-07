package padroes.observer;

public class BirthdaySurprise {
    public static void main(String[] args) {
        Concierge concierge = new Concierge();
        Girlfriend girlfriend = new Girlfriend();
        concierge.registerObserver(girlfriend);
        concierge.registerObserver(register -> {
            System.out.println("Surprise by lambda");
            System.out.println("Occurred in: " + register.moment());
        });
        concierge.monitor();
    }
}
