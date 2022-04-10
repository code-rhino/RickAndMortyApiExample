package com.codedifferently.rickandmortywidget.domain.characters.service;

import com.codedifferently.rickandmortywidget.domain.characters.models.ShowCharacter;
import com.codedifferently.rickandmortywidget.domain.characters.models.CharactersRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class CharactersServiceImpl implements CharactersService{
    private static Logger logger = LoggerFactory.getLogger(CharactersServiceImpl.class);
    private RestTemplate template;

    public CharactersServiceImpl(){
        this.template = new RestTemplate();
    }


    @Override
    public Optional<List<ShowCharacter>> requestDataFromApi() {
        String url = "https://rickandmortyapi.com/api/character";
        ResponseEntity<CharactersRequest> response = template.exchange(url, HttpMethod.GET, null, CharactersRequest.class);
        logger.info(response.getBody().toString());
        List<ShowCharacter> showCharacters = response.getBody().getResults();
        return Optional.of(showCharacters);
    }
}
