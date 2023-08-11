import java.util.Scanner;

public class UserInputOutput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        System.out.println("Введите данные (Фамилия Имя Отчество датарождения номертелефона пол):");
        return scanner.nextLine();
    }

    public static void showError(String errorMessage) {
        System.err.println("Ошибка: " + errorMessage);
    }

    public static void showSuccessMessage(String message) {
        System.out.println("Успешно: " + message);
    }
}
