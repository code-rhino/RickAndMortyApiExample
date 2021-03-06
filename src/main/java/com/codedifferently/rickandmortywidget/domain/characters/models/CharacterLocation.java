package com.codedifferently.rickandmortywidget.domain.characters.models;

public class CharacterLocation {
    private String name;
    private String url;

    public CharacterLocation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CharacterLocation{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
