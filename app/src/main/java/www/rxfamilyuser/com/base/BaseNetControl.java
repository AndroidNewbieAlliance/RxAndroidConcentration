package www.rxfamilyuser.com.base;

import java.lang.reflect.Method;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import www.rxfamilyuser.com.network.RequestCallBack;
import www.rxfamilyuser.com.network.request.HttpRequestImpl;

/**
 * Created by ali on 2017/2/17.
 */

public class BaseNetControl implements IBaseControl {

    public Disposable mDisposable = null;

    /**
     * 销毁
     */
    @Override
    public void disposableCancel() {
        if (mDisposable != null) {
            mDisposable.dispose();
        }
    }

    /**
     * 普通post请求
     *
     * @param callBack   回调
     * @param object     请求参数(json格式)
     * @param tag        请求tag
     * @param methodName appservice执行方法(反射)
     */
    public void postDataObject(final RequestCallBack callBack, Object object, final int tag, String methodName) {

        callBack.beforeRequest(tag);
        HttpRequestImpl httpRequest = HttpRequestImpl.getInstance();
        Class<? extends HttpRequestImpl> httpClass = httpRequest.getClass();
        try {
            Method httpRequestdMethod = httpClass.getDeclaredMethod(methodName, Object.class);
            Observable<Object> invitationData = (Observable<Object>) httpRequestdMethod.invoke(httpRequest, object);
            invitationData.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<Object>() {
                        @Override
                        public void onSubscribe(Disposable d) {
                            mDisposable = d;
                        }

                        @Override
                        public void onNext(Object value) {
                            callBack.success(value, tag);
                        }

                        @Override
                        public void onError(Throwable e) {
                            callBack.error(e.toString());
                        }

                        @Override
                        public void onComplete() {

                        }
                    });

        } catch (Exception e) {
            callBack.error(e.toString());
        }
    }


}
