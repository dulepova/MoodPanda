package pages;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class MoodPage {

    public static final String UPDATE_MOOD_BUTTON = "#LinkUpdate";
    public static final String SLIDER = ".ui-slider-handle";
    public static final String DESCRIPTION = "#TextBoxUpdateMoodTag";
    public static final String UPDATE_BATTON = ".ButtonUpdate";
    public static final String MY_DAIRY_BATTON = ".ButtonMyDiary";

    public void clickUpdate() {
        $(UPDATE_MOOD_BUTTON).click();
    }

    //TODO update data too
    public void updateMood(int rating, String description) {
        setMood(rating);
        $(DESCRIPTION).sendKeys(description);
        $(UPDATE_BATTON).click();
        $(MY_DAIRY_BATTON).click();
    }
    private void setMood(int raiting) {
        int defaultMood = 5;
        $(SLIDER).click();
        Keys direction;
        if (raiting > defaultMood) {
            direction = Keys.ARROW_RIGHT;
        } else {
            direction = Keys.ARROW_LEFT;
        }
        for (int i = 0; i < Math.abs(raiting - defaultMood); i++) {
            $(SLIDER).sendKeys(direction);
        }
    }
}
