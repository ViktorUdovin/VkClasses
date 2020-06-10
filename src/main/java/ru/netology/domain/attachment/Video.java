package ru.netology.domain.attachment;

public class Video {
    private int id;   // Айди видеозаписи
    private int ownerId;    // Айди владельца видеозаписи
    private String description;   // Описание видео
    private int duration;   // длительность видеозаписи в секундах
    private String photo130;   // URL изображения-обложки видеозаписи с размером 130x98 px
    private String photo320;   // URL изображения-обложки видеозаписи с размером 320x240 px
    private String photo640;   // URL изображения-обложки видеозаписи с размером 640x480 px
    private String photo800;   // URL изображения-обложки видеозаписи с размером 800x450 px
    private String photo1280 ;   // URL изображения-обложки видеозаписи с размером до 1280 px по ширине
    private String firstFrame130 ;   // URL изображения первого кадра видеозаписи с размером 130x98 px
    private String firstFrame320 ;   // URL изображения первого кадра видеозаписи с размером 320x240 px
    private String firstFrame640 ;   // URL изображения первого кадра видеозаписи с размером 640x480 px
    private String firstFrame800 ;   // URL изображения первого кадра видеозаписи с размером 800x450 px
    private String firstFrame1280 ;   // URL изображения первого кадра видеозаписи с размером до 1280 px по ширине
    private int date;   // Дата создания видеозаписи
    private int addingDate;   // Дата добавления видеозаписи
    private int views;   // Количество просмотров видеозаписи
    private int comments;   // Количество комментариев к видео
    private String playerUrl;   // URL страницы с плеером, который можно использовать для воспроизведения видеозаписи в браузере
    private String platform;   // Название платформы (для видеозаписей, добавленных с внешних сайтов)
    private boolean canEdit;   // Возможность редактировать видеозапись
    private boolean canAdd;   // Возможность добавлять видеозапись
    private boolean isPrivate;   // Приватная ли видеозапись
    private String accessKey;   // Ключ доступ к обьекту
    private boolean processing;   // Находится ли видеозапись в проццесе обработки
    private boolean liveTranslation;   // Является ли видеозапись прямой трансляцией
    private boolean isFavourite;   // Добавлена ли видеозапись в закладки
    // + get/set на все поля
}
