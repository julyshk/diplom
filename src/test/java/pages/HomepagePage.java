package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import config.WebDriverProvider;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomepagePage {
    public String audi = "Audi",
            geely = "Geely",
            mercedesBenz = "Mercedes-Benz",
            toyota = "Toyota",
            bmw = "BMW",
            haval = "Haval",
            mitsubishi = "Mitsubishi",
            volkswagen = "Volkswagen",
            chery = "Chery",
            hyundai = "Hyundai",
            nissan = "Nissan",
            omoda = "OMODA",
            landRover = "Land Rover",
            kia = "Kia",
            renault = "Renault",
            lada = "Лада",
            ford = "Ford",
            mazda = "Mazda",
            skoda = "Skoda",
            carEconom = "Эконом",
            carComfort = "Комфорт",
            carBusiness = "Бизнес",
            carPremium = "Премиум",
            regionMoscow = "Москва";

    public SelenideElement
            sectionAdvertisingSearch = $("div[data-ftid=component_cars-list]"),
            sectionCarEconom = $("div[data-ftid=home-auto-block_items] a:nth-child(1)"),
            sectionCarComfort = $("div[data-ftid=home-auto-block_items] a:nth-child(2)"),
            sectionCarBusiness = $("div[data-ftid=home-auto-block_items] a:nth-child(3)"),
            sectionCarPremium = $("div[data-ftid=home-auto-block_items] a:nth-child(4)"),
            homeRegionChange = $("a[data-ga-stats-name=HomeRegionChange]"),
            homepagesButton = $("a[href='https://www.drom.ru']");

    public ElementsCollection
            chapters = $$("[data-ftid=component_header_main-menu-item]"),
            brands = $$("a[data-ftid=component_cars-list-item_hidden-link]"),
            foundCarName = $$("span[data-ftid=bull_title]"),
            regionSearch = $$("a.b-link.regionLink");

    public HomepagePage openPage() {
        open(WebDriverProvider.config.getBaseUrl());

        return this;
    }

    public HomepagePage homeRegionChange() {
        homeRegionChange.click();
        regionSearch.find(text(regionMoscow)).click();
        homepagesButton.click();

        return this;
    }

    public HomepagePage carBrandCheck(String carBrand) {
        sectionAdvertisingSearch.shouldHave(text(carBrand));

        return this;
    }

    public HomepagePage classificationCarCheck(SelenideElement section, String carClassification) {
        section.shouldHave(text(carClassification));

        return this;
    }

    public HomepagePage goToChapter(ElementsCollection chapters, String chapter) {
        chapters.find((text(chapter))).click();
        return this;
    }

    public HomepagePage verifyHeaderForChapter(String header) {
        $("h1").shouldHave(text(header));

        return this;
    }

    public HomepagePage verifySearchCarByBrand(ElementsCollection foundCarName, String carBrand) {
        foundCarName.filterBy(text(carBrand)).shouldHave(size(20));

        return this;
    }
}
