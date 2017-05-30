package com.syl.zhihu.imitate_zhihudaily.test;

import java.util.List;

/**
 * Created by syl on 2017/5/30.
 */

public class PostQueryInfo {

    /**
     * message : ok
     * nu : 3991233058401
     * ischeck : 1
     * condition : F00
     * com : yunda
     * status : 200
     * state : 3
     * data : [{"time":"2017-05-30 17:11:46","ftime":"2017-05-30 17:11:46","context":"[安徽合肥包河卫岗公司]快件已被 已签收 签收","location":"安徽合肥包河卫岗公司"},{"time":"2017-05-30 16:46:30","ftime":"2017-05-30 16:46:30","context":"[安徽合肥包河卫岗公司]进行派件扫描；派送业务员：李华伟；联系电话：13856992544","location":"安徽合肥包河卫岗公司"},{"time":"2017-05-30 12:54:35","ftime":"2017-05-30 12:54:35","context":"[安徽合肥包河卫岗公司]到达目的地网点，快件将很快进行派送","location":"安徽合肥包河卫岗公司"},{"time":"2017-05-30 09:15:36","ftime":"2017-05-30 09:15:36","context":"[安徽合肥分拨中心]从站点发出，本次转运目的地：安徽合肥包河卫岗公司","location":"安徽合肥分拨中心"},{"time":"2017-05-30 08:00:01","ftime":"2017-05-30 08:00:01","context":"[安徽合肥分拨中心]在分拨中心进行卸车扫描","location":"安徽合肥分拨中心"},{"time":"2017-05-29 22:19:06","ftime":"2017-05-29 22:19:06","context":"[湖北武汉分拨中心]进行装车扫描，即将发往：安徽合肥分拨中心","location":"湖北武汉分拨中心"},{"time":"2017-05-29 21:57:49","ftime":"2017-05-29 21:57:49","context":"[湖北武汉分拨中心]进行中转集包扫描，将发往：安徽合肥网点包","location":"湖北武汉分拨中心"},{"time":"2017-05-29 21:35:52","ftime":"2017-05-29 21:35:52","context":"[湖北武汉分拨中心]在分拨中心进行称重扫描","location":"湖北武汉分拨中心"},{"time":"2017-05-29 19:12:08","ftime":"2017-05-29 19:12:08","context":"[湖北市场部大智公司宗关淘宝分部]进行揽件扫描","location":"湖北市场部大智公司宗关淘宝分部"}]
     */

    private String message;
    private String nu;
    private String ischeck;
    private String condition;
    private String com;
    private String status;
    private String state;
    private List<DataEntity> data;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setNu(String nu) {
        this.nu = nu;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public String getNu() {
        return nu;
    }

    public String getIscheck() {
        return ischeck;
    }

    public String getCondition() {
        return condition;
    }

    public String getCom() {
        return com;
    }

    public String getStatus() {
        return status;
    }

    public String getState() {
        return state;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public static class DataEntity {
        /**
         * time : 2017-05-30 17:11:46
         * ftime : 2017-05-30 17:11:46
         * context : [安徽合肥包河卫岗公司]快件已被 已签收 签收
         * location : 安徽合肥包河卫岗公司
         */

        private String time;
        private String ftime;
        private String context;
        private String location;

        public void setTime(String time) {
            this.time = time;
        }

        public void setFtime(String ftime) {
            this.ftime = ftime;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getTime() {
            return time;
        }

        public String getFtime() {
            return ftime;
        }

        public String getContext() {
            return context;
        }

        public String getLocation() {
            return location;
        }
    }
}
