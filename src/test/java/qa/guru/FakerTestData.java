package qa.guru;

import com.github.javafaker.Faker;

public class FakerTestData {
    public FakerTestData (){
        userName = faker.name().firstName();
        lastName = faker.name().lastName();
        userEmail = faker.internet().emailAddress();
        userGender = faker.demographic().sex();
        userPhone = "8" + faker.phoneNumber().subscriberNumber(9);
        userBirthDayDay = String.valueOf(faker.number().numberBetween(1, 28));
        userBirthDayMonth = faker.options().option("January", "February",
                "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        userBirthDayYear = String.valueOf((faker.number().numberBetween(1950, 2000)));
        userSubject = faker.options().option("Accounting", "Maths", "Arts", "English", "Physics", "Chemistry",
                "Computer Science", "Economics", "Social Studies", "History", "Civics", "Commerce", "Hindi", "Biology");
        userHobbies = faker.options().option("Reading", "Sports", "Music");
        userPicture = "no-homo-sapiens.png";
        userAddress = faker.address().fullAddress();
        userState = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
        if (userState == "NCR") {
            userCity = faker.options().option("Delhi", "Gurgaon", "Noida");
        } else if (userState == "Uttar Pradesh") {
            userCity = faker.options().option("Agra", "Lucknow", "Merrut");
        } else if (userState == "Haryana") {
            userCity = faker.options().option("Karnal", "Panipat");
        } else {
            userCity = faker.options().option("Jaipur", "Jaiselmer");
        }
    }
    public static Faker faker = new Faker();
    public String userName;
    public String lastName;
    public String userEmail;
    public String userGender;
    public String userPhone;
    public String userBirthDayDay;
    public String userBirthDayMonth;
    public String userBirthDayYear;
    public String userSubject;
    public String userHobbies;
    public String userPicture;
    public String userAddress;
    public String userState;
    public String userCity;
}
