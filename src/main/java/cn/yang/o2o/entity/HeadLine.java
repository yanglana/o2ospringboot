package cn.yang.o2o.entity;

import java.util.Date;

/**
 * @Description 头条实体类
 * @Author yanglan
 * @Date 2018/11/22 15:26
 */
public class HeadLine {
    //ID
    private Long lineId;
    //名称
    private String lineName;
    //链接
    private String lineLink;
    //图片
    private String LineImg;
    //权重
    private Integer priority;
    //状态(0.不可用 1.可用)
    private Integer enableStatus;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineLink() {
        return lineLink;
    }

    public void setLineLink(String lineLink) {
        this.lineLink = lineLink;
    }

    public String getLineImg() {
        return LineImg;
    }

    public void setLineImg(String lineImg) {
        LineImg = lineImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
