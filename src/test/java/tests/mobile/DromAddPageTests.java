package tests.mobile;

import io.qameta.allure.Allure;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DromAddPageTests extends TestBase {

    @Test
    @Owner("shkrebayv")
    @DisplayName("Проверка наличия разделов при подаче объявления")
    @Tag("mobile")
    void checkAddPage() {
        Allure.step("Закрыть экран авторизации", () ->
                addPagePage.buttonClick(addPagePage.closeLoginScreenButton));
        Allure.step("Нажать на кнопку 'Добавить'", () ->
                addPagePage.buttonClick(addPagePage.addButton));
        Allure.step("Проверить наличие раздела 'Легковые авто'", () ->
                addPagePage.elementVisibleCheck(addPagePage.elementCars));
        Allure.step("Проверить наличие раздела 'Грузовики и спецтехника'", () ->
                addPagePage.elementVisibleCheck(addPagePage.elementTrucksAndSpecialVehicles));
        Allure.step("Проверить наличие кнопки закрытия шторки", () ->
                addPagePage.elementVisibleCheck(addPagePage.elementCloseButton));
    }
}