package com.example.KonstantinBlog.repo;

import com.example.KonstantinBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
