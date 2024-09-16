public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 5_000;
        boolean registered = true;

        int expected = 50;
        long actual = service.calculate(amount, registered);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 50;
        registered = false;
        actual = service.calculate(amount, registered);
        System.out.println("2. " + expected + " == ? == " + actual);

    }
}
