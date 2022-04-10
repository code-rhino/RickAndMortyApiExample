package com.codedifferently.rickandmortywidget.domain.characters.controller;

import com.codedifferently.rickandmortywidget.domain.characters.models.ShowCharacter;
import com.codedifferently.rickandmortywidget.domain.characters.service.CharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("characters")
@CrossOrigin("http://localhost:3000")
public class CharacterController {

    private CharactersService charactersService;

    @Autowired
    public CharacterController(CharactersService charactersService) {
        this.charactersService = charactersService;
    }

    @GetMapping("")
    public ResponseEntity<List<ShowCharacter>> getAll(){
        Optional<List<ShowCharacter>> optional = charactersService.requestDataFromApi();
        List<ShowCharacter> characters = optional.get();
        return new ResponseEntity<>(characters, HttpStatus.OK);
    }
}

