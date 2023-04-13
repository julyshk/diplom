# Проект по автоматизации тестирования сайта Drom.ru
## :receipt: Содержание:

- Технологии и инструменты
- Реализованные проверки
- Запуск тестов
- Allure-отчет
- Интеграция с Allure TestOps
- Видео пример прохождения тестов

## :computer: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure_TO"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://https://telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

## :mag_right: Реализованные проверки

Автоматизированные тесты
- ✓ Проверка списка популярных марок автомобилей на главной странице
- ✓ Классификация автомобилей в секции 'Новые автомобили от дилеров'
- ✓ Проверка перехода в нужный раздел при выборе пункта меню
- ✓ Проверка поиска автомобилей марки, выбранной на главной странице
- ✓ Проверка формы поиска автомобиля
- ✓ Проверка поиска автомобиля по марке
- ✓ Проверка поиска новых автомобилей

## :arrow_forward: Запуск тестов

###  Локальный запуск :
Пример командной строки:
```bash
gradle clean test
```
Получение отчёта:
```bash
allure serve build/allure-results
```

###  Удаленный запуск (в Jenkins):
1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/017-July_Shk-jenkins_diplom_web/">проект</a>

![This is an image](/images/screens/jenkins.png)

2. Выбрать пункт **Собрать с параметрами**
3. В случае необходимости изменить параметры, выбрав значения из выпадающих списков
4. Нажать **Собрать**
5. Результат запуска сборки можно посмотреть в отчёте Allure

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/017-July_Shk-jenkins_diplom_web/8/allure/">Allure report</a>

###  Главное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/allure.png">
</p>

###  Тесты

<p align="center">
<img title="Allure Tests" src="images/screens/allure2.png">
</p>


## <img src="images/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/launch/22173">Allure TestOps</a>
### Общий список всех кейсов
<p align="center">
<img title="Allure Graphics" src="images/screens/testops_tests.png">
</p>

### Dashboard с общими результатами тестирования
<p align="center">
<img title="Allure Graphics" src="images/screens/testops_dashboard.png">
</p>

## <img src="images/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Видео прохождения тестов

<p align="center">
  <img title="Selenoid Video" src="images/video/video.gif">
</p>
