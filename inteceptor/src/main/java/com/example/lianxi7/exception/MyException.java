package com.example.lianxi7.exception;

public class MyException extends RuntimeException {

    private Integer code;
    private String msg;



    public MyException(){
        super("参数异常");
    }

    public MyException(Integer code){
        super("参数异常");
        this.code=code;
    }



    public MyException(String msg){
        super(msg);
        this.msg=msg;
    }


    public MyException(Integer code,String msg){
        super(msg);
        this.msg=msg;
        this.code=code;
    }









    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
