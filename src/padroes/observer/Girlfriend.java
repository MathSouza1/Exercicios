package padroes.observer;

public class Girlfriend implements ObserverArrivalBirthdayBoy {
    @Override
    public void arrived(EventArrivalBirthday event) {
        System.out.println("Avisar os convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar um pouco...");
        System.out.println("e... surpresa!!!!");
    }
}
