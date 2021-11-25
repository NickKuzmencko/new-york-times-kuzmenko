package com.nyt.kuzmenko.repository;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public interface GenericRepository<T, ID> {

    T save(T t);

    T get(ID id);

    T update(T t);

    void delete(ID id);

    default Path getFilePath(String fileName) {
        Path path = null;
        try {
            path = Paths.get(getClass().getResource("entities/" + fileName).toURI());
        } catch (Exception e) {
            System.out.println("There is no file with name: " + fileName + ", error " + e);
        }
        return path;
    }


}
