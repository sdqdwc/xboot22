package com.tianbo22.xboot.modules.base.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author WangCH
 */
@Data
@AllArgsConstructor
public class RedisVo {

    private String key;

    private String value;
}
