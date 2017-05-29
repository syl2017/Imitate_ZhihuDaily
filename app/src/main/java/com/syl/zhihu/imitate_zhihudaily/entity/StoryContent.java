package com.syl.zhihu.imitate_zhihudaily.entity;

/**
 * Created by syl on 2017/5/29.
 */

public class StoryContent {


    /**
     * body :
     * image_source : Yestone.com 版权图片库
     * title : 深夜惊奇 · 朋友圈错觉
     * image : http://pic3.zhimg.com/2d41a1d1ebf37fb699795e78db76b5c2.jpg
     * share_url : http://daily.zhihu.com/story/4772126
     * ga_prefix : 050615
     */

    private String body;
    private String image_source;
    private String title;
    private String image;
    private String share_url;
    private String ga_prefix;

    public void setBody(String body) {
        this.body = body;
    }

    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public String getBody() {
        return body;
    }

    public String getImage_source() {
        return image_source;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getShare_url() {
        return share_url;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public static class SectionBean {

        /**
         * thumbnail : http://pic4.zhimg.com/6a1ddebda9e8899811c4c169b92c35b3.jpg
         * id : 1
         * name : 深夜惊奇
         */

        private String thumbnail;
        private int id;
        private String name;

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}

