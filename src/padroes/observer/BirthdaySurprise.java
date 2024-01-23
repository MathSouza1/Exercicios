package padroes.observer;

public class BirthdaySurprise {
    public static void main(String[] args) {
        Concierge concierge = new Concierge();
        Girlfriend girlfriend = new Girlfriend();
        concierge.registerObserver(girlfriend);
        concierge.registerObserver(register -> {
            System.out.println("Surprise by lmabda");
            System.out.println("Ocorred in: " + register.getMoment());
        });
        concierge.monitor();
    }
}
