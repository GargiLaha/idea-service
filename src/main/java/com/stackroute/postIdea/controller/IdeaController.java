package com.stackroute.postIdea.controller;


import com.stackroute.postIdea.domain.Idea;
import com.stackroute.postIdea.service.IdeaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class IdeaController {

    private IdeaServiceImpl ideaServiceImpl;


    @Autowired
    public IdeaController(IdeaServiceImpl ideaService) {

        this.ideaServiceImpl = ideaService;
    }

    @PostMapping("/addIdea")
    public ResponseEntity<Idea> addIdea(@RequestBody Idea idea) {

        return new ResponseEntity<Idea>(ideaServiceImpl.addIdea(idea), HttpStatus.CREATED);
    }

    @GetMapping("/ideas")
    public ResponseEntity<List<Idea>> getIdeas()
    {
      return new ResponseEntity<List<Idea>>(ideaServiceImpl.displayIdea(), HttpStatus.OK);
    }
    @DeleteMapping("/deleted/{id}")
    public  ResponseEntity<?> deleteIdea(@PathVariable String ideaId)
    {
        ideaServiceImpl.deleteIdea(ideaId);
        return new ResponseEntity<String>("successfully deleted",HttpStatus.GONE);
    }

    @PutMapping("/update")
    public ResponseEntity<Idea> updateIdea(@RequestBody Idea idea){
        System.out.println("idea updated");
        return new ResponseEntity<Idea>(idea,HttpStatus.ACCEPTED);
    }
}
