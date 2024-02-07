package generics;

public class BoxObject {

    private Object coisa;

    public void save(Object coisa) {
        this.coisa = coisa;
    }

    public Object open() {
        return coisa;
    }
}
