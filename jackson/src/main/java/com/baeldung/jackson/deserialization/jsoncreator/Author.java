package com.nklkarthi.jackson.deserialization.jsoncreator;


import com.nklkarthi.jackson.domain.Person;
import com.nklkarthi.jackson.domain.Item;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {

    List<Item> items = new ArrayList<>();

    @JsonCreator
    public Author(
            @JsonProperty("christianName") String firstName,
            @JsonProperty("surname") String lastName) {
        super(firstName, lastName);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
