package qa.guru;

import com.github.javafaker.Faker;

public class FakerTestData {
    void fillFormTest() {}
    public static Faker faker = new Faker();
    static String userName = faker.name().firstName();
    static String lastName = faker.name().lastName();
    static String userEmail = faker.internet().emailAddress();
    static String userGender = faker.demographic().sex();
    static String userPhone = "8" + faker.phoneNumber().subscriberNumber(9);
    static String userBirthDayDay = String.valueOf(faker.number().numberBetween(1, 28));
    static String userBirthDayMonth = faker.options().option("January", "February",
                    "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    static String userBirthDayYear = String.valueOf((faker.number().numberBetween(1950, 2000)));
    public static String userSubject = faker.options().option("Accounting", "Maths", "Arts", "English", "Physics", "Chemistry",
                    "Computer Science", "Economics", "Social Studies", "History", "Civics", "Commerce", "Hindi", "Biology");
    public static String userHobbies = faker.options().option("Reading", "Sports", "Music");
    static String userPicture = "no-homo-sapiens.png";
    static String userAddress = faker.address().fullAddress();
    static String userState = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");

    static String city = new String();
        if (userState == "NCR") {
        city = faker.options().option("Delhi", "Gurgaon", "Noida");
    } else if (userState == "Uttar Pradesh") {
        city = faker.options().option("Agra", "Lucknow", "Merrut");
    } else if (userState == "Haryana") {
        city = faker.options().option("Karnal", "Panipat");
    } else {
        city = faker.options().option("Jaipur", "Jaiselmer");
    }

    static String userCity = city;
}
