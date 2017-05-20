package www.rxfamilyuser.com.coom.drycargo.netcontrol;

import www.rxfamilyuser.com.coom.drycargo.bean.InforCommentJson;
import www.rxfamilyuser.com.network.RequestCallBack;

/**
 * Created by ali on 2017/3/15.
 */

public interface IInforControl {

    void getCommentData(RequestCallBack callBack, InforCommentJson inforCommentJson, String sMethodName,int tag);
}
