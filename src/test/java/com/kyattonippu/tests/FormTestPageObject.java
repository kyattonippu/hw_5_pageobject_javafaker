package com.kyattonippu.tests;
import static com.kyattonippu.utils.RandomTestData.*;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class FormTestPageObject extends TestBase {

    private final Map<String, String> resultValues = new HashMap<>() {{
        put("Student Name", firstName + " " + lastName);
        put("Student Email", userEmail);
        put("Gender", gender);
        put("Mobile", userNumber);
        put("Date of Birth", day + " " + month + "," + year);
        put("Subjects", subjects);
        put("Hobbies", hobby);
        put("Picture", image);
        put("Address", currentAddress);
        put("State and City", state + " " + city);
    }};

    @Test
    void fullFormTest() {
        registrationPage.openPage()
                .removeBannerAndFooter();

        registrationPage.typeFirstName(firstName)
                .typeLastName(lastName)
                .typeUserEmail(userEmail)
                .chooseGender(gender)
                .typeUserNumber(userNumber)
                .setBirthDate(day, month, year)
                .typeSubjects(subjects)
                .setHobbies(hobby)
                .uploadFile(image)
                .typeAddress(currentAddress)
                .selectState(state)
                .selectCity(city)
                .submit();

        registrationPage
                .checkThatResultsBlockAppears()
                .checkResultValues(resultValues)
                .closeResultModalWindow();
    }
}
