package www.rxfamilyuser.com.coom.drycargo.adapter;

import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import www.rxfamilyuser.com.R;
import www.rxfamilyuser.com.base.BaseRecyclerViewAdapter;
import www.rxfamilyuser.com.coom.drycargo.bean.DryReuseBean;
import www.rxfamilyuser.com.databinding.ItemReuseTypeFiveBinding;
import www.rxfamilyuser.com.databinding.ItemReuseTypeFourBinding;
import www.rxfamilyuser.com.databinding.ItemReuseTypeThreeBinding;
import www.rxfamilyuser.com.databinding.ItemReuseTypeTwoBinding;
import www.rxfamilyuser.com.databinding.ReuseItemBinding;
import www.rxfamilyuser.com.widget.OnRecyclerViewItemClickListener;

/**
 * Created by ali on 2017/3/3.
 */
public class DryReuseAdapter extends BaseRecyclerViewAdapter<DryReuseBean.DataBean> {

    private OnRecyclerViewItemClickListener mOnItemClickListener = null;

    /**
     * 根据类型加载不同布局
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = null;
        switch (viewType) {
            case 1:
                view = LayoutInflater.from(mContext).inflate(mItemLayout, parent, false);
                break;
            case 2:
                view = LayoutInflater.from(mContext).inflate(R.layout.item_reuse_type_two, parent, false);
                break;
            case 3:
                view = LayoutInflater.from(mContext).inflate(R.layout.item_reuse_type_three, parent, false);
                break;
            case 4:
                view = LayoutInflater.from(mContext).inflate(R.layout.item_reuse_type_four, parent, false);
                break;
            case 5:
                view = LayoutInflater.from(mContext).inflate(R.layout.item_reuse_type_five, parent, false);
                break;

        }
        return new BaseViewHolder(view);
    }

    /**
     * 判断类型
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        switch (mDataList.get(position).getTitle_type()) {
            case 1:
                switch (mDataList.get(position).getInfor_type()) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                }
                break;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                switch (mDataList.get(position).getInfor_type()) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                }
                break;
            case 5:
                switch (mDataList.get(position).getInfor_type()) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                }
                break;
        }

        return 1;
    }


    @Override
    public void fillData(ViewDataBinding vdBinding, final int position) {
        ImageView ivNoInterest = null;
        switch (getItemViewType(position)) {
            case 1:
                ReuseItemBinding itemBinding = (ReuseItemBinding) vdBinding;
                itemBinding.setDataBean(mDataList.get(position));
                ivNoInterest = itemBinding.ivNoInterest;
                break;
            case 2:
                ItemReuseTypeTwoBinding binding = (ItemReuseTypeTwoBinding) vdBinding;
                binding.setDataBean(mDataList.get(position));
                ivNoInterest = binding.ivNoInterest;

                break;
            case 3:
                ItemReuseTypeThreeBinding threeBinding = (ItemReuseTypeThreeBinding) vdBinding;
                threeBinding.setDataBean(mDataList.get(position));
                ivNoInterest = threeBinding.ivNoInterest;

                break;
            case 4:
                ItemReuseTypeFourBinding fourBinding = (ItemReuseTypeFourBinding) vdBinding;
                fourBinding.setDataBean(mDataList.get(position));
                ivNoInterest = fourBinding.ivNoInterest;

                break;
            case 5:
                ItemReuseTypeFiveBinding fiveBinding = (ItemReuseTypeFiveBinding) vdBinding;
                fiveBinding.setDataBean(mDataList.get(position));
                ivNoInterest = fiveBinding.ivNoInterest;
                break;
        }

        //点击事件回调
        vdBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null)
                    mOnItemClickListener.onItemClick(v, position);

            }
        });
        //不敢兴趣
        ivNoInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(v,position);
                }
            }
        });
    }


    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    private OnivNoInterestClickListener listener;


    public void setOnivNoInterestClickListener(OnivNoInterestClickListener listener) {
        this.listener = listener;
    }


    public interface OnivNoInterestClickListener {
        void onClick(View view, int position);
    }

}
