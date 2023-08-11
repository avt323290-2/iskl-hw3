import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataProcessor {
    public static UserData processInputData(String input) throws IllegalArgumentException, ParseException {
        // Разделение введенных данных на части
        String[] inputData = input.split(" ");
        if (inputData.length != 6) {
            throw new IllegalArgumentException("Неверное количество данных.");
        }

        // Извлечение данных из массива
        String lastName = inputData[0];
        String firstName = inputData[1];
        String patronymic = inputData[2];
        String birthDateStr = inputData[3];
        String phoneNumberStr = inputData[4];
        char gender = inputData[5].charAt(0);

        // Парсинг даты рождения
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = dateFormat.parse(birthDateStr);

        // Парсинг номера телефона
        long phoneNumber = Long.parseLong(phoneNumberStr);

        return new UserData(lastName, firstName, patronymic, birthDateStr, phoneNumber, gender);
    }
}
