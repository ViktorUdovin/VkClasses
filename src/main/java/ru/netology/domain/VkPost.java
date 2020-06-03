package ru.netology.domain;

public class VkPost {
    private int postId;   // Номер поста;
    private String groupName;   // Имя группы или пользователя
    private String authorName;   // Имя автора поста
    private int actualDateAndTime;   //Актуальная дата и время поста
    private String avatarUrl; // Картинка аватара группы или автара пользователя
    private String text;   // Текст поста
    private String[] ImageUrl;   // Массив картинок поста
    private LikePostInfo like;   //Лайки на посте
    private String postType;   //Тип поста
    private CommentsInfo comments;// Коментарии к посту
    private int countComment;// счетчик комментариев
    private RepostInfo share;   // Репост
    private int viewsCount;   // Счетчик просмотров поста
    private int deferredPost;   // отложенная запись
    private boolean deletePost;   // Возможность удалить пост
    private boolean editPost;   // Возможность редактировать пост
    private boolean pinPost;   // Закрепленна запись или нет
    private boolean canPinPost;   // Возможность закреплять пост
    private boolean advertisingInPost;   // Наличие реклама в посте
    private boolean favouritePost;   // Возможность добавить пост в избранное
    private String[] attachments;   // Вложения ( такие как аудио/документы/видео); Хотя я не уверен, что это работает именно так!
    private GeoLocation location;  // Геопозиция прикрепленная к посту
    // + get/set на все поля
}


