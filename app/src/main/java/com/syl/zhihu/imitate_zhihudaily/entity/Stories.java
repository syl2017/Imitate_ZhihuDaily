package com.syl.zhihu.imitate_zhihudaily.entity;

import java.util.List;

/**
 * Created by syl on 2017/5/29.
 */

public class Stories {


        /**
         * images : ["http://pic1.zhimg.com/84dadf360399e0de406c133153fc4ab8_t.jpg"]
         * type : 0
         * id : 4239728
         * title : 前苏联监狱纹身百科图鉴
         */

        private int type;
        private int id;
        private String title;
        private List<String> images;

        public void setType(int type) {
            this.type = type;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public int getType() {
            return type;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public List<String> getImages() {
            return images;
        }

}
