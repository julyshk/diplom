package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class MenuPage {
    public String registrationSubmenuText = "Вход и регистрация",
            reportVINText = "Отчеты по VIN",
            rateACar = "Оценить автомобиль",
            carReviews = "Отзывы об автомобилях",
            auctionStatistics = "Статистика аукционов",
            helpAndFeedback = "Помощь и обратная связь",
            dromFines = "Дром Штрафы",
            dromPDD = "Дром ПДД";

    public SelenideElement
            closeLoginScreenButton = $(id("ru.farpost.dromfilter:id/later_button")),
            menuButton = $(id("ru.farpost.dromfilter:id/menu_page"));

    public ElementsCollection
            submenu = $$(id("ru.farpost.dromfilter:id/main_text_view"));

    public MenuPage buttonClick(SelenideElement buttonName) {
        buttonName.click();

        return this;
    }

    public MenuPage chapterExistCheck(ElementsCollection chapters, String nameChapter) {
        chapters.findBy(text(nameChapter)).should(exist);

        return this;
    }
}