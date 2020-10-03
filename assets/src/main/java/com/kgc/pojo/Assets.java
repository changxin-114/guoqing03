package com.kgc.pojo;

import java.util.Date;

public class Assets {
    private Integer id;

    private String assetid;

    private String assetname;

    private Integer assettype;

    private String intodate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssetid() {
        return assetid;
    }

    public void setAssetid(String assetid) {
        this.assetid = assetid == null ? null : assetid.trim();
    }

    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname == null ? null : assetname.trim();
    }

    public Integer getAssettype() {
        return assettype;
    }

    public void setAssettype(Integer assettype) {
        this.assettype = assettype;
    }

    public String getIntodate() {
        return intodate;
    }

    public void setIntodate(String intodate) {
        this.intodate = intodate;
    }
}