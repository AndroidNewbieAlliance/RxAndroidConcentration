package www.rxfamilyuser.com.coom.drycargo.viewmodel;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableInt;

import com.blankj.utilcode.utils.ToastUtils;

import www.rxfamilyuser.com.R;
import www.rxfamilyuser.com.base.BaseModel;
import www.rxfamilyuser.com.coom.drycargo.adapter.CommentAdapter;
import www.rxfamilyuser.com.coom.drycargo.bean.InforCommentBean;
import www.rxfamilyuser.com.coom.drycargo.bean.InforCommentJson;
import www.rxfamilyuser.com.coom.drycargo.netcontrol.impl.InforControlImpl;
import www.rxfamilyuser.com.coom.drycargo.view.InforActivity;
import www.rxfamilyuser.com.databinding.ActivityInforBinding;
import www.rxfamilyuser.com.util.UserUtil;

/**
 * Created by ali on 2017/3/15.
 */

public class InforModel extends BaseModel<ActivityInforBinding, InforControlImpl> {

    public CommentAdapter mCommAdapter = new CommentAdapter();
    public ObservableArrayList<InforCommentBean.DataBean.CommentBeanListBean> mCommList = new ObservableArrayList<>();
    public ObservableInt mCommLayout = new ObservableInt(R.layout.item_infor_comment);

    private static String sMethodName = "getInforComment";
    private InforActivity inforActivity;

    @Override
    public void onCreate() {
        super.onCreate();
        inforActivity = (InforActivity) UI;
    }

    @Override
    public void onBeforeRequest(int tag) {

    }

    @Override
    public void onSuccess(Object bean, int tag) {
        switch (tag) {
            case 1:
                InforCommentBean inforCommentBean = (InforCommentBean) bean;
                if (inforCommentBean.getCode() != 0) {
                    if (inforActivity.getmPage() == 1) {
                        mCommList.clear();
                    }
                    mCommList.addAll(inforCommentBean.getData().get(0).getCommentBeanList());
                } else {
                    ToastUtils.showShortToast(inforCommentBean.getMessage());
                }
                mCommAdapter.notifyDataSetChanged();
                mBinder.xrView.loadMoreComplete();
                mBinder.srLayout.setRefreshing(false);
                break;
        }
    }

    @Override
    public void onError(String errorMsg) {

    }


    /**
     * 获取资讯评论
     *
     * @param mInforId
     * @param mPage
     */
    public void getCommentData(int mInforId, int mPage) {
        InforCommentJson inforCommentJson = new InforCommentJson();
        inforCommentJson.setPage(mPage);
        inforCommentJson.setUserId(UserUtil.getUserId());
        inforCommentJson.setInforId(mInforId);

        mControl.getCommentData(this, inforCommentJson, sMethodName, 1);
    }
}
