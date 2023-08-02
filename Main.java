import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.displayState();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду (купить, заполнить, взять):");
            String command = scanner.next();
            switch (command) {
                case "купить":
                    coffeeMachine.buyCoffee();
                    break;
                case "заполнить":
                    coffeeMachine.fillMachine();
                    break;
                case "взять":
                    coffeeMachine.takeMoney();
                    break;
                default:
                    System.out.println("Неверная команда.");
            }
            coffeeMachine.displayState();
        }
    }
}
