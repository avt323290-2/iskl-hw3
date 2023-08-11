import java.text.ParseException;

public class MainApp {
    public static void main(String[] args) {
        try {
            String input = UserInputOutput.getUserInput();
            UserData userData = DataProcessor.processInputData(input);

            String fileName = userData.getLastName() + ".txt";
            String output = userData.getLastName() + userData.getFirstName() + userData.getPatronymic()
                    + userData.getBirthDate() + " " + userData.getPhoneNumber() + userData.getGender();

            FileHandler.writeToFile(fileName, output);

            UserInputOutput.showSuccessMessage("Данные успешно записаны в файл.");
        } catch (IllegalArgumentException | ParseException e) {
            UserInputOutput.showError(e.getMessage());
        }
    }
}