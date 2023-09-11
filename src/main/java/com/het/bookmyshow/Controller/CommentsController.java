package com.het.bookmyshow.Controller;

import com.het.bookmyshow.Entity.Comments;
import com.het.bookmyshow.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentsController {

    @Autowired
    CommentsService commentsService;
    @PostMapping("/addComment")
    public ResponseEntity<Comments> addComment(@RequestBody Comments comment){
        commentsService.addComment(comment);
        return new ResponseEntity(comment, HttpStatus.CREATED);
    }
    @GetMapping("/getAllComments")
    public ResponseEntity<List<Comments>> getAllComment(){
        List<Comments> comments = commentsService.getAllComments();
        return new ResponseEntity(comments, HttpStatus.OK);
    }




}
