package com.dianping.dptest.entity;

import java.util.Date;

/**
 * Created by lixia on 16/7/8.
 */
public class Picture {
    /**
     * 图片ID
     */
    private int picId;

    /**
     * 图片路径
     */
    private String url;

    /**
     * 图片标题
     */
    private String title;

    /**
     * 鲜花数
     */
    private int flowerCount;

    /**
     * 回应数
     */
    private int followCount;

    /**
     * 人气
     */
    private int popularity;

    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 最后修改时间
     */
    private Date lastTime;

    /**
     * 上传用户ID
     */
    private int userId;

    /**
     * 最后修改的IP
     */
    private String lastIp;

    /**
     * 图片宽度
     */
    private int width;

    /**
     * 图片高度
     */
    private int height;

    /**
     * 图片来源渠道
     */
    private int clientType;

    /**
     * 图片状态
     */
    private int status;

    /**
     * 图片状态码
     */
    private int statusCode;

    /**
     * 图片隐私性
     */
    private int secret;

    // [start] getters & setters
    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFlowerCount() {
        return flowerCount;
    }

    public void setFlowerCount(int flowerCount) {
        this.flowerCount = flowerCount;
    }

    public int getFollowCount() {
        return followCount;
    }

    public void setFollowCount(int followCount) {
        this.followCount = followCount;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getClientType() {
        return clientType;
    }

    public void setClientType(int clientType) {
        this.clientType = clientType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getSecret() {
        return secret;
    }

    public void setSecret(int secret) {
        this.secret = secret;
    }
    // [end]

}
