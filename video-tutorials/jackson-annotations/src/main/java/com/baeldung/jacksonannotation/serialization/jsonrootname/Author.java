package com.nklkarthi.jacksonannotation.serialization.jsonrootname;

import com.nklkarthi.jacksonannotation.domain.Item;
import com.nklkarthi.jacksonannotation.domain.Person;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

/**
 * Source code github.com/eugenp/tutorials
 *
 * @author Alex Theedom www.nklkarthi.com
 * @version 1.0
 */
@JsonRootName("writer")
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
}
