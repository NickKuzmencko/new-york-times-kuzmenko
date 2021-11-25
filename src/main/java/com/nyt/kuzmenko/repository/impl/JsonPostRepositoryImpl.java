package com.nyt.kuzmenko.repository.impl;

import com.google.gson.Gson;
import com.nyt.kuzmenko.model.Post;
import com.nyt.kuzmenko.repository.PostRepository;

import java.io.FileReader;
import java.io.FileWriter;

public class JsonPostRepositoryImpl implements PostRepository {

    private final String FILE_NAME = "posts.json";


    @Override
    public Post save(Post post) {

        Gson gson = new Gson();
        try {
            gson.toJson(post, new FileWriter(getFilePath(FILE_NAME).toFile()));
        } catch (Exception e) {
            System.out.println("There is error when saving post : " + e);
        }
        return post;
    }

    @Override
    public Post get(Long id) {
        Post post = null;
        Gson gson = new Gson();
        try {
            Post postFromJson = gson.fromJson(new FileReader(getFilePath(FILE_NAME).toFile()), Post.class);
            if (postFromJson.getId().equals(id)) {
                post = postFromJson;
            }
        } catch (Exception e) {
            System.out.println("There is error reading post :" + e);
        }

        return post;
    }

    @Override
    public Post update(Post post) {
        Gson gson = new Gson();
        try {
            gson.toJson(post, new FileWriter(getFilePath(FILE_NAME).toFile()));
        } catch (Exception e) {
            System.out.println("There is error when updating post : " + e);
        }
        return post;
    }

    @Override
    public void delete(Long id) {
        Gson gson = new Gson();
        try {
            Post postFromJson = gson.fromJson(new FileReader(getFilePath(FILE_NAME).toFile()), Post.class);
            if (postFromJson.getId().equals(id)) {
                gson.toJson(new Post(), new FileWriter(getFilePath(FILE_NAME).toFile()));
            }
        } catch (Exception e) {
            System.out.println("There is error reading post :" + e);
        }

    }


}
