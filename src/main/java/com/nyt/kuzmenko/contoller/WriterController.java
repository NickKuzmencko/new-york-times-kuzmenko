package com.nyt.kuzmenko.contoller;

import com.nyt.kuzmenko.model.Writer;
import com.nyt.kuzmenko.repository.WriterRepository;

public class WriterController {
    private final WriterRepository writerRepository;

    public WriterController(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }
    public Writer save(Writer writer){
        return writerRepository.save(writer);
    }
    public Writer get (Long id){
        return writerRepository.get(id);
    }
    public Writer update (Writer writer){
        return writerRepository.update(writer);
    }
    public void delete (Long id){
        writerRepository.delete(id);
    }
}
