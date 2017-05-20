package www.rxfamilyuser.com.coom.drycargo.view;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.blankj.utilcode.utils.ToastUtils;

import www.rxfamilyuser.com.R;
import www.rxfamilyuser.com.base.BaseFragment;
import www.rxfamilyuser.com.coom.drycargo.viewmodel.DryCargoModel;
import www.rxfamilyuser.com.databinding.FragmentDryCargoBinding;

/**
 * 文章首页
 * <p>
 * 修改时间:
 * 修改内容:
 */
public class DryCargoFragment extends BaseFragment<FragmentDryCargoBinding, DryCargoModel> {

    @Override
    public int getLayoutId() {
        return R.layout.fragment_dry_cargo;
    }


    @Override
    public void initView() {
        mModel.getTitle();
        mBinder.toolbar.setTitle(getString(R.string.rb_home));
        mBinder.toolbar.inflateMenu(R.menu.menu_share);
        mBinder.toolbar.setOnMenuItemClickListener(onMenuItemClick);

    }


    private Toolbar.OnMenuItemClickListener onMenuItemClick = new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {

                case R.id.action_share:
                    ToastUtils.showShortToast("分享功能还没添加,稍等稍等~~");
                    break;

                case R.id.action_settings:
                    ToastUtils.showShortToast("此功能暂未实现,稍等稍等~~");
                    break;
            }
            return true;
        }
    };
}
