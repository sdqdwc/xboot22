package com.tianbo22.xboot.common.exception;

import lombok.Data;

/**
 * @author WangCH
 */
@Data
public class XbootException extends RuntimeException {

    private String msg;

    public XbootException(String msg){
        super(msg);
        this.msg = msg;
    }
}
