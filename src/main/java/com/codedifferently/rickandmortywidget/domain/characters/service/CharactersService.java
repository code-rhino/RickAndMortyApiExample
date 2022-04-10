package com.codedifferently.rickandmortywidget.domain.characters.service;

import com.codedifferently.rickandmortywidget.domain.characters.models.ShowCharacter;

import java.util.List;
import java.util.Optional;

public interface CharactersService {
    Optional<List<ShowCharacter>> requestDataFromApi();
}
