package www.rxfamilyuser.com.coom.drycargo.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.blankj.utilcode.utils.ToastUtils;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import www.rxfamilyuser.com.R;
import www.rxfamilyuser.com.base.BaseFragment;
import www.rxfamilyuser.com.coom.drycargo.adapter.DryReuseAdapter;
import www.rxfamilyuser.com.coom.drycargo.viewmodel.DryReuseModel;
import www.rxfamilyuser.com.databinding.FragmentDryReuseBinding;
import www.rxfamilyuser.com.util.XRecyclerviewUtis;
import www.rxfamilyuser.com.widget.OnRecyclerViewItemClickListener;


/**
 * 文章首页多类型fragment
 * <p 根据type>
 * 修改时间:
 * 修改内容:
 */
@SuppressLint("ValidFragment")
public class DryReuseFragment extends BaseFragment<FragmentDryReuseBinding, DryReuseModel> {
    /**
     * 根据类型请求文章类型.
     * 资讯:1
     * 博客:2
     * 问答:3
     * 科技:4
     * 技术:5
     */
    private int mType = 1;

    private int mPage = 1;

    public int getmPage() {
        return mPage;
    }

    public DryReuseFragment(int i) {
        mType = i;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_dry_reuse;
    }

    @Override
    public void initView() {

        mBinder.setModel(mModel);

        new XRecyclerviewUtis(mBinder.xrView, mBinder.srLayout, getContext())
                .setLayoutManager(LinearLayoutManager.VERTICAL)
                .setPullRefreshEnabled(false)
                .setLoadingMoreEnabled(false)
                .swipeLayouSetColorSchemeResources()
                .setLoadingListener(new XRecyclerView.LoadingListener() {
                    @Override
                    public void onRefresh() {

                    }

                    @Override
                    public void onLoadMore() {
                        mPage++;
                        mModel.getDryData(mType, mPage);
                    }
                })
                .swipeLayouPost(new Runnable() {
                    @Override
                    public void run() {
                        mBinder.srLayout.setRefreshing(true);
                        mModel.getDryData(mType, mPage);
                    }
                })
                .swipeLayouSetOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        //网络请求
                        mPage = 1;
                        mModel.getDryData(mType, mPage);
                    }
                });

        mModel.mReuseAdapter.setOnItemClickListener(new OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent();
                intent.setClass(getContext(), InforActivity.class);
                intent.putExtra("infor_html", mModel.mDataList.get(position).getInfor_html());
                intent.putExtra("infor_id",  mModel.mDataList.get(position).getInfor_id());
                intent.putExtra("infor_type",mType);
                startActivity(intent);
            }
        });

        //不感兴趣点击
        mModel.mReuseAdapter.setOnivNoInterestClickListener(new DryReuseAdapter.OnivNoInterestClickListener() {
            @Override
            public void onClick(View view, int position) {
                ToastUtils.showShortToast("当前下标" + position);
            }
        });
    }
}
