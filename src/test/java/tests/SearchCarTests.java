package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
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

public class SearchCarTests extends TestBase{

    @Test
    @Owner("shkrebayv")
    @DisplayName("Проверка формы поиска автомобиля")
    void formForSearchCarVerify() {
        step("Открыть сайт drom.ru", () -> {
            searchCarPage.openPage();
        });
        step("Нажать 'Поиск объявлений'", () -> {
            searchCarPage.goToSearchCar();
        });
        step("Проверка перехода на страницу поиска автомобиля", () -> {
            searchCarPage.verifyHeader();
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
    @DisplayName("Проверка формы поиска автомобиля")
    void searchCarVerify() {
        step("Открыть сайт drom.ru", () -> {
            searchCarPage.openPage();
        });
        step("Нажать 'Поиск объявлений'", () -> {
            searchCarPage.goToSearchCar();
        });
        step("Ввести в поле 'Марка' Mazda", () -> {
            searchCarPage.setValueToInput(searchCarPage.inputTextBrand, searchCarPage.inputValueBrandMazda, searchCarPage.commonListBrand);
            sleep(5000);
        });
        step("Нажать кнопку 'Показать'", () -> {
            searchCarPage.buttonClick(searchCarPage.buttonSubmit);
            sleep(5000);
        });
      //  step("Проверить, что найдены автомобили марки 'Mazda'", () -> {
      //      searchCarPage.verifyBrandSearchResult(searchCarPage.foundCarName, searchCarPage.foundCarBrandMazda);

       // });


    }


}
