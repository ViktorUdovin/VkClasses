package ru.netology.domain;

import org.w3c.dom.Comment;

public class CommentsInfo {
    private Comment comment;   // Сам комментарий
    private boolean canOpenComments;   // Возможность открыть комментарии
    private boolean canClosedComments;   // Возможность закрыть комментарии
    private boolean canCommentedPost;   // Возможность комментировать пост
    private boolean canGroupsCommentedPost;   // Возможность для групп комментировать посты
    // + get/set на все поля
}
