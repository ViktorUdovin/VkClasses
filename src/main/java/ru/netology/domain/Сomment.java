package ru.netology.domain;

public class Сomment {
    private int id;   // Айди комментария
    private String name;   // Имя автора ( пользователь/сообщество) комментария
    private int actualDateAndTime;   // Актуальная дата и время комментария
    private String text;   // Текст комментария
    private LikePostInfo like;   // Лайки на комментарии
    // + get/set на все поля
}
