package com.nyt.kuzmenko.repository.impl;

import com.google.gson.Gson;
import com.nyt.kuzmenko.model.Label;
import com.nyt.kuzmenko.repository.LabelRepository;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonLabelRepositoryImpl implements LabelRepository {

    private final String FILE_NAME="labels.json";

    @Override
    public Label save(Label label) {
        Gson gson = new Gson();
        try {
            gson.toJson(label,new FileWriter(getFilePath(FILE_NAME).toFile()));
        } catch (Exception e) {
            System.out.println("There is error when saving label : " + e);
        }
        return label;
    }

    @Override
    public Label get(Long id) {
        Label label = null;
        Gson gson = new Gson();
        try {
            Label labelFromJson = gson.fromJson(new FileReader(getFilePath(FILE_NAME).toFile()), Label.class);
            if (labelFromJson.getId().equals(id)) {
                label = labelFromJson;
            }
        } catch (Exception e) {
            System.out.println("There is error reading label :" + e);
        }

        return label;
    }

    @Override
    public Label update(Label label) {
        Gson gson = new Gson();
        try {
            gson.toJson(label,new FileWriter(getFilePath(FILE_NAME).toFile()));
        } catch (Exception e) {
            System.out.println("There is error when updating label : " + e);
        }
        return label;
    }

    @Override
    public void delete(Long id) {
        Gson gson = new Gson();
        try {
            Label labelFromJson = gson.fromJson(new FileReader(getFilePath(FILE_NAME).toFile()), Label.class);
            if (labelFromJson.getId().equals(id)) {
                gson.toJson(new Label(),new FileWriter(getFilePath(FILE_NAME).toFile()));
            }
        } catch (Exception e) {
            System.out.println("There is error reading label :" + e);
        }

    }




}
