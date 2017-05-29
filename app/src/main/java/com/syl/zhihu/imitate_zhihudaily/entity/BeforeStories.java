package com.syl.zhihu.imitate_zhihudaily.entity;

import java.util.List;

/**
 * Created by syl on 2017/5/29.
 */

public class BeforeStories {

    /**
     * date : 20150528
     * stories : [{"images":["http://pic3.zhimg.com/f3c91017ec4b2e64f04701b7f845b9ce.jpg"],"type":0,"id":4767693,"ga_prefix":"052822","title":"深夜惊奇 · 程序员的神奇技能"},{"title":"哆啦 A 梦不仅能单挑复联，而且分分钟将其打趴（多图）","ga_prefix":"052821","images":["http://pic3.zhimg.com/8f6b875e15a986792d0490557e497072.jpg"],"multipic":true,"type":0,"id":4764731},{"images":["http://pic3.zhimg.com/074d28d1eabd80dc06e3f18095a8973a.jpg"],"type":0,"id":4767203,"ga_prefix":"052820","title":"咦，谁说我穿得像服务生？（多图）"},{"images":["http://pic4.zhimg.com/623cc67c15f684309476392e78bc9417.jpg"],"type":0,"id":4767036,"ga_prefix":"052819","title":"其实我国从上到下、从古到今都是一群吃货啊\u2026\u2026"},{"images":["http://pic1.zhimg.com/3ae03046e8cac5af86f8e7b5d1ebcc3c.jpg"],"type":0,"id":4766577,"ga_prefix":"052818","title":"夏天到了，警惕身边没有狐臭的人，他们都是变种人"},{"images":["http://pic3.zhimg.com/dc07897260704d12b42295d58efb98ee.jpg"],"type":0,"id":4749859,"ga_prefix":"052817","title":"饿了 · 一簇小火也能做出的美食"},{"images":["http://pic3.zhimg.com/e85c0587adf465ec70cc3ddfcebd0f6a.jpg"],"type":0,"id":4766953,"ga_prefix":"052816","title":"科技这么发达了，为什么找一架失联飞机还这么困难？"},{"images":["http://pic2.zhimg.com/9e7a00edb187074746c93ca0e47d9415.jpg"],"type":0,"id":4765324,"ga_prefix":"052815","title":"大厨们炒菜不用铲子，拿把大圆勺才起范儿"},{"images":["http://pic4.zhimg.com/b5caca475b5888a55a47084c4a1198b7.jpg"],"type":0,"id":4766599,"ga_prefix":"052814","title":"其实找工作的时候，拼爹妈、靠关系的人比你想象的多"},{"images":["http://pic2.zhimg.com/c6c53d4926f58ea05f1fc0b3cffb9909.jpg"],"type":0,"id":4766706,"ga_prefix":"052813","title":"世界真的会因为元首的死而改变吗？"},{"images":["http://pic1.zhimg.com/ab136e64c64ac2b039eac87aee4f8190.jpg"],"type":0,"id":4766548,"ga_prefix":"052812","title":"常常见到「学生证半价」，这是不是价格歧视？"},{"images":["http://pic2.zhimg.com/b00165787e3e19f1ec8a0e8760303c79.jpg"],"type":0,"id":4766384,"ga_prefix":"052811","title":"只要有一个平台推波助澜，民谣界还是会出巨星"},{"images":["http://pic1.zhimg.com/3c4491d1499785918a120d8bf1fbd604.jpg"],"type":0,"id":4763299,"ga_prefix":"052810","title":"建筑大师车祸现场，确实有点惨不忍睹\u2026\u2026（多图）"},{"images":["http://pic1.zhimg.com/16bec244937d971cceeac778f272a8f8.jpg"],"type":0,"id":4765807,"ga_prefix":"052809","title":"这游戏真的太难了，目前还没有人类打得过最终 Boss"},{"images":["http://pic1.zhimg.com/ef1ab76c2657f44786051ae3ecde355c.jpg"],"type":0,"id":4765785,"ga_prefix":"052808","title":"引导你用全新的尺度来思考世界，是科幻小说一个很大的价值"},{"images":["http://pic3.zhimg.com/43d7dcb41ca7c15c6be852aa930fda7e.jpg"],"type":0,"id":4765804,"ga_prefix":"052807","title":"觉得家里的飘窗太鸡肋吗？不如动手改造它（多图）"},{"images":["http://pic3.zhimg.com/b506ff8a14c3a3a11deff3d601f0fd9e.jpg"],"type":0,"id":4765688,"ga_prefix":"052807","title":"一年百万级别直接个人账户转账是否会引起洗钱调查？"},{"images":["http://pic2.zhimg.com/9be4a489d9cf9fbe5c77555701e0f1b5.jpg"],"type":0,"id":4765405,"ga_prefix":"052807","title":"有人充满信心，可这位大神却说「日本动画最多再战 5 年」"},{"images":["http://pic3.zhimg.com/ed5606ac95575126547c05a947eeb442.jpg"],"type":0,"id":4765474,"ga_prefix":"052806","title":"瞎扯 · 如何正确地吐槽"}]
     */

    private String date;
    private List<StoriesEntity> stories;

    public void setDate(String date) {
        this.date = date;
    }

    public void setStories(List<StoriesEntity> stories) {
        this.stories = stories;
    }

    public String getDate() {
        return date;
    }

    public List<StoriesEntity> getStories() {
        return stories;
    }

    public static class StoriesEntity {
        /**
         * images : ["http://pic3.zhimg.com/f3c91017ec4b2e64f04701b7f845b9ce.jpg"]
         * type : 0
         * id : 4767693
         * ga_prefix : 052822
         * title : 深夜惊奇 · 程序员的神奇技能
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

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

        public void setImages(List<String> images) {
            this.images = images;
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

        public List<String> getImages() {
            return images;
        }
    }
}
