package ru.netology.domain.attachment;

public class Note {
    private int id;   // Айди заметки
    private int ownerId;   // Айди владельца заметки
    private String title;    // Заголовок заметки
    private String text;   // Текст заметки
    private int date;   // Дата создания заметки
    private int readComments;   // Количество прочитанных комментариев
    private String viewUrl;   // Url страницы для отображения заметки
    // + get/set на все поля
}
