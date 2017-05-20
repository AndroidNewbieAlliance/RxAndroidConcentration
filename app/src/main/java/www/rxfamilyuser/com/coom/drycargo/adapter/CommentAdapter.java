package www.rxfamilyuser.com.coom.drycargo.adapter;

import android.databinding.ViewDataBinding;

import www.rxfamilyuser.com.base.BaseRecyclerViewAdapter;
import www.rxfamilyuser.com.coom.drycargo.bean.InforCommentBean;
import www.rxfamilyuser.com.databinding.ItemInforCommentBinding;

/**
 * Created by ali on 2017/5/4.
 */

public class CommentAdapter extends BaseRecyclerViewAdapter<InforCommentBean.DataBean.CommentBeanListBean> {
    @Override
    public void fillData(ViewDataBinding vdBinding, int position) {
        ItemInforCommentBinding itemInforCommentBinding = (ItemInforCommentBinding) vdBinding;
        itemInforCommentBinding.setBean(mDataList.get(position));
    }
}
