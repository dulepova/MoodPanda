
import org.testng.annotations.Test;

 public class MoodPandaTest extends BaseTest{

    String email = "a.s.dulepova@gmail.com";
    String password = "Qwerty123";

    @Test
    public void updateMood() {
        loginPage.openPage();
        loginPage.login(email, password);
        moodPage.clickUpdate();
        moodPage.updateMood(7, "AWESOME");
        System.out.println();
    }
}
