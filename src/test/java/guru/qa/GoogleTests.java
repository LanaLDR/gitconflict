package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

    @Test
    void openGoogleTest() {
        open("https://google.com");
    }
}
