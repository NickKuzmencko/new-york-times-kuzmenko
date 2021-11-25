package com.nyt.kuzmenko.contoller;

import com.nyt.kuzmenko.model.Label;
import com.nyt.kuzmenko.repository.LabelRepository;

public class LabelController {
    private final LabelRepository labelRepository;

    public LabelController(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }
    public Label save (Label label){
        return labelRepository.save(label);
    }
    public Label get (Long id){
        return labelRepository.get(id);
    }
    public Label update (Label label){
        return labelRepository.update(label);
    }
    public void delete(Long id){
        labelRepository.delete(id);
    }
}
