package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Concierge {
    private List<ObserverArrivalBirthdayBoy> observerArrivalBirthdayBoys = new ArrayList<>();
    public void registerObserver(ObserverArrivalBirthdayBoy observerArrivalBirthdayBoy) {
        observerArrivalBirthdayBoys.add(observerArrivalBirthdayBoy);
    }

    public void monitor() {
        Scanner input = new Scanner(System.in);

        String value = "";

        while(!"sair".equalsIgnoreCase(value)) {
            System.out.print("Aniversariante chegou? ");
            value = input.nextLine();

            if("sim".equalsIgnoreCase(value)) {
                // Criar o evento
                EventArrivalBirthday event = new EventArrivalBirthday(new Date());

                // notificar os observadores!
                observerArrivalBirthdayBoys.stream()
                        .forEach(observers -> observers.arrived(event));
                value = "sair";
            } else {
                System.out.println("Alarme falso!");
            }
        }
        input.close();
    }
}
