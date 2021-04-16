package com.csw.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Studd implements Serializable {
    private String id;
    private String uid;
    private String pid;
    private Caipu caipu;
    private User user;

    public Studd(String id, String uid, String pid) {
        this.id = id;
        this.uid = uid;
        this.pid = pid;
    }

    public void add(Studd studd) {
    }
}
