package com.example.emos.wx.exception;

import lombok.Data;

@Data
public class EmoException extends RuntimeException {

    private int code = 500;
    private String msg;

    public EmoException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public EmoException(String msg, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
    }

    public EmoException(String msg, int code) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public EmoException(String msg, int code, Throwable cause) {
        super(msg, cause);
        this.code = code;
        this.msg = msg;
    }
}
