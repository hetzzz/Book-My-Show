package com.het.bookmyshow.Repository;


import com.het.bookmyshow.Entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends JpaRepository<Comments,Integer> {
}
