package com.csw.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Shicai implements Serializable {
    private String id;
    private String name;

    public Shicai(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
