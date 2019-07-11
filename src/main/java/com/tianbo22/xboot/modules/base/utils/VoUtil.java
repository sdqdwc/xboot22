package com.tianbo22.xboot.modules.base.utils;

import com.tianbo22.xboot.modules.base.entity.Permission;
import com.tianbo22.xboot.modules.base.vo.MenuVo;
import cn.hutool.core.bean.BeanUtil;

/**
 * @author WangCH
 */
public class VoUtil {

    public static MenuVo permissionToMenuVo(Permission p){

        MenuVo menuVo = new MenuVo();
        BeanUtil.copyProperties(p, menuVo);
        return menuVo;
    }
}
