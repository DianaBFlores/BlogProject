package com.tts.TechTalentBlog.service;

import com.tts.TechTalentBlog.model.BlogPost;

import java.util.Optional;

public interface BlogPostService {

    BlogPost addNewBlogPost(BlogPost blogPost);

    Iterable<BlogPost> getAllBlogPosts();

    void deletePostById(Long id);

}
