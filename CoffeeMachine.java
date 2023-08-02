import java.util.Scanner;

public class CoffeeMachine {
    private int money;
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;

    public CoffeeMachine() {
        this.money = 550;
        this.water = 1200;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.cups = 9;
    }

    public void displayState() {
        System.out.println("Состояние кофемашины:");
        System.out.println("Деньги: $" + money);
        System.out.println("Вода: " + water);
        System.out.println("Молоко: " + milk);
        System.out.println("Кофейные зерна: " + coffeeBeans);
        System.out.println("Одноразовые стаканчики: " + cups);
    }

    public void buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой кофе хотите купить? (1 - эспрессо, 2 - латте, 3 - капучино):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                makeCoffee(250, 0, 16, 4);
                break;
            case 2:
                makeCoffee(350, 75, 20, 7);
                break;
            case 3:
                makeCoffee(200, 100, 12, 6);
                break;
            default:
                System.out.println("Неверный выбор.");
        }
    }

    private void makeCoffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int cost) {
        if (water >= waterNeeded && milk >= milkNeeded && coffeeBeans >= coffeeBeansNeeded && cups > 0) {
            System.out.println("Начинаем варить кофе\n" +
                    "Измельчение кофейных зерен\n" +
                    "Кипящая вода\n" +
                    "Смешивание кипяченой воды с измельченными кофейными зернами\n" +
                    "Наливая кофе в чашку\n" +
                    "Налив немного молока в чашку\n" +
                    "Кофе готов!\n");
            money += cost;
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= coffeeBeansNeeded;
            cups--;
        } else {
            System.out.println("К сожалению, кофе не может быть приготовлен. Проверьте расходные материалы.");
        }
    }

    public void fillMachine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мл воды хотите добавить?");
        int waterToAdd = scanner.nextInt();
        System.out.println("Сколько мл молока хотите добавить?");
        int milkToAdd = scanner.nextInt();
        System.out.println("Сколько г кофейных зерен хотите добавить?");
        int coffeeToAdd = scanner.nextInt();
        System.out.println("Сколько одноразовых стаканчиков хотите добавить?");
        int cupsToAdd = scanner.nextInt();

        water += waterToAdd;
        milk += milkToAdd;
        coffeeBeans += coffeeToAdd;
        cups += cupsToAdd;
    }

    public void takeMoney() {
        System.out.println("Вы получили " + money);
        money = 0;
    }
}