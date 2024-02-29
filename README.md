# Получение местоположения по ip
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Danikaster_ipPosition&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Danikaster_ipPosition)

Этот проект представляет собой простейший веб-сервис, реализованный на Java с использованием фреймворка Spring Boot и сборщика Maven. Сервис включает ендпоинт, который использует API http://ipwho.is/ для получения информации о заданном IP-адресе.

**Использованные технологии:** OpenJDK 21, Spring Boot 3.2.3, Maven


**Пример использования**
    Откройте браузер или используйте инструмент для тестирования API (например, Postman).
    Отправьте GET-запрос на http://localhost:8080/api/8.8.8.8 (вместо 8.8.8.8 можете использовать другой IP).

Пример ответа:
```
{
  "ip":"200.70.108.152",
  "continent":"South America",
  "country":"Argentina",
  "city":"Béccar",
  "latitude":-34.4640891,
  "longitude":-58.5347609
}
```
