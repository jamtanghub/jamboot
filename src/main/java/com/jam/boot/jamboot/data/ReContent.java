package com.jam.boot.jamboot.data;

public class ReContent implements java.io.Serializable {

    private String uid;
    private boolean status;
    private int code;
    private Object content;
    private Object msg;
    private String debug;
    private String rediect;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public String getRediect() {
        return rediect;
    }

    public void setRediect(String rediect) {
        this.rediect = rediect;
    }
}
