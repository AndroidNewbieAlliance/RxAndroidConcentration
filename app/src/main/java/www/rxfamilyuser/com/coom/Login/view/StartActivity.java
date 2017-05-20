package www.rxfamilyuser.com.coom.Login.view;

import com.blankj.utilcode.utils.SPUtils;
import com.jude.swipbackhelper.SwipeBackHelper;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import www.rxfamilyuser.com.R;
import www.rxfamilyuser.com.base.BaseActivity;
import www.rxfamilyuser.com.coom.Login.viewmodel.StartModel;
import www.rxfamilyuser.com.databinding.ActivityStartBinding;
import www.rxfamilyuser.com.util.SPkeyConstantUtil;

/**
 * 程序入口界面
 * <p SPkeyConstantUtil.SInitialize 新版本安装的时候要把sp保存的设置为true,
 * 新版本进入继续进入引导页>
 * 修改时间:
 * 修改内容:
 */
public class StartActivity extends BaseActivity<ActivityStartBinding, StartModel> {


    @Override
    public int getLayoutId() {
        return R.layout.activity_start;
    }

    @Override
    public void initView() {
        SwipeBackHelper.getCurrentPage(this)
                .setSwipeBackEnable(false);
        SwipeBackHelper.getCurrentPage(this).setDisallowInterceptTouchEvent(true);

        Observable.timer(2, TimeUnit.SECONDS)
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        jumpNextPage();
                    }
                });
    }

    private void jumpNextPage() {
        SPUtils spUtils = new SPUtils(SPkeyConstantUtil.SSP_KEY);
        if (!spUtils.getBoolean(SPkeyConstantUtil.SInitialize)) {
            intent2Activity(GuideActivity.class);
            spUtils.putBoolean(SPkeyConstantUtil.SInitialize, true);
            finish();
        } else {
            intent2Activity(MainActivity.class);
            finish();
        }
    }
}
