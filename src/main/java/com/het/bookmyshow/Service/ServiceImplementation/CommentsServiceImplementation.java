package com.het.bookmyshow.Service.ServiceImplementation;

import com.het.bookmyshow.Entity.Comments;
import com.het.bookmyshow.Repository.CommentsRepository;
import com.het.bookmyshow.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImplementation implements CommentsService {
    @Autowired
    CommentsRepository commentsRepository;
    public Comments addComment(Comments comment){
        commentsRepository.save(comment);
        return comment;
    }

    public List<Comments> getAllComments(){
        return commentsRepository.findAll();
    }

}
