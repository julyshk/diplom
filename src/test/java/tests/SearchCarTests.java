package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SearchCarTests extends TestBase{

    @Test
    @Owner("shkrebayv")
    @DisplayName("Проверка формы поиска автомобиля")
    void formForSearchCarVerify() {
        step("Нажать 'Поиск объявлений'", () -> {
            searchCarPage.goToSearchCar();
        });
        step("Проверка перехода на страницу поиска автомобиля", () -> {
            searchCarPage.verifyHeader(searchCarPage.headerCarsSale, searchCarPage.textHeaderCarsSale);
        });
        step("Проверка поля 'Марка' на форме поиска", () -> {
            searchCarPage.verifyInputOnFormSearch(searchCarPage.inputTextBrand);
        });
        step("Проверка поля 'Модель' на форме поиска", () -> {
            searchCarPage.verifyInputOnFormSearch(searchCarPage.inputTextModel);
        });
        step("Проверка поля 'Поколение' на форме поиска", () -> {
            searchCarPage.verifyButtonOnFormSearch(searchCarPage.buttonOnFormSearch, searchCarPage.buttonTextGeneration);
        });
        step("Проверка кнопки '+' на форме поиска", () -> {
            searchCarPage.verifyButtonMoreOnFormSearch(searchCarPage.buttonPlus);
        });
        step("Проверка поля 'Цена от' на форме поиска", () -> {
            searchCarPage.verifyInputOnFormSearch(searchCarPage.inputTextMinPrice);
        });
        step("Проверка поля 'Цена до' на форме поиска", () -> {
            searchCarPage.verifyInputOnFormSearch(searchCarPage.inputTextMaxPrice);
        });
        step("Проверка поля 'Год от' на форме поиска", () -> {
            searchCarPage.verifyButtonOnFormSearch(searchCarPage.buttonOnFormSearch, searchCarPage.buttonTextMinYear);
        });
        step("Проверка поля 'Год до' на форме поиска", () -> {
            searchCarPage.verifyButtonOnFormSearch(searchCarPage.buttonOnFormSearch, searchCarPage.buttonTextMaxYear);
        });
        step("Проверка поля 'КПП' на форме поиска", () -> {
            searchCarPage.verifyButtonOnFormSearch(searchCarPage.buttonOnFormSearch, searchCarPage.buttonTextKPP);
        });
        step("Проверка поля 'Топливо' на форме поиска", () -> {
            searchCarPage.verifyButtonOnFormSearch(searchCarPage.buttonOnFormSearch, searchCarPage.buttonTextFuel);
        });
        step("Проверка поля 'Объем от' на форме поиска", () -> {
            searchCarPage.verifyButtonOnFormSearch(searchCarPage.buttonOnFormSearch, searchCarPage.buttonTextVolume);
        });
        step("Проверка поля 'Привод' на форме поиска", () -> {
            searchCarPage.verifyButtonOnFormSearch(searchCarPage.buttonOnFormSearch, searchCarPage.buttonTextDriveUnit);
        });
        step("Проверка фильтра 'Непроданные' на форме поиска", () -> {
            searchCarPage.verifyLabelOnFormSearch(searchCarPage.labelUnsold);
        });
        step("Проверка фильтра 'Фото' на форме поиска", () -> {
            searchCarPage.verifyLabelOnFormSearch(searchCarPage.labelPhoto);
        });
        step("Проверка кнопки 'Расширенный поиск' на форме поиска", () -> {
            searchCarPage.verifyButtonMoreOnFormSearch(searchCarPage.buttonAdvancedSearch);
        });
        step("Проверка кнопки 'Показать' на форме поиска", () -> {
            searchCarPage.verifyButtonMoreOnFormSearch(searchCarPage.buttonSubmit);
        });
    }

    @Test
    @Owner("shkrebayv")
    @DisplayName("Проверка поиска автомобиля по марке")
    void searchCarbyBrandVerify() {
        step("Нажать 'Поиск объявлений'", () -> {
            searchCarPage.goToSearchCar();
        });
        step("Ввести в поле 'Марка' Mazda", () -> {
            searchCarPage.setValueToInput(searchCarPage.inputTextBrand, searchCarPage.inputValueBrandMazda, searchCarPage.commonListBrand);
        });
        step("Нажать кнопку 'Показать'", () -> {
            searchCarPage.buttonClick(searchCarPage.buttonSubmit, searchCarPage.buttonTextShow);
        });
        step("Проверить, что все автомобили на странице марки 'Mazda'", () -> {
            searchCarPage.verifySearchResult(searchCarPage.foundCarName, searchCarPage.foundCarBrandMazda);
        });
    }

    @Test
    @Owner("shkrebayv")
    @DisplayName("Проверка поиска новых автомобилей")
    void searchNewCarVerify() {
        step("Нажать 'Поиск объявлений'", () -> {
            searchCarPage.goToSearchCar();
        });
        step("Нажать на 'Новые автомобили'", () -> {
            searchCarPage.buttonClick(searchCarPage.newCarClick, searchCarPage.textNewCar);
            sleep(5000);
        });
        step("Проверить заголовок страницы 'Продажа новых автомобилей'", () -> {
            searchCarPage.verifyHeader(searchCarPage.headerNewCarsSale, searchCarPage.textHeaderNewCarsSale);
        });
        step("Проверить у всех найденных автомобилей отметка 'Новый'", () -> {
            searchCarPage.verifySearchResult(searchCarPage.foundNewCar, searchCarPage.textFoundNewCar);
        });
    }

}
