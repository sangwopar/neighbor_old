package com.neighbor.post.repository;

import com.neighbor.post.domain.Category;
import com.neighbor.post.domain.Main;
import com.neighbor.post.domain.Post;
import com.neighbor.post.domain.Product;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Optional<Product> findByPostId(Long postId);
    List<Category> findByCategoryId(Long categoryId);
    Optional<Post> findByMainPostType(String postType);

    Optional<Main> findByMainList(Date date);
}
