package com.nyt.kuzmenko.repository.impl;

import com.google.gson.Gson;
import com.nyt.kuzmenko.model.Writer;
import com.nyt.kuzmenko.repository.WriterRepository;

import java.io.FileReader;
import java.io.FileWriter;

public class JsonWriterRepositoryImpl implements WriterRepository {

    private final String FILE_NAME = "writers.json";


    @Override
    public Writer save(Writer writer) {

        Gson gson = new Gson();
        try {
            gson.toJson(writer, new FileWriter(getFilePath(FILE_NAME).toFile()));
        } catch (Exception e) {
            System.out.println("There is error when saving writer : " + e);
        }
        return writer;
    }

    @Override
    public Writer get(Long id) {
        Writer writer = null;
        Gson gson = new Gson();
        try {
            Writer writerFromJson = gson.fromJson(new FileReader(getFilePath(FILE_NAME).toFile()), Writer.class);
            if (writerFromJson.getId().equals(id)) {
                writer = writerFromJson;
            }
        } catch (Exception e) {
            System.out.println("There is error reading writer :" + e);
        }

        return writer;
    }

    @Override
    public Writer update(Writer writer) {
        Gson gson = new Gson();
        try {
            gson.toJson(writer, new FileWriter(getFilePath(FILE_NAME).toFile()));
        } catch (Exception e) {
            System.out.println("There is error when saving writer : " + e);
        }
        return writer;
    }

    @Override
    public void delete(Long id) {
        Gson gson = new Gson();
        try {
            Writer writerFromJson = gson.fromJson(new FileReader(getFilePath(FILE_NAME).toFile()), Writer.class);
            if (writerFromJson.getId().equals(id)) {
                gson.toJson(new Writer(), new FileWriter(getFilePath(FILE_NAME).toFile()));
            }
        } catch (Exception e) {
            System.out.println("There is error reading writer :" + e);
        }

    }

}
