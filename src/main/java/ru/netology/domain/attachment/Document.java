package ru.netology.domain.attachment;

public class Document {
    private int id;   // Айди документа
    private int ownerId;    // Айди пользователя, загрузившего документ
    private String title;   // Название документа
    private int size;   // Размер документа в байтах
    private String ext;   // Расширение документа
    private String url;   // адрес документа,по которому его можно загрузить
    private int date;   // Дата добавления документа
    private String type;   // Определение типа докумнета
    // + get/set на все поля
}
