package www.rxfamilyuser.com.network.request;

import android.support.annotation.NonNull;

import io.reactivex.Observable;
import www.rxfamilyuser.com.base.BaseApplication;
import www.rxfamilyuser.com.coom.Login.bean.FindPassWordJson;
import www.rxfamilyuser.com.coom.Login.bean.LoginJson;
import www.rxfamilyuser.com.coom.Login.bean.RegisterJson;
import www.rxfamilyuser.com.coom.Login.bean.UserBean;
import www.rxfamilyuser.com.coom.drycargo.bean.DryReuseBean;
import www.rxfamilyuser.com.coom.drycargo.bean.DryReuseJson;
import www.rxfamilyuser.com.coom.drycargo.bean.InforCommentBean;
import www.rxfamilyuser.com.coom.drycargo.bean.InforCommentJson;
import www.rxfamilyuser.com.coom.drycargo.bean.TitleBean;
import www.rxfamilyuser.com.coom.find.bean.MessageBean;
import www.rxfamilyuser.com.network.RetrofitManager;
import www.rxfamilyuser.com.util.ConstantUtil;
import www.rxfamilyuser.com.util.NetUtil;

/**
 * Created by ali on 2017/2/16.
 */

public class HttpRequestImpl implements IHttpRequest {

    public static HttpRequestImpl httpRequest;

    public static HttpRequestImpl getInstance() {
        if (httpRequest == null) {
            httpRequest = new HttpRequestImpl();
            return httpRequest;
        }
        return httpRequest;
    }


    /**
     * 根据网络状况获取缓存的策略
     */
    @NonNull
    private String getCacheControl() {
        return NetUtil.isConnected(BaseApplication.getContext()) ? ConstantUtil.SCACHE_CONTROL_AGE : ConstantUtil.SCACHE_CONTROL_CACHE;
    }

    @Override
    public Observable<TitleBean> getTitle() {
        return RetrofitManager.getInstance().getAppService().getTitle(getCacheControl());
    }

    public Observable<DryReuseBean> articleAll(Object object) {

        return RetrofitManager.getInstance().getAppService().articleAll(getCacheControl(), (DryReuseJson) object);
    }

    @Override
    public Observable<MessageBean> getMessageData() {
        return RetrofitManager.getInstance().getAppService().getMessageData(getCacheControl());

    }

    @Override
    public Observable<InforCommentBean> getInforComment(Object object) {
        return  RetrofitManager.getInstance().getAppService().getInforComment(getCacheControl(), (InforCommentJson) object);
    }

    @Override
    public Observable<UserBean> login(Object object) {
        return RetrofitManager.getInstance().getAppService().login(getCacheControl(), (LoginJson)object);
    }

    @Override
    public Observable<UserBean> register(Object object) {
        return RetrofitManager.getInstance().getAppService().register(getCacheControl(), (RegisterJson) object);
    }

    @Override
    public Observable<UserBean> findPassWord(Object object) {
        return RetrofitManager.getInstance().getAppService().findPassWord(getCacheControl(), (FindPassWordJson)object);
    }





}
