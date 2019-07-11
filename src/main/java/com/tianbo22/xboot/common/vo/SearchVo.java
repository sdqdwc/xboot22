package com.tianbo22.xboot.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author WangCH
 */
@Data
public class SearchVo implements Serializable {

    private String startDate;

    private String endDate;
}
