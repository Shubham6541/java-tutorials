package com.nklkarthi.jacksonannotation.deserialization.jsonsetter;

import com.nklkarthi.jacksonannotation.domain.Item;
import com.nklkarthi.jacksonannotation.domain.Person;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;
import java.util.List;

/**
 * Source code github.com/eugenp/tutorials
 *
 * @author Alex Theedom www.nklkarthi.com
 * @version 1.0
 */
public class Author extends Person {

    private List<Item> items = new ArrayList<>();

    public Author(){
        super();
    }

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @JsonIgnore
    public List<Item> getItems() {
        return items;
    }

    @JsonSetter("publications")
    public void setItems(List<Item> items) {
        this.items = items;
    }
}
