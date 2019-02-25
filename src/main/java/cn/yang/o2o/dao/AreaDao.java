package cn.yang.o2o.dao;

import cn.yang.o2o.entity.Area;

import java.util.List;

public interface AreaDao {
    /*
     * @Description 列出区域列表
     * @Param []
     * @Return java.util.List<cn.yang.o2o.entity.Area>
     */
    List<Area> queryArea();
}
