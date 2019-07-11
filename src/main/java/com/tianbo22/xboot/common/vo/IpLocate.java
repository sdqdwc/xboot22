package com.tianbo22.xboot.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author WangCH
 */
@Data
public class IpLocate implements Serializable {

    private String retCode;

    private City result;
}

