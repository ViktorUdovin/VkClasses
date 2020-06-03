package ru.netology.domain;

public class Location {
    private int locationId; // Айди привязанное к локации
    private String locationName; // Имя локации
    private int latitude; // Географическая широта локации
    private int longitude; // Географическая долгота локации
    private int createdDate; // Дата создания локации
    private String iconUrl; // Иконка локации
    private int checkins; // Количество отметок в этой локации
    private int updateDate; // Дата обновления локации
    private int typeLocation; // Тип локации
    private int countryName; // Название страны
    private int cityName; // Название города
    private String adress; // Адрес локации
    // + get/set на все поля
}
