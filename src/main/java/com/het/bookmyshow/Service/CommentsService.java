package com.het.bookmyshow.Service;

import com.het.bookmyshow.Entity.Comments;

import java.util.List;


public interface CommentsService {

    public Comments addComment(Comments comment);
    public List<Comments> getAllComments();

}
