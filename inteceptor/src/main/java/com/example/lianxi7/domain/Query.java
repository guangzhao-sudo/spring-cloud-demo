package com.example.lianxi7.domain;

public class Query {
    private String username;
    private  Integer pageno=1;
    private Integer pagesize=10;


    public Query() {
    }

    public Query(String username, Integer pageno, Integer pagesize) {
        this.username = username;
        this.pageno = pageno;
        this.pagesize = pagesize;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPageno() {
        return pageno;
    }

    public void setPageno(Integer pageno) {
        this.pageno = pageno;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }
}
