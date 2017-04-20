package com.nklkarthi.jacksonannotation.serialization.jsonvalue;

import com.nklkarthi.jacksonannotation.domain.Item;
import com.nklkarthi.jacksonannotation.domain.Person;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Source code github.com/eugenp/tutorials
 *
 * @author Alex Theedom www.nklkarthi.com
 * @version 1.0
 */
public class Author extends Person {

    List<Item> items = new ArrayList<>();

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonValue
    public Map<String,String> toJson() {
        Map<String,String> values = new HashMap<>();
        values.put("name", getFirstName() + " " + getLastName());
        return values;
    }
}
