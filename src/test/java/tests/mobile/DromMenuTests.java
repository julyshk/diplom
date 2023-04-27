package tests.mobile;

import io.qameta.allure.Allure;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DromMenuTests extends TestBase {

    @Test
    @Owner("shkrebayv")
    @DisplayName("Проверка пунктов меню в разделе 'Меню'")
    @Tag("mobile")
    void checkMenu() {
        Allure.step("Закрыть экран авторизации", () ->
                menuPage.buttonClick(menuPage.closeLoginScreenButton));
        Allure.step("Нажать на кнопку 'Меню'", () ->
                menuPage.buttonClick(menuPage.menuButton));
        Allure.step("Проверить наличие пункта меню 'Вход и регистрация'", () ->
                menuPage.chapterExistCheck(menuPage.submenu, menuPage.registrationSubmenuText));
        Allure.step("Проверить наличие пункта меню 'Отчеты по VIN'", () ->
                menuPage.chapterExistCheck(menuPage.submenu, menuPage.reportVINText));
        Allure.step("Проверить наличие пункта меню 'Оценить автомобиль'", () ->
                menuPage.chapterExistCheck(menuPage.submenu, menuPage.rateACar));
        Allure.step("Проверить наличие пункта меню 'Отзывы об автомобилях'", () ->
                menuPage.chapterExistCheck(menuPage.submenu, menuPage.carReviews));
        Allure.step("Проверить наличие пункта меню 'Статистика аукционов'", () ->
                menuPage.chapterExistCheck(menuPage.submenu, menuPage.auctionStatistics));
        Allure.step("Проверить наличие пункта меню 'Помощь и обратная связь'", () ->
                menuPage.chapterExistCheck(menuPage.submenu, menuPage.helpAndFeedback));
        Allure.step("Проверить наличие пункта меню 'Дром Штрафы'", () ->
                menuPage.chapterExistCheck(menuPage.submenu, menuPage.dromFines));
        Allure.step("Проверить наличие пункта меню 'Дром ПДД'", () ->
                menuPage.chapterExistCheck(menuPage.submenu, menuPage.dromPDD));
    }
}