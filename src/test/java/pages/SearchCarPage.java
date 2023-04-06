package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class SearchCarPage {

    public String textHeader = "Продажа автомобилей",
            searchAds = "Поиск объявлений",
            buttonTextGeneration = "Поколение",
            buttonTextMinYear = "Год от",
            buttonTextMaxYear = "до",
            buttonTextKPP = "КПП",
            buttonTextFuel = "Топливо",
            buttonTextVolume = "Объем от, л",
            buttonTextDriveUnit = "Привод",
            inputValueBrandMazda = "Mazda",
            foundCarBrandMazda = "Mazda";

    public SelenideElement header = $(".css-hqbmxg"),
            inputTextBrand = $("input[placeholder=Марка]"),
            inputTextModel = $("input[placeholder=Модель]"),
            inputTextMinPrice = $("input[placeholder='Цена от, ₽']"),
            inputTextMaxPrice = $("input[placeholder=до]"),
            buttonPlus = $("button[title='Добавить ряд выбора марки, модели']"),
            buttonAdvancedSearch = $("button[data-ftid='sales__filter_advanced-button']"),
            buttonSubmit = $("button[data-ftid='sales__filter_submit-button']"),
            labelUnsold = $("label[for='sales__filter_unsold']"),
            labelPhoto = $("label[for=photo]"),
            foundCarName = $("span[data-ftid=bull_title]");

    public ElementsCollection buttonOnFormSearch = $$("button[data-ftid=component_select_button]"),
            commonListBrand = $$("div[role=option]");

    public SearchCarPage openPage() {
        open("https://drom.ru");

        return this;
    }

    public SearchCarPage goToSearchCar() {
        $$("a").find((text(searchAds))).click();
        return this;
    }

    public SearchCarPage verifyHeader() {
        $(header).shouldHave(text(textHeader));

        return this;
    }

    public SearchCarPage verifyInputOnFormSearch(SelenideElement inputText) {
        $(inputText).should(exist);

        return this;
    }

    public SearchCarPage verifyButtonOnFormSearch(ElementsCollection buttonOnForm, String buttonText) {
        $$(buttonOnForm).find((text(buttonText))).should(exist);
       // $$("button[data-ftid=component_select_button]").find((text("Поколение"))).should(Condition.exist);

        return this;
    }

    public SearchCarPage verifyButtonMoreOnFormSearch(SelenideElement buttonPlus) {
        $(buttonPlus).should(exist);

        return this;
    }

    public SearchCarPage verifyLabelOnFormSearch(SelenideElement labelText) {
        $(labelText).should(exist);

        return this;
    }

    public SearchCarPage setValueToInput(SelenideElement inputOnForm, String inputValue, ElementsCollection commonList) {
        $(inputOnForm).click();
        $(inputOnForm).setValue(inputValue);
       $$(commonList).find(text(inputValue)).click(); //вот так не работает
        $$("div[role=option]").find(text(inputValue)).click(); //а так работает
        //это не смотри $$("div[role=option]").find((text(inputValue))).should(exist);
        //это не смотри, на будущее мне $$(".error").shouldHave(size(3));

        return this;
    }

    public SearchCarPage buttonClick(SelenideElement button) {
        $(button).click();

        return this;
    }

    public SearchCarPage verifyBrandSearchResult(SelenideElement foundCarName, String carBrand) {
        $(foundCarName).shouldHave(text(carBrand));

        return this;
    }



}
