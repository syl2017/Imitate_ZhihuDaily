package com.syl.zhihu.imitate_zhihudaily.entity;

import java.util.List;

/**
 * Created by syl on 2017/5/29.
 */

public class TopStries {

        /**
         * image : https://pic4.zhimg.com/v2-88e4cffeae583b09bfa1ef26789ea403.jpg
         * type : 0
         * id : 9445586
         * ga_prefix : 052907
         * title : 连柯洁都连输三场，围棋界还好吗？
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public void setImage(String image) {
            this.image = image;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public int getType() {
            return type;
        }

        public int getId() {
            return id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public String getTitle() {
            return title;
        }

}
