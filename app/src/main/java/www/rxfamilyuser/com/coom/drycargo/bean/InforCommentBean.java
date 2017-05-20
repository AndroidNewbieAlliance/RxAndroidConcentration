package www.rxfamilyuser.com.coom.drycargo.bean;

import java.util.List;

import www.rxfamilyuser.com.base.BaseBean;

/**
 * Created by ali on 2017/5/4.
 */

public class InforCommentBean extends BaseBean {
    /**
     * code : 1
     * message : 数据查询成功~~
     * data : [{"isCollect":0,"isPraise":0,"commentBeanList":[{"com_id":1,"com_user_id":1,"com_content":"asdasd","com_time":"1984","com_type":"1","com_infor_id":1,"com_redux_userId":0,"user_name":"杨颖","user_photo":"http://47.93.50.208:8080/con_image/image/image2.jpg"}]}]
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
         * isCollect : 0
         * isPraise : 0
         * commentBeanList : [{"com_id":1,"com_user_id":1,"com_content":"asdasd","com_time":"1984","com_type":"1","com_infor_id":1,"com_redux_userId":0,"user_name":"杨颖","user_photo":"http://47.93.50.208:8080/con_image/image/image2.jpg"}]
         */

        private int isCollect;
        private int isPraise;
        private List<CommentBeanListBean> commentBeanList;

        public int getIsCollect() {
            return isCollect;
        }

        public void setIsCollect(int isCollect) {
            this.isCollect = isCollect;
        }

        public int getIsPraise() {
            return isPraise;
        }

        public void setIsPraise(int isPraise) {
            this.isPraise = isPraise;
        }

        public List<CommentBeanListBean> getCommentBeanList() {
            return commentBeanList;
        }

        public void setCommentBeanList(List<CommentBeanListBean> commentBeanList) {
            this.commentBeanList = commentBeanList;
        }

        public static class CommentBeanListBean {
            /**
             * com_id : 1
             * com_user_id : 1
             * com_content : asdasd
             * com_time : 1984
             * com_type : 1
             * com_infor_id : 1
             * com_redux_userId : 0
             * user_name : 杨颖
             * user_photo : http://47.93.50.208:8080/con_image/image/image2.jpg
             */

            private int com_id;
            private int com_user_id;
            private String com_content;
            private String com_time;
            private String com_type;
            private int com_infor_id;
            private int com_redux_userId;
            private String user_name;
            private String user_photo;

            public int getCom_id() {
                return com_id;
            }

            public void setCom_id(int com_id) {
                this.com_id = com_id;
            }

            public int getCom_user_id() {
                return com_user_id;
            }

            public void setCom_user_id(int com_user_id) {
                this.com_user_id = com_user_id;
            }

            public String getCom_content() {
                return com_content;
            }

            public void setCom_content(String com_content) {
                this.com_content = com_content;
            }

            public String getCom_time() {
                return com_time;
            }

            public void setCom_time(String com_time) {
                this.com_time = com_time;
            }

            public String getCom_type() {
                return com_type;
            }

            public void setCom_type(String com_type) {
                this.com_type = com_type;
            }

            public int getCom_infor_id() {
                return com_infor_id;
            }

            public void setCom_infor_id(int com_infor_id) {
                this.com_infor_id = com_infor_id;
            }

            public int getCom_redux_userId() {
                return com_redux_userId;
            }

            public void setCom_redux_userId(int com_redux_userId) {
                this.com_redux_userId = com_redux_userId;
            }

            public String getUser_name() {
                return user_name;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public String getUser_photo() {
                return user_photo;
            }

            public void setUser_photo(String user_photo) {
                this.user_photo = user_photo;
            }
        }
    }
}
