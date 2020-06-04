package ru.netology.domain.attachment;

public class Photo {
    private int id;   // Айди фотографии
    private int albumId;    // Айди альбома, в котором находится фотография
    private int ownerId;    // Айди владельца фотографии
    private int userId;    // Айди пользователя загрузившего фото
    private String text;   // Текст описания фотографии
    private int date;   // Дата добавления фотографии
    private int width;   // ширина фотографии в пикселях
    private int height;   // высота фотографии в пикселях
    // + get/set на все поля
}
