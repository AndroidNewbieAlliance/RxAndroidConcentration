package www.rxfamilyuser.com.coom.drycargo.bean;

import java.util.List;

import www.rxfamilyuser.com.base.BaseBean;

/**
 * Created by ali on 2017/3/3.
 */

public class DryReuseBean extends BaseBean {


    /**
     * code : 1
     * message : 数据查询成功~~
     * data : [{"infor_id":1,"infor_from":"csdn","infor_type":"1","infor_title":"测试数据测试数据","infor_content":"测试数据测试数据测测试数据测试数据测测试数据测试数据测测试数据测试数据测测试数据测试数据测","infor_time":"2017-04-25 22:12","infor_com_num":"22","infor_praise_num":"11","infor_html":"http://blog.csdn.net/mattdong0106/article/details/51971398","infor_video":null,"infor_img_one":null,"infor_img_two":null,"infor_img_three":null,"infor_user_id":null,"user_photo":null,"user_name":null},{"infor_id":2,"infor_from":"掘进","infor_type":"2","infor_title":"测试数据测试数据","infor_content":"测试数据测试数据测试数据测试数据测试数据测试数据","infor_time":"2017-04-25 22:12","infor_com_num":"22","infor_praise_num":"33","infor_html":"http://blog.csdn.net/mattdong0106/article/details/51971398","infor_video":null,"infor_img_one":"http://blog.csdn.net/mattdong0106/article/details/51971398","infor_img_two":null,"infor_img_three":null,"infor_user_id":null,"user_photo":null,"user_name":null}]
     */

    private int code;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * infor_id : 1
         * infor_from : csdn
         * infor_type : 1
         * infor_title : 测试数据测试数据
         * infor_content : 测试数据测试数据测测试数据测试数据测测试数据测试数据测测试数据测试数据测测试数据测试数据测
         * infor_time : 2017-04-25 22:12
         * infor_com_num : 22
         * infor_praise_num : 11
         * infor_html : http://blog.csdn.net/mattdong0106/article/details/51971398
         * infor_video : null
         * infor_img_one : null
         * infor_img_two : null
         * infor_img_three : null
         * infor_user_id : null
         * user_photo : null
         * user_name : null
         */

        private int infor_id;
        private String infor_from;
        private int infor_type;
        private String infor_title;
        private String infor_content;
        private String infor_time;
        private String infor_com_num;
        private String infor_praise_num;
        private String infor_html;
        private String infor_video;
        private String infor_img_one;
        private String infor_img_two;
        private String infor_img_three;
        private String infor_user_id;
        private String user_photo;
        private String user_name;
        private int title_type;

        public int getTitle_type() {
            return title_type;
        }

        public void setTitle_type(int title_type) {
            this.title_type = title_type;
        }

        public int getInfor_id() {
            return infor_id;
        }

        public void setInfor_id(int infor_id) {
            this.infor_id = infor_id;
        }

        public String getInfor_from() {
            return infor_from;
        }

        public void setInfor_from(String infor_from) {
            this.infor_from = infor_from;
        }

        public int getInfor_type() {
            return infor_type;
        }

        public void setInfor_type(int infor_type) {
            this.infor_type = infor_type;
        }

        public String getInfor_title() {
            return infor_title;
        }

        public void setInfor_title(String infor_title) {
            this.infor_title = infor_title;
        }

        public String getInfor_content() {
            return infor_content;
        }

        public void setInfor_content(String infor_content) {
            this.infor_content = infor_content;
        }

        public String getInfor_time() {
            return infor_time;
        }

        public void setInfor_time(String infor_time) {
            this.infor_time = infor_time;
        }

        public String getInfor_com_num() {
            return infor_com_num;
        }

        public void setInfor_com_num(String infor_com_num) {
            this.infor_com_num = infor_com_num;
        }

        public String getInfor_praise_num() {
            return infor_praise_num;
        }

        public void setInfor_praise_num(String infor_praise_num) {
            this.infor_praise_num = infor_praise_num;
        }

        public String getInfor_html() {
            return infor_html;
        }

        public void setInfor_html(String infor_html) {
            this.infor_html = infor_html;
        }

        public String getInfor_video() {
            return infor_video;
        }

        public void setInfor_video(String infor_video) {
            this.infor_video = infor_video;
        }

        public String getInfor_img_one() {
            return infor_img_one;
        }

        public void setInfor_img_one(String infor_img_one) {
            this.infor_img_one = infor_img_one;
        }

        public String getInfor_img_two() {
            return infor_img_two;
        }

        public void setInfor_img_two(String infor_img_two) {
            this.infor_img_two = infor_img_two;
        }

        public String getInfor_img_three() {
            return infor_img_three;
        }

        public void setInfor_img_three(String infor_img_three) {
            this.infor_img_three = infor_img_three;
        }

        public String getInfor_user_id() {
            return infor_user_id;
        }

        public void setInfor_user_id(String infor_user_id) {
            this.infor_user_id = infor_user_id;
        }

        public String getUser_photo() {
            return user_photo;
        }

        public void setUser_photo(String user_photo) {
            this.user_photo = user_photo;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }
    }
}
