package com.neighbor.post.repository;

import com.neighbor.post.domain.Category;
import com.neighbor.post.domain.Main;
import com.neighbor.post.domain.Post;
import com.neighbor.post.domain.Product;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface MbPostRepository extends PostRepository{
    @Override
    Optional<Product> findByPostId(Long postId);

    @Override
    List<Category> findByCategoryId(Long categoryId);

    @Override
    Optional<Post> findByMainPostType(String postType);

    @Override
    Optional<Main> findByMainList(Date date);
}
