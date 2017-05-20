package www.rxfamilyuser.com.coom.Login.netcontrol;

import java.util.Map;

import www.rxfamilyuser.com.coom.Login.bean.FindPassWordJson;
import www.rxfamilyuser.com.coom.Login.bean.RegisterJson;
import www.rxfamilyuser.com.network.RequestCallBack;

/**
 * Created by ali on 2017/2/20.
 */

public interface IRegisterControl{

    /**
     * 注册
     * @param callBack
     * @param registerJson
     * @param sRegisterMethodName
     * @param tag
     */
    void register(RequestCallBack callBack, RegisterJson registerJson, String sRegisterMethodName, int tag);


    /**
     * 找回密码
     * @param callBack
     * @param findPassWordJson
     * @param sFindPassWordMethodName
     * @param tag
     */
    void findPassWord(RequestCallBack callBack, FindPassWordJson findPassWordJson, String sFindPassWordMethodName, int tag);
}
