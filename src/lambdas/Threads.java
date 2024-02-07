package lambdas;

public class Threads {

    public static void main(String[] args) {

        Runnable firstWork = new Work();
        Runnable secondWork = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Tarefa #02");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        };

        Runnable thirdWork = Threads::trabalho3;

        Thread firstThread = new Thread(firstWork);
        Thread secondThread = new Thread(secondWork);
        Thread thirdThread = new Thread(thirdWork);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }

    static void trabalho3() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tarefa #03");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
