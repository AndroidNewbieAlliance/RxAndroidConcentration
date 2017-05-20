package www.rxfamilyuser.com.coom.Login.netcontrol.impl;

import www.rxfamilyuser.com.base.BaseNetControl;
import www.rxfamilyuser.com.coom.Login.bean.LoginJson;
import www.rxfamilyuser.com.coom.Login.netcontrol.ILoginControl;
import www.rxfamilyuser.com.network.RequestCallBack;

/**
 * Created by ali on 2017/2/17.
 */

public class ILoginControlImpl extends BaseNetControl implements ILoginControl {


    public void login(RequestCallBack callBack, LoginJson loginJson, String sLoinMethodName, int tag) {
        postDataObject(callBack, loginJson, tag, sLoinMethodName);
    }
}
