public class Main {
    public static void main(String[] args) {
        System.out.println("Java app started...");
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("Running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
