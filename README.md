### Db-Con-Pat-Matching-Logging
Цель: проекта попробовать поработать с коннектором базы данных,
освоить паттерн matching (написать на нем что-то типо
state machine), а так же использовать логирование. + научиться
запускать процессы с помощю скрипта написанном на python и bash. 

Архитектура: python/bash скрипт запускает scala приложение которое
подключается к базе данных книжного магазина postgres. В 
зависимости от того какой парраметр приходит из скрипта,
приложение должно прочитать таблицу книг либо таблицу авторов.

    [ ] Реализация State Machine на pattern matching
    [ ] Подключить библиотеку логирования SLF4J
    [ ] С помощю Slick'а подключиться к базеданных книжного магазина (postgres)
    [ ] Вывести список атрибутов в output
    [ ] Написать скрипт на python для запуска (state params)
    [ ] Написать скрипт на bash для запука 

