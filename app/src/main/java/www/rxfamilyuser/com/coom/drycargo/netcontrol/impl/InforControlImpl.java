package www.rxfamilyuser.com.coom.drycargo.netcontrol.impl;

import www.rxfamilyuser.com.base.BaseNetControl;
import www.rxfamilyuser.com.coom.drycargo.bean.InforCommentJson;
import www.rxfamilyuser.com.coom.drycargo.netcontrol.IInforControl;
import www.rxfamilyuser.com.network.RequestCallBack;

/**
 * Created by ali on 2017/3/15.
 */

public class InforControlImpl extends BaseNetControl implements IInforControl {

    public void getCommentData(RequestCallBack callBack, InforCommentJson inforCommentJson, String sMethodName, int i) {
        postDataObject(callBack, inforCommentJson, i, sMethodName);
    }
}
