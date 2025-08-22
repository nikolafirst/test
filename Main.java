import java.util.Scanner;

/**
 * My test task
 * @author Nikolay Karasev
 * @version 0.1
 */



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.print(result);
    }

    static String calc(String input) {
        String[] args = input.split(" ");
        if (args.length != 3) {
            return "throws Exception";
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            String operator = args[1];
            int num2 = Integer.parseInt(args[2]);

            switch (operator) {
                case "+":
                    return String.valueOf(num1 + num2);
                case "-":
                    return String.valueOf(num1 - num2);
                case "*":
                    return String.valueOf(num1 * num2);
                case "/":
                    if (num2 == 0) {
                        return "Ошибка: деление на ноль.";
                    }
                    return String.valueOf(num1 / num2);
                default:
                    return "throws Exception";
            }
        } catch (NumberFormatException e) {
            return "throws Exception";
        }
    }
}
