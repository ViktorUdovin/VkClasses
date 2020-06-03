package ru.netology.domain;

public class VkPost {
    private int postId;   // Номер поста;
    private String groupName;   // Имя группы или пользователя
    private String avtorName;   // Имя автора поста
    private int actualDateAndTime;   //Актуальная дата и время поста
    private String avatarUrl; // Картинка аватара группы или автара пользователя
    private String text;   // Текст поста
    private String[] ImageUrl;   // Массив картинок поста
    private LikePostInfo like;   //Счетчик лайков
    private String postType;   //Тип поста
    private CommentsInfo comment;// Коментарии к посту
    private int countComment;// счетчик комментариев
    private RepostInfo repost;   // Репост пост
    private int viewsCount;   // Счетчик просмотров поста
    private boolean deletePost;   // Возможность удалить запись
    private boolean editPost;   // Возможность редактировать запись
    private boolean pinPost;   // Закрепленна запись или нет
    private String[] attacments;   // Вложения ( такие как аудио/документы/видео); Хотя я не уверен, что это работает именно так!














}


