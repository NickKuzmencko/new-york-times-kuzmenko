package com.nyt.kuzmenko.repository;

import com.nyt.kuzmenko.model.Post;

import java.util.List;

public interface PostRepository extends GenericRepository<Post,Long> {
    @Override
    Post save(Post post);

    @Override
    Post get(Long id);

    @Override
    Post update(Post post);

    @Override
    void delete(Long id);


}
