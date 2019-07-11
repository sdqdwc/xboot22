package com.tianbo22.xboot.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author WangCH
 */
@Data
public class City implements Serializable {

    String country;

    String province;

    String city;
}
