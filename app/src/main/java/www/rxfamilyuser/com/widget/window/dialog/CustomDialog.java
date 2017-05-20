package www.rxfamilyuser.com.widget.window.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * 定制Dialog,baseDialog
 */
public class CustomDialog extends Dialog {
    private Context context;
    private int height, width;
    private boolean cancelTouchout;
    private View view;


    private CustomDialog(Builder builder) {
        super(builder.context);
        context = builder.context;
        height = builder.height;
        width = builder.width;
        cancelTouchout = builder.cancelTouchout;
        view = builder.view;
    }


    private CustomDialog(Builder builder, int resStyle) {
        super(builder.context, resStyle);
        context = builder.context;
        height = builder.height;
        width = builder.width;
        cancelTouchout = builder.cancelTouchout;
        view = builder.view;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(view);

        setCanceledOnTouchOutside(cancelTouchout);

        Window win = getWindow();
        WindowManager.LayoutParams lp = win.getAttributes();
        lp.gravity = Gravity.CENTER;
        lp.height = height;
        lp.width = width;
        win.setAttributes(lp);
    }

    public static final class Builder {

        private Context context;
        private int height, width;
        private boolean cancelTouchout;
        private View view;
        private int resStyle = -1;


        public Builder(Context context) {
            this.context = context;
        }

        public Builder view(int resView) {
            view = LayoutInflater.from(context).inflate(resView, null);
            return this;
        }

        public Builder heightpx(int val) {
            height = val;
            return this;
        }

        public Builder widthpx(int val) {
            width = val;
            return this;
        }

        public Builder heightdp(int val) {
            height =val;
            return this;
        }

        public Builder widthdp(int val) {
            width = val;
            return this;
        }

        public Builder heightDimenRes(int dimenRes) {
            height = context.getResources().getDimensionPixelOffset(dimenRes);
            return this;
        }

        public Builder widthDimenRes(int dimenRes) {
            width = context.getResources().getDimensionPixelOffset(dimenRes);
            return this;
        }

        public Builder style(int resStyle) {
            this.resStyle = resStyle;
            return this;
        }

        public Builder cancelTouchout(boolean val) {
            cancelTouchout = val;
            return this;
        }

        public Builder addViewOnclick(int viewRes, View.OnClickListener listener) {
            view.findViewById(viewRes).setOnClickListener(listener);
            return this;
        }


        public CustomDialog build() {
            if (resStyle != -1) {
                return new CustomDialog(this, resStyle);
            } else {
                return new CustomDialog(this);
            }
        }
    }

    //使用
    /*CustomDialog.Builder builder = new CustomDialog.Builder(this);
dialog =
    builder.cancelTouchout(false)
            .view(R.layout.dialog_loginerror)
            .heightDimenRes(R.dimen.dialog_loginerror_height)
            .widthDimenRes(R.dimen.dialog_loginerror_width)
            .style(R.style.Dialog)
            .addViewOnclick(R.id.btn_cancel,new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            })
            .build();
dialog.show();

View.OnClickListener listener = new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.jbperson :
                Toast.makeText(aty, "选择经办人按钮", Toast.LENGTH_SHORT).show();

            case R.id.spperson:
                Toast.makeText(aty, "选择审批人按钮", Toast.LENGTH_SHORT).show();

            case R.id.confirmbtn:
                Toast.makeText(aty, "点击确定按钮", Toast.LENGTH_SHORT).show();

        }
    }
};

CustomDialog.Builder builder = new CustomDialog.Builder(this);
CustomDialog dialog = builder
        .style(R.style.Dialog)
        .heightDimenRes(R.dimen.dilog_identitychange_height)
        .widthDimenRes(R.dimen.dilog_identitychange_width)
        .cancelTouchout(false)
        .view(R.layout.dialog_identitychange)
        .addViewOnclick(R.id.jbperson,listener)
        .addViewOnclick(R.id.spperson,listener)
        .addViewOnclick(R.id.confirmbtn,listener)
        .build();

dialog.show();
*/
}