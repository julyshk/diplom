package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class HomepageTests extends TestBase {

    @Test
    @Owner("shkrebayv")
    @DisplayName("Проверка списка популярных марок автомобилей")
    void checkForSectionServicesForApplicants() {

        step("Открыть сайт drom.ru", () -> {
            homepagePage.openPage();
        });
        step("Проверить список популярных марок автомобилей", () -> {
            homepagePage.carBrandCheck(homepagePage.audi);
            homepagePage.carBrandCheck(homepagePage.geely);
            homepagePage.carBrandCheck(homepagePage.mercedesBenz);
            homepagePage.carBrandCheck(homepagePage.toyota);
            homepagePage.carBrandCheck(homepagePage.bmw);
            homepagePage.carBrandCheck(homepagePage.haval);
            homepagePage.carBrandCheck(homepagePage.mitsubishi);
            homepagePage.carBrandCheck(homepagePage.volkswagen);
            homepagePage.carBrandCheck(homepagePage.chery);
            homepagePage.carBrandCheck(homepagePage.hyundai);
            homepagePage.carBrandCheck(homepagePage.nissan);
            homepagePage.carBrandCheck(homepagePage.volvo);
            homepagePage.carBrandCheck(homepagePage.exeed);
            homepagePage.carBrandCheck(homepagePage.kia);
            homepagePage.carBrandCheck(homepagePage.renault);
            homepagePage.carBrandCheck(homepagePage.lada);
            homepagePage.carBrandCheck(homepagePage.ford);
            homepagePage.carBrandCheck(homepagePage.mazda);
            homepagePage.carBrandCheck(homepagePage.skoda);
        });
    }

    @Test
    @Owner("shkrebayv")
    @DisplayName("Классификация автомобилей в секции 'Новые автомобили от дилеров'")
    void checkForSectionEducationAndConsultations() {
        step("Открыть сайт drom.ru", () -> {
            homepagePage.openPage();
        });
        step("Отображение раздела автомобилей эконом-класса", () -> {
            homepagePage.classificationCarCheck(homepagePage.sectionCarEconom, homepagePage.carEconom);
        });
        step("Отображение раздела автомобилей комфорт-класса", () -> {
            homepagePage.classificationCarCheck(homepagePage.sectionCarComfort, homepagePage.carComfort);
        });
        step("Отображение раздела автомобилей бизнес-класса", () -> {
            homepagePage.classificationCarCheck(homepagePage.sectionCarBusiness, homepagePage.carBusiness);
        });
        step("Отображение раздела автомобилей премиум-класса", () -> {
            homepagePage.classificationCarCheck(homepagePage.sectionCarPremium, homepagePage.carPremium);
        });
    }

    @CsvSource({
            "Автомобили, Продажа автомобилей",
            "Спецтехника, Спецтехника и грузовики - все объявления о продаже и покупке",
            "Запчасти, товары и услуги для авто",
            "Отзывы, Отзывы об автомобилях",
            "Каталог, Каталог автомобилей",
            "Шины, Купить шины"
    })

    @ParameterizedTest(name = "При переходе в раздел {0} должен быть заголовок {1}")
    public void MainMenuCheck(String chapter, String header) {
        homepagePage.openPage();
        homepagePage.goToChapter(homepagePage.chapters, chapter);
        homepagePage.verifyHeaderForChapter(header);

    }

}

