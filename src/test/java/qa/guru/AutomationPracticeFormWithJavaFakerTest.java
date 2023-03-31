package qa.guru;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class AutomationPracticeFormWithJavaFakerTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulRegistrationTest() {

        FakerTestData alexData = new FakerTestData();

        registrationPage.openPage()
                .removeBanners()
                .setFirstName(alexData.userName)
                .setLastName(alexData.lastName)
                .setEmail(alexData.userEmail)
                .setGender(alexData.userGender)
                .setPhone(alexData.userPhone)
                .setBirthDate(alexData.userBirthDayDay, alexData.userBirthDayMonth, alexData.userBirthDayYear)
                .setSubject(alexData.userSubject)
                .setHobby(alexData.userHobbies)
                .setPicture(alexData.userPicture)
                .setAddress(alexData.userAddress)
                .setState(alexData.userState)
                .setCity(alexData.userCity)

                .sendSubmit();

        registrationPage
                .verifyResult("Student Name", alexData.userName + " " + alexData.lastName)
                .verifyResult("Student Email", alexData.userEmail)
                .verifyResult("Gender", alexData.userGender)
                .verifyResult("Mobile", alexData.userPhone)
                .verifyResult("Date of Birth", alexData.userBirthDayDay + " " + alexData.userBirthDayMonth + "," + alexData.userBirthDayYear)
                .verifyResult("Subjects", alexData.userSubject)
                .verifyResult("Hobbies", alexData.userHobbies)
                .verifyResult("Picture", "no-homo-sapiens.png")
                .verifyResult("Address", alexData.userAddress)
                .verifyResult("State and City", alexData.userState + " " + alexData.userCity);
    }
}