package generics;

import java.util.List;

public class UtilList {

    public static Object getLastObject(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    public static <T> T getLastT(List<T> lista) {
        return lista.get(lista.size() - 1);
    }
}
