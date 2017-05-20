package www.rxfamilyuser.com.coom.Login.netcontrol;

import www.rxfamilyuser.com.coom.Login.bean.LoginJson;
import www.rxfamilyuser.com.network.RequestCallBack;

/**
 * Created by ali on 2017/2/17.
 */

public interface ILoginControl {

    /**
     * 登录
     * @param callBack
     * @param loginJson
     * @param sLoinMethodName
     * @param tag
     */
    void login(RequestCallBack callBack, LoginJson loginJson, String sLoinMethodName, int tag);
}
