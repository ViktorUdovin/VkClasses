package ru.netology.domain.attachment;

public class Link {
    private String url;   // URl ссылки
    private String title;   // Заголовок ссылки
    private String caption;   // подпись ссылки
    private String description;   // описание ссылки
    private Photo photo;   // изображение првеью
    private String product;   // информация о продукте
    private Object button;   // информация о кнопке для перехода на сторонний ресурс
    private int prevewPage;   // айди страницы с контентом для предпросмотра
    private String previewurl;   // URL страницы с контентом для предпросмотра
    // + get/set на все поля
}
