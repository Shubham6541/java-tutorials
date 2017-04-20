package com.nklkarthi.jackson.serialization.jsonserialize;

import com.nklkarthi.jackson.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class Author extends Person {

    List<com.nklkarthi.jackson.domain.Item> items = new ArrayList<>();

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public List<com.nklkarthi.jackson.domain.Item> getItems() {
        return items;
    }

    public void setItems(List<com.nklkarthi.jackson.domain.Item> items) {
        this.items = items;
    }
}
