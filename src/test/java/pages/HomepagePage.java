package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
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
            volvo = "Volvo",
            exeed = "Exeed",
            kia = "Kia",
            renault = "Renault",
            lada = "Лада",
            ford = "Ford",
            mazda = "Mazda",
            skoda = "Skoda",
            carEconom = "Эконом",
            carComfort = "Комфорт",
            carBusiness = "Бизнес",
            carPremium = "Премиум";

    public SelenideElement
            sectionAdvertisingSearch = $("div[data-ftid=component_cars-list]"),
            sectionCarEconom = $("div[data-ftid=home-auto-block_items] a:nth-child(1)"),
            sectionCarComfort = $("div[data-ftid=home-auto-block_items] a:nth-child(2)"),
            sectionCarBusiness = $("div[data-ftid=home-auto-block_items] a:nth-child(3)"),
            sectionCarPremium = $("div[data-ftid=home-auto-block_items] a:nth-child(4)");

    public ElementsCollection
            chapters = $$("[data-ftid=component_header_main-menu-item]");



    public HomepagePage openPage() {
        open("https://drom.ru");

        return this;
    }

    public HomepagePage carBrandCheck(String carBrand) {
        $(sectionAdvertisingSearch).shouldHave(text(carBrand));
        //$("div[data-ftid=component_cars-list]").shouldHave(text("Audi"));

        return this;
    }

    public HomepagePage classificationCarCheck(SelenideElement section, String carClassification) {
        $(section).shouldHave(text(carClassification));
       // $("div[data-ftid=home-auto-block_items] a:nth-child(1)").shouldHave(text("Эконом"));

        return this;
    }

    public HomepagePage goToChapter(ElementsCollection chapters, String chapter) {
        $$("[data-ftid=component_header_main-menu-item]").find((text(chapter))).click();
        return this;
    }

    public HomepagePage verifyHeaderForChapter(String header) {
        $("h1").shouldHave(text(header));

        return this;
    }
}
