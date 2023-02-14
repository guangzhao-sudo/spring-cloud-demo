package com.example.lianxi7.util;

import com.example.lianxi7.exception.MyException;

public class AressUtil {
    public static void isTure(boolean flage,String msg){
        throw new MyException(msg);
    }
}
