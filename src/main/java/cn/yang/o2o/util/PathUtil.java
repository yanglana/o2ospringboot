package cn.yang.o2o.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 路径处理
 * @Author yanglan
 * @Date 2018/11/28 17:47
 */
@Configuration
public class PathUtil {

    private static Logger logger = LoggerFactory.getLogger(PathUtil.class);
    private static String separator = System.getProperty("file.separator");

    private static String winPath;

    private static String linuxPath;

    private static String shopPath;

    private static String headLinePath;

    private static String shopCategoryPath;

    @Value("${win.base.path}")
    public void setWinPath(String winPath) {
        PathUtil.winPath = winPath;
    }

    @Value("${linux.base.path}")
    public void setLinuxPath(String linuxPath) {
        PathUtil.linuxPath = linuxPath;
    }

    @Value("${shop.relevant.path}")
    public void setShopPath(String shopPath) {
        PathUtil.shopPath = shopPath;
    }

    @Value("${headline.relevant.path}")
    public void setHeadLinePath(String headLinePath) {
        PathUtil.headLinePath = headLinePath;
    }

    @Value("${shopcategory.relevant.path}")
    public void setShopCategoryPath(String shopCategoryPath) {
        PathUtil.shopCategoryPath = shopCategoryPath;
    }

    /*
     * @Description 获取不同系统的图片存储基路径
     * @Param []
     * @Return java.lang.String
     */
    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = winPath;
        } else {
            basePath = linuxPath;
        }
        basePath = basePath.replace("/", separator);
        return basePath;
    }

    /*
     * @Description 获取店铺图片存储路径，将图片分别存储在各自店铺下
     * @Param
     * @Return
     */
    public static String getShopImagePath(long shopId) {
        String imagePath = shopPath + shopId + separator;
        logger.debug("dest:" + imagePath);
        return imagePath.replace("/", separator);
    }

    public static String getShopCategoryImagePath() {
        return shopCategoryPath.replace("/", separator);
    }

    public static String getHeadLineImagePath() {
        return headLinePath.replace("/", separator);
    }

    public static String transferToLink(String path) {
        return path.replace(separator, "/");
    }
}
