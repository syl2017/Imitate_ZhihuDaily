package com.syl.zhihu.imitate_zhihudaily.entity;

import java.util.List;

/**
 * Created by syl on 2017/5/29.
 */

public class LatestStories {

    /**
     * date : 20140523
     * stories : [{"title":"中国古代家具发展到今天有两个高峰，一个两宋一个明末（多图）","ga_prefix":"052321","images":["http://p1.zhimg.com/45/b9/45b9f057fc1957ed2c946814342c0f02.jpg"],"type":0,"id":3930445},"..."]
     * top_stories : [{"title":"商场和很多人家里，竹制家具越来越多（多图）","image":"http://p2.zhimg.com/9a/15/9a1570bb9e5fa53ae9fb9269a56ee019.jpg","ga_prefix":"052315","type":0,"id":3930883},"..."]
     */

    private String date;
    private List<StoriesEntity> stories;
    private List<TopStoriesEntity> top_stories;

    public void setDate(String date) {
        this.date = date;
    }

    public void setStories(List<StoriesEntity> stories) {
        this.stories = stories;
    }

    public void setTop_stories(List<TopStoriesEntity> top_stories) {
        this.top_stories = top_stories;
    }

    public String getDate() {
        return date;
    }

    public List<StoriesEntity> getStories() {
        return stories;
    }

    public List<TopStoriesEntity> getTop_stories() {
        return top_stories;
    }

    public static class StoriesEntity {
        /**
         * title : 中国古代家具发展到今天有两个高峰，一个两宋一个明末（多图）
         * ga_prefix : 052321
         * images : ["http://p1.zhimg.com/45/b9/45b9f057fc1957ed2c946814342c0f02.jpg"]
         * type : 0
         * id : 3930445
         */

        private String title;
        private String ga_prefix;
        private int type;
        private int id;
        private List<String> images;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public String getTitle() {
            return title;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public int getType() {
            return type;
        }

        public int getId() {
            return id;
        }

        public List<String> getImages() {
            return images;
        }
    }

    public static class TopStoriesEntity {
        /**
         * title : 商场和很多人家里，竹制家具越来越多（多图）
         * image : http://p2.zhimg.com/9a/15/9a1570bb9e5fa53ae9fb9269a56ee019.jpg
         * ga_prefix : 052315
         * type : 0
         * id : 3930883
         */

        private String title;
        private String image;
        private String ga_prefix;
        private int type;
        private int id;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public String getImage() {
            return image;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public int getType() {
            return type;
        }

        public int getId() {
            return id;
        }
    }
}
