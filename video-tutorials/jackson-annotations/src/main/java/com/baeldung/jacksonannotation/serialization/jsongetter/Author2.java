package com.nklkarthi.jacksonannotation.serialization.jsongetter;


import com.nklkarthi.jacksonannotation.domain.Item;
import com.nklkarthi.jacksonannotation.domain.Person;
import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.ArrayList;
import java.util.List;

/**
 * Source code github.com/eugenp/tutorials
 *
 * @author Alex Theedom www.nklkarthi.com
 * @version 1.0
 */
public class Author2 extends Person {

    List<Item> items = new ArrayList<>();

    public Author2(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @JsonGetter("publications")
    public List<Item> getItems() {
        return items;
    }


    public void setItems(List<Item> items) {
        this.items = items;
    }
}
