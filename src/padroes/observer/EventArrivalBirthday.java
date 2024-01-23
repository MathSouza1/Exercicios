package padroes.observer;

import java.util.Date;

public class EventArrivalBirthday {
    private final Date moment;

    public EventArrivalBirthday(Date moment) {
        this.moment = moment;
    }

    public Date getMoment() {
        return moment;
    }
}
