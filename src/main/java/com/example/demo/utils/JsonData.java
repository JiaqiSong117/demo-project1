package com.example.demo.utils;

public class JsonData  {

    private int statusCode;

    private Object data;

    private String message;

    public JsonData(){}

    public JsonData(int code, Object data){
        this.statusCode = code;
        this.data = data;
    }

    public JsonData(int code, Object data, String msg){
        this.statusCode = code;
        this.data = data;
        this.message = msg;
    }

    public static JsonData buildSuccess(Object data){
        return new JsonData(0,data);
    }

    public static JsonData buildError(String msg){
        return new JsonData(-1,"",msg);
    }

    public static JsonData missingData(String msg){ return new JsonData(-2,"",msg);}

    public static JsonData postSuccess(String msg) { return new JsonData(0,"",msg);}

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
