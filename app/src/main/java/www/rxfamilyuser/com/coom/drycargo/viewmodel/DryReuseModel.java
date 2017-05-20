package www.rxfamilyuser.com.coom.drycargo.viewmodel;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableInt;

import com.blankj.utilcode.utils.ToastUtils;

import www.rxfamilyuser.com.R;
import www.rxfamilyuser.com.base.BaseModel;
import www.rxfamilyuser.com.coom.drycargo.adapter.DryReuseAdapter;
import www.rxfamilyuser.com.coom.drycargo.bean.DryReuseBean;
import www.rxfamilyuser.com.coom.drycargo.bean.DryReuseJson;
import www.rxfamilyuser.com.coom.drycargo.netcontrol.impl.DryReuseControlImpl;
import www.rxfamilyuser.com.coom.drycargo.view.DryReuseFragment;
import www.rxfamilyuser.com.databinding.FragmentDryReuseBinding;
import www.rxfamilyuser.com.util.PhoneUtil;
import www.rxfamilyuser.com.util.UserUtil;

/**
 * Created by ali on 2017/3/2.
 */

public class DryReuseModel extends BaseModel<FragmentDryReuseBinding, DryReuseControlImpl> {
    public ObservableArrayList<DryReuseBean.DataBean> mDataList = new ObservableArrayList();
    public ObservableInt mLayoutId = new ObservableInt(R.layout.reuse_item);
    public DryReuseAdapter mReuseAdapter = new DryReuseAdapter();

    private DryReuseFragment dryReuseFragment;
    private static String sDRY_DATA = "articleAll";

    @Override
    public void onCreate() {
        super.onCreate();
        dryReuseFragment = (DryReuseFragment) UI;

    }

    @Override
    public void onBeforeRequest(int tag) {

    }

    @Override
    public void onSuccess(Object bean, int tag) {
        DryReuseBean homeBean = (DryReuseBean) bean;
        if (homeBean.getCode() == 1) {
            mDataList.clear();
            mDataList.addAll(homeBean.getData());

        } else {
            ToastUtils.showShortToast(homeBean.getMessage());
        }

        mReuseAdapter.notifyDataSetChanged();
        mBinder.xrView.loadMoreComplete();
        mBinder.srLayout.setRefreshing(false);
    }

    @Override
    public void onError(String errorMsg) {

        mBinder.xrView.loadMoreComplete();
        mBinder.srLayout.setRefreshing(false);
    }

    /**
     * 获取数据
     *
     * @param type 资讯类型
     * @param page 页数
     */
    public void getDryData(int type, int page) {

        DryReuseJson dryReuseJson = new DryReuseJson();
        dryReuseJson.setUserId(UserUtil.getUserId());
        dryReuseJson.setPhoneDDIV(PhoneUtil.getPhoneDeviceId(dryReuseFragment.getActivity()));
        dryReuseJson.setType(type);
        dryReuseJson.setPage(page);
        mControl.getDryData(this, dryReuseJson, 1, sDRY_DATA);
    }

}
