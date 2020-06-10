package ru.netology.domain;

import org.w3c.dom.Comment;

public class CommentsInfo {
    private Comment comment;   // Сам комментарий
    private boolean canLikeComment;   // Возможность поставить лайк на комментарий
    private boolean canReplayComment;   // Возможность ответить на комментарий
    private boolean canOpenThread;   // Возможность открыть ветку коментариев
    private boolean canClosedThread;   // Возможность закрыть ветку коментариев
    // + get/set на все поля
}
