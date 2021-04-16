package com.csw.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Zhong implements Serializable {
    private String pid;
    private String cid;
    private Caipu caipu;
    private Shicai shicai;

    public Zhong(String pid, String cid) {
        this.pid = pid;
        this.cid = cid;
    }
}
