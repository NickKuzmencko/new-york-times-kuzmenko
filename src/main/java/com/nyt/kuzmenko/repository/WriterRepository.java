package com.nyt.kuzmenko.repository;

import com.nyt.kuzmenko.model.Writer;

import java.util.List;

public interface WriterRepository extends GenericRepository<Writer, Long> {
    @Override
    Writer save(Writer writer);

    @Override
    Writer get(Long id);

    @Override
    Writer update(Writer writer);

    @Override
    void delete(Long id);


}
