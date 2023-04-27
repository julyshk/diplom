package tests.web;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static io.qameta.allure.Allure.step;

public class HomepageTests extends TestBase {

    @Test
    @Owner("shkrebayv")
    @Tag("web")
    @DisplayName("Проверка списка популярных марок автомобилей")
    void checkForSectionServicesForApplicants() {
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
            homepagePage.carBrandCheck(homepagePage.landRover);
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
    @Tag("web")
    @DisplayName("Классификация автомобилей в секции 'Новые автомобили от дилеров'")
    void checkForSectionEducationAndConsultations() {
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

    @Owner("shkrebayv")
    @Tag("web")
    @ParameterizedTest(name = "При переходе в раздел {0} должен быть заголовок {1}")
    @CsvFileSource(resources = "/csv/menuChapter.csv")
    public void MainMenuCheck(String chapter, String header) {
        step("Перейти в раздел меню", () -> {
            homepagePage.goToChapter(homepagePage.chapters, chapter);
        });
        step("Проверить заголовок страницы", () -> {
            homepagePage.verifyHeaderForChapter(header);
        });
    }

    @Owner("shkrebayv")
    @Tag("web")
    @ParameterizedTest(name = "При выборе марки {0} в поиске отображаются авто марки {1}")
    @CsvFileSource(resources = "/csv/carBrands.csv")
    public void searchCarByBrand(String searchBrand, String carBrand) {
        step("Нажать на марку автомобиля на главном экране в секции 'Поиск объявлений'", () -> {
            homepagePage.goToChapter(homepagePage.brands, searchBrand);
        });
        step("Проверить, что все автомобили на странице выбранной марки", () -> {
            homepagePage.verifySearchCarByBrand(homepagePage.foundCarName, carBrand);
        });
    }
}

