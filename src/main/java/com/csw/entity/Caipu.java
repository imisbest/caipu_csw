package com.csw.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Caipu implements Serializable {
    private String id;
    private String name;
    private String cover;
    private String xid;
    private String gongyi;
    private String jianjie;
    private Integer count;
    private Caixi caixi;
    private Zhong zhong;
    private List<Shicai> shicaiList;

    public Caipu(String id, String name, String cover, String xid, String gongyi, String jianjie, Integer count) {
        this.id = id;
        this.name = name;
        this.cover = cover;
        this.xid = xid;
        this.gongyi = gongyi;
        this.jianjie = jianjie;
        this.count = count;
    }
}
