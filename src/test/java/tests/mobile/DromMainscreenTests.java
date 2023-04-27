package tests.mobile;

import io.qameta.allure.Allure;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class DromMainscreenTests extends TestBase {

    @Test
    @Owner("shkrebayv")
    @DisplayName("Проверка наличия разделов на главном экране")
    @Tag("mobile")
    void checkChapters() {
        Allure.step("Закрыть экран авторизации", () ->
                mainscreenPage.buttonClick(mainscreenPage.closeLoginScreenButton));
        step("Проверить наличие раздела 'Автомобили'", () ->
                mainscreenPage.chapterExistCheck(mainscreenPage.chapters, mainscreenPage.nameChapterAuto));
        step("Проверить наличие раздела 'Спецтехника'", () ->
                mainscreenPage.chapterExistCheck(mainscreenPage.chapters, mainscreenPage.nameChapterSpecial));
        step("Проверить наличие раздела 'Запчасти'", () ->
                mainscreenPage.chapterExistCheck(mainscreenPage.chapters, mainscreenPage.nameChapterSpareParts));
        step("Проверить наличие раздела 'Мотоциклы'", () ->
                mainscreenPage.chapterExistCheck(mainscreenPage.chapters, mainscreenPage.nameChapterMoto));
    }
}