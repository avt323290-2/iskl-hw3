public class UserData {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String birthDate;
    private long phoneNumber;
    private char gender;

    /**
     * Конструктор для создания объекта UserData.
     *
     * @param lastName    Фамилия пользователя.
     * @param firstName   Имя пользователя.
     * @param patronymic  Отчество пользователя.
     * @param birthDate   Дата рождения пользователя в формате "dd.MM.yyyy".
     * @param phoneNumber Номер телефона пользователя.
     * @param gender      Пол пользователя ('f' или 'm').
     */
    public UserData(String lastName, String firstName, String patronymic, String birthDate, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    /**
     * Получить фамилию пользователя.
     *
     * @return Фамилия пользователя.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Получить имя пользователя.
     *
     * @return Имя пользователя.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Получить отчество пользователя.
     *
     * @return Отчество пользователя.
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Получить дату рождения пользователя.
     *
     * @return Дата рождения пользователя в формате "dd.MM.yyyy".
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Получить номер телефона пользователя.
     *
     * @return Номер телефона пользователя.
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Получить пол пользователя.
     *
     * @return Пол пользователя ('f' - женский, 'm' - мужской).
     */
    public char getGender() {
        return gender;
    }
}
