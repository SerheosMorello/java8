package enums;

public class App {
    public static void main(String[] args) {
        System.out.println(Buttons.YES.getRussian()); // Да
        System.out.println(Buttons.NO.getRussian()); // Нет
        System.out.println(Buttons.YES.getEnglish()); // Yes
        System.out.println(Buttons.NO.getEnglish()); // No

        Operation sum = Operation.SUM;
        System.out.println(sum.action(10, 4));   // 14
        Operation multiplay = Operation.MULTIPLY;
        System.out.println(multiplay.action(6, 4));    // 24
        Operation subtract = Operation.SUBTRACT;
        System.out.println(subtract.action(6, 4));    // 2

    }
}
