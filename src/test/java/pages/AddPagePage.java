package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class AddPagePage {

    public SelenideElement
            closeLoginScreenButton = $(id("ru.farpost.dromfilter:id/later_button")),
            addButton = $(id("ru.farpost.dromfilter:id/add_page")),
            elementCars = $(id("ru.farpost.dromfilter:id/car_section")),
            elementTrucksAndSpecialVehicles = $(id("ru.farpost.dromfilter:id/spec_section")),
            elementCloseButton = $(id("ru.farpost.dromfilter:id/cancel_button"));

    public AddPagePage buttonClick(SelenideElement buttonName) {
        buttonName.click();

        return this;
    }

    public AddPagePage elementVisibleCheck(SelenideElement element) {
        element.shouldBe(visible);

        return this;
    }
}