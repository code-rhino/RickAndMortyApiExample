package com.codedifferently.rickandmortywidget.domain.characters.models;

import java.util.List;

public class CharactersRequest {
    private CharacterInfo info;
    private List<ShowCharacter> results;

    public CharactersRequest() {
    }

    public CharacterInfo getInfo() {
        return info;
    }

    public void setInfo(CharacterInfo info) {
        this.info = info;
    }

    public List<ShowCharacter> getResults() {
        return results;
    }

    public void setResults(List<ShowCharacter> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CharactersRequest{" +
                "info=" + info +
                ", results=" + results +
                '}';
    }
}
