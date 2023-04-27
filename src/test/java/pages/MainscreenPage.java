package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class MainscreenPage {
    public String nameChapterAuto = "Автомобили",
            nameChapterSpecial = "Спецтехника",
            nameChapterSpareParts = "Запчасти",
            nameChapterMoto = "Мотоциклы";

    public SelenideElement
            closeLoginScreenButton = $(id("ru.farpost.dromfilter:id/later_button"));

    public ElementsCollection
            chapters = $$(id("ru.farpost.dromfilter:id/title"));

    public MainscreenPage buttonClick(SelenideElement buttonName) {
        buttonName.click();

        return this;
    }

    public MainscreenPage chapterExistCheck(ElementsCollection chapters, String nameChapter) {
        chapters.findBy(text(nameChapter)).should(exist);

        return this;
    }
}