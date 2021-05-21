package com.tts.TechTalentBlog.repository;

import com.tts.TechTalentBlog.model.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface BlogPostRepository extends CrudRepository <BlogPost, Long> {

//    ArrayList<BlogPost>findAll();

    Optional<Book> findByAuthor(String author);
    Iterable<Book> findByOrderByTitleAsc();

    void deletePostById(Long Id);
}

