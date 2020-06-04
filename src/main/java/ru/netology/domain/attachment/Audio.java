package ru.netology.domain.attachment;

public class Audio {
    private int id;   // Айди аудиозаписи
    private int ownerId;    // Айди владельца аудиозаписи
    private String artist;   // Имя исполнителя
    private String title;   // Название песни
    private int duration;   // длительность аудиозаписи в секундах
    private String url;   // Ссылка на mp3
    private int lirycsId;   // Айди текста аудиозаписи
    private int albumId;   // Айди альбома аудиозаписи
    private int genreId;   // Айди жанра аудиозаписи
    private int date;   // Дата создания аудиозаписи
    private int noSearch;   // Отсутствие аудиозаписи в поиске
    private int isHq;   // Наличие высокого качества у аудиозаписи
    // + get/set на все поля
}
