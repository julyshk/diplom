<p  align="center">
<a href="https://drom.ru.ru/"><img src="images/logo/drom.png" alt="Drom.ru"/></a>
</p>
<h1  align="center">
# Проект по автоматизации тестирования сайта <a href="https://drom.ru.ru/">Drom.ru</a></h1>


## :receipt: Содержание:

* <a href="#description">Описание</a>
* <a href="#tools">Технологии и инструменты</a>
* <a href="#cases">Реализованные проверки</a>
* <a href="#console">Запуск тестов из терминала</a>
* <a href="#jenkins">Запуск тестов в Jenkins</a>
* <a href="#allure">Отчеты в Allure</a>
* <a href="#testops">Интеграция с Allure TestOps</a>
* <a href="#telegram">Уведомления в Telegram с использованием бота</a>
* <a href="#selenoidvideo">Видео прохождения теста в Selenoid</a>
* <a href="#browserstackvideo">Видео прохождения теста в Browserstack</a>

<a id="description"></a>

## Описание

Данный проект состоит из автоматизированных:

* UI-тестов для веб-приложения
* тестов для API
* мобильных тестов приложения для Android

<a id="tools"></a>

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
<a href="https://rest-assured.io/"><img src="images/logo/RestAssured.png" width="50" height="50"  alt="Rest Assured"/></a>
<a href="https://developer.android.com/studio/"><img src="images/logo/AndroidStudio.svg" width="50" height="50"  alt="Android Studio"/></a>
<a href="http://appium.io/"><img src="images/logo/Appium.svg" width="50" height="50"  alt="Appium"/></a>
<a href="http://appium.io/"><img src="images/logo/Inspector.png" width="50" height="50"  alt="Appium Inspector"/></a>
<a href="https://www.browserstack.com/"><img src="images/logo/Browserstack.svg" width="50" height="50"  alt="Browserstack"/></a>
</p>

Автотесты написаны на <code>Java</code> с использованием <code>JUnit 5</code> и <code>Gradle</code>, применены различные
библиотеки и фреймворки.

Также реализована сборка в <code>Jenkins</code> с формированием Allure-отчета и отправкой уведомления с результатами
в <code>Telegram</code> после завершения прогона.
В качестве системы управления тестированием выбран <code>Allure TestOps</code>.

Allure-отчет включает в себя:

* шаги выполнения тестов;
* скриншот страницы в браузере в момент окончания автотеста;
* Page Source;
* логи браузерной консоли;
* видео выполнения автотеста.

### Для UI-тестов

* при написании использован фреймворк [Selenide](https://selenide.org/)
* запуск осуществляется локально или с помощью [Selenoid](https://aerokube.com/selenoid/).

### Для API-тестов

* при написании использована библиотека [REST Assured](https://rest-assured.io)
* для сокращения шаблонного кода применена библиотека [Lombok](https://projectlombok.org/)

### Для mobile-тестов

* при написании использован фреймворк с открытым исходным кодом [Appium](https://appium.io)
* для просмотра и взаимодействия с элементами интерфейса
  выбран [Appium Inspector](https://github.com/appium/appium-inspector)
* запуск может осуществляться локально в эмуляторе [Android Studio](https://developer.android.com/studio)
* удаленный запуск осуществляется с помощью фермы реальных мобильных
  устройств [Browserstack](https://app-automate.browserstack.com/)


<a id="cases"></a>

## :mag_right: Реализованные проверки

Автоматизированные проверки UI
- ✓ Проверка списка популярных марок автомобилей на главной странице
- ✓ Классификация автомобилей в секции 'Новые автомобили от дилеров'
- ✓ Проверка перехода в нужный раздел при выборе пункта меню
- ✓ Проверка поиска автомобилей марки, выбранной на главной странице
- ✓ Проверка формы поиска автомобиля
- ✓ Проверка поиска автомобиля по марке
- ✓ Проверка поиска новых автомобилей

Автоматизированные проверки API
- ✓ Проверка запроса поиска всех автомобилей (GET)
- ✓ Добавление объявления о продаже автомобиля в избранное (POST)
- ✓ Удаление объявления о продаже автомобиля из избранного (POST)
- ✓ Переход к заполнению формы подачи объявления (GET)
- ✓ Ошибка при переходе к заполнению формы подачи объявления (GET)

Автоматизированные проверки MOBILE APP
- ✓ Проверка разделов на главном экране приложения
- ✓ Проверка пунктов меню
- ✓ Проверка разделов при подаче объявления о продаже

<a id="console"></a>

## :arrow_forward: Запуск тестов

### Локальный запуск тестов

#### Для UI-тестов
```bash
gradle clean web -Denv=local 
```

#### Для API-тестов
```bash
gradle clean api
```

#### Для MOBILE-тестов
```bash
gradle clean mobile -DdeviceHost=emulator
```
<a id="jenkins"></a>

###  <img src="images/logo/Jenkins.svg" width="25" height="25"/><a> Удаленный запуск (в Jenkins): </a>
1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/017-July_Shk-jenkins_diplom/">проект</a>

![This is an image](/images/screens/jenkins.png)

2. Выбрать пункт **Собрать с параметрами**
3. Для запуска ui-тестов необходимо в <code>TYPE</code> выбрать <code>web</code> и указать параметры для сборки <code>BROWSER_NAME</code>, <code>BROWSER_VERSION</code>, <code>BROWSER_SIZE</code>, <code>REMOTE_URL</code> либо оставить их заполненными по умолчанию
4. Для запуска api-тестов необходимо в <code>TYPE</code> выбрать <code>api</code>, а остальные поля оставить заполненными по умолчанию
5. Для запуска molile-тестов необходимо в <code>TYPE</code> выбрать <code>mobile</code> и указать параметр для сборки <code>DEVICE_HOST</code>
6. Для запуска всех тестов необходимо в <code>TYPE</code> выбрать <code>test</code>
7. Нажать **Собрать**
8. Результат запуска сборки можно посмотреть в отчёте Allure

<a id="allure"></a>

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/017-July_Shk-jenkins_diplom_web/8/allure/">Allure report</a>

###  Главное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/allure.png">
</p>

###  Тесты

<p align="center">
<img title="Allure Tests" src="images/screens/allure2.png">
</p>

<a id="testops"></a>

## <img src="images/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/launch/22930">Allure TestOps</a>
### Общий список всех кейсов
<p align="center">
<img title="Allure Graphics" src="images/screens/testops_tests.png">
</p>

### Dashboard с общими результатами тестирования
<p align="center">
<img title="Allure Graphics" src="images/screens/testops_dashboard.png">
</p>

<a id="telegram"></a>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram о результатах прогона тестов

<p align="center">
<img title="Telegram" src="images/screens/telegram.jpeg" width="400" >
</p>

<a id="selenoidvideo"></a>

## <img src="images/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Видео прохождения тестов в Selenoid

<p align="center">
  <img title="Selenoid Video" src="images/video/video.gif">
</p>

<a id="browserstackvideo"></a>

## <img src="images/logo/Browserstack.svg" width="25" height="25"  alt="Allure"/></a> Видео прохождения тестов в Browserstack

<p align="center">
  <img title="Browserstck Video" src="images/video/video_mobile.gif">
</p>