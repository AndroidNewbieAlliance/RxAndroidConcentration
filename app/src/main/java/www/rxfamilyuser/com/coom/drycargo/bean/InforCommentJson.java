package www.rxfamilyuser.com.coom.drycargo.bean;

import www.rxfamilyuser.com.base.BaseBean;

/**
 * Created by ali on 2017/5/4.
 */

public class InforCommentJson extends BaseBean {
    private int inforId;
    private int userId;
    private int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getInforId() {
        return inforId;
    }

    public void setInforId(int inforId) {
        this.inforId = inforId;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
