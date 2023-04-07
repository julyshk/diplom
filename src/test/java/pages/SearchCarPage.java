package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchCarPage {

    public String textHeaderCarsSale = "Продажа автомобилей",
            searchAds = "Поиск объявлений",
            buttonTextGeneration = "Поколение",
            buttonTextMinYear = "Год от",
            buttonTextMaxYear = "до",
            buttonTextKPP = "КПП",
            buttonTextFuel = "Топливо",
            buttonTextVolume = "Объем от, л",
            buttonTextDriveUnit = "Привод",
            inputValueBrandMazda = "Mazda",
            foundCarBrandMazda = "Mazda",
            buttonTextShow = "Показать",
            textNewCar = "Новые автомобили",
            textHeaderNewCarsSale = "Продажа новых автомобилей",
            textFoundNewCar = "Новый";

    public SelenideElement headerCarsSale = $(".css-hqbmxg"),
            inputTextBrand = $("input[placeholder=Марка]"),
            inputTextModel = $("input[placeholder=Модель]"),
            inputTextMinPrice = $("input[placeholder='Цена от, ₽']"),
            inputTextMaxPrice = $("input[placeholder=до]"),
            buttonPlus = $("button[title='Добавить ряд выбора марки, модели']"),
            buttonAdvancedSearch = $("button[data-ftid='sales__filter_advanced-button']"),
            buttonSubmit = $("button[data-ftid='sales__filter_submit-button']"),
            newCarClick = $("a[data-ga-stats-name='auto_new_bulls_button']"),
            labelUnsold = $("label[for='sales__filter_unsold']"),
            labelPhoto = $("label[for=photo]"),
            headerNewCarsSale = $("h1");

    public ElementsCollection commonListBrand = $$("div[role=option]"),
            buttonOnFormSearch = $$("button[data-ftid=component_select_button]"),
            foundCarName = $$("span[data-ftid=bull_title]"),
            foundNewCar = $$("a[data-ftid=bulls-list_bull]");


    public SearchCarPage openPage() {
        open("https://drom.ru");

        return this;
    }

    public SearchCarPage goToSearchCar() {
        $$("a").find((text(searchAds))).click();
        return this;
    }

    public SearchCarPage verifyHeader(SelenideElement header, String textHeader) {
        header.shouldHave(text(textHeader));

        return this;
    }

    public SearchCarPage verifyInputOnFormSearch(SelenideElement inputText) {
        inputText.should(exist);

        return this;
    }

    public SearchCarPage verifyButtonOnFormSearch(ElementsCollection buttonOnForm, String buttonText) {
        buttonOnForm.find((text(buttonText))).should(exist);

        return this;
    }

    public SearchCarPage verifyButtonMoreOnFormSearch(SelenideElement buttonPlus) {
        buttonPlus.should(exist);

        return this;
    }

    public SearchCarPage verifyLabelOnFormSearch(SelenideElement labelText) {
        labelText.should(exist);

        return this;
    }

    public SearchCarPage setValueToInput(SelenideElement inputOnForm, String inputValue, ElementsCollection commonList) {
        inputOnForm.click();
        inputOnForm.setValue(inputValue);
        commonList.find(text(inputValue)).click();

        return this;
    }

    public SearchCarPage buttonClick(SelenideElement button, String buttonText) {
        button.$(byText(buttonText)).click();

        return this;
    }

    public SearchCarPage verifySearchResult(ElementsCollection foundCarName, String carBrand) {
        foundCarName.filterBy(text(carBrand)).shouldHave(size(20));

        return this;
    }
}
