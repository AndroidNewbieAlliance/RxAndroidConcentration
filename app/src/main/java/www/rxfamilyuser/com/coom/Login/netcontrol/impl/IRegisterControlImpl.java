package www.rxfamilyuser.com.coom.Login.netcontrol.impl;

import www.rxfamilyuser.com.base.BaseNetControl;
import www.rxfamilyuser.com.coom.Login.bean.FindPassWordJson;
import www.rxfamilyuser.com.coom.Login.bean.RegisterJson;
import www.rxfamilyuser.com.coom.Login.netcontrol.IRegisterControl;
import www.rxfamilyuser.com.network.RequestCallBack;

/**
 * Created by ali on 2017/2/20.
 */

public class IRegisterControlImpl extends BaseNetControl implements IRegisterControl {


    @Override
    public void register(RequestCallBack callBack, RegisterJson registerJson, String sRegisterMethodName, int tag) {
        postDataObject(callBack,registerJson,tag,sRegisterMethodName);
    }

    @Override
    public void findPassWord(RequestCallBack callBack, FindPassWordJson findPassWordJson, String sFindPassWordMethodName, int tag) {
        postDataObject(callBack,findPassWordJson,tag,sFindPassWordMethodName);
    }
}
