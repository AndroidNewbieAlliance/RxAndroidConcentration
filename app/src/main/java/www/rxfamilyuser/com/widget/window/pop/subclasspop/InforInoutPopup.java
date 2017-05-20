package www.rxfamilyuser.com.widget.window.pop.subclasspop;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;

import www.rxfamilyuser.com.R;
import www.rxfamilyuser.com.widget.window.pop.basepop.BasePopupWindow;

/**
 * Created by ali on 2017/5/16.
 */

public class InforInoutPopup extends BasePopupWindow {

    public InforInoutPopup(Activity context) {
        super(context);
        setAutoShowInputMethod(true);
    }


    @Override
    public Animator initShowAnimator() {
        return getDefaultSlideFromBottomAnimationSet();
    }

    @Override
    protected AnimatorSet initShowAnimation() {
        return null;
    }

    @Override
    public View getClickToDismissView() {
        return null;
    }

    @Override
    public View onCreatePopupView() {
        return LayoutInflater.from(getContext()).inflate(R.layout.pop_infor,null);
    }

    @Override
    public View initAnimaView() {
        return null;
    }
}
