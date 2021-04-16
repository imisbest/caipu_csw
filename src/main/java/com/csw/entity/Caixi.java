package com.csw.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Caixi implements Serializable {
    private String id;
    private String name;

    public Caixi(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
