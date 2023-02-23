public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main app = new Main();
        app.hello();
    }
    private void hello ()
    {
        System.out.println("Hello!" + Math.random());
    }
}