package qa.guru;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import static qa.guru.FakerTestData.*;

public class AutomationPracticeFormWithJavaFakerTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulRegistrationTest() {

        registrationPage.openPage()
                .removeBanners()
                .setFirstName(userName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setPhone(userPhone)
                .setBirthDate(userBirthDayDay, userBirthDayMonth, userBirthDayYear)
                .setSubject(userSubject)
                .setHobby(userHobbies)
                .setPicture(userPicture)
                .setAddress(userAddress)
                .setState(userState)
                .setCity(userCity)

                .sendSubmit();

        registrationPage
                .verifyResult("Student Name", userName + " " + lastName)
                .verifyResult("Student Email", userEmail)
                .verifyResult("Gender", userGender)
                .verifyResult("Mobile", userPhone)
                .verifyResult("Date of Birth", userBirthDayDay + " " + userBirthDayMonth + "," + userBirthDayYear)
                .verifyResult("Subjects", userSubject)
                .verifyResult("Hobbies", userHobbies)
                .verifyResult("Picture", "no-homo-sapiens.png")
                .verifyResult("Address", userAddress)
                .verifyResult("State and City", userState + " " + userCity);
    }
}