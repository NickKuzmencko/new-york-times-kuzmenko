package com.nyt.kuzmenko.contoller;

import com.nyt.kuzmenko.model.Post;
import com.nyt.kuzmenko.repository.PostRepository;

public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }

    public Post get(Long id) {
        return postRepository.get(id);
    }

    public Post update(Post post) {
        return postRepository.update(post);
    }

    public void delete(Long id) {
        postRepository.delete(id);
    }
}
