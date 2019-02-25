package cn.yang.o2o.service;

import cn.yang.o2o.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Description TODO
 * @Author yanglan
 * @Date 2018/11/27 9:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceTest {
    @Autowired
    private AreaService areaService;
    //@Autowired
    //private CacheService cacheService;

    @Test
    public void getAreaList() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals(4, areaList.size());
        //cacheService.removeFromCache(areaService.AREALISTKEY);
        //areaList = areaService.getAreaList();
    }
}
