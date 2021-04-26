package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public static final String EMAIL_INPUT = "#ContentPlaceHolderContent_TextBoxEmail";
    public static final String PASSWORD_INPUT = "#ContentPlaceHolderContent_TextBoxPassword";
    public static final String LOGIN_BATTON =  "#ContentPlaceHolderContent_ButtonLogin";

    public void openPage() {
        open("https://moodpanda.com/Login/");
    }
    public void login(String email, String password) {
        $(EMAIL_INPUT).setValue(email);
        $(PASSWORD_INPUT).setValue(password);
        $(LOGIN_BATTON).click();
    }
}
