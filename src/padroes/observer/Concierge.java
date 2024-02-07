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

        while(!"exit".equalsIgnoreCase(value)) {
            System.out.print("Has the birthday person arrived? ");
            value = input.nextLine();

            if("sim".equalsIgnoreCase(value)) {
                // Criar o evento
                EventArrivalBirthday event = new EventArrivalBirthday(new Date());

                // notificar os observadores!
                observerArrivalBirthdayBoys.stream()
                        .forEach(observers -> observers.arrived(event));
                value = "exit";
            } else {
                System.out.println("False alarm!");
            }
        }
        input.close();
    }
}
