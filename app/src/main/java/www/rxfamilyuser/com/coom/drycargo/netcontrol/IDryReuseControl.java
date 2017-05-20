package www.rxfamilyuser.com.coom.drycargo.netcontrol;

import www.rxfamilyuser.com.network.RequestCallBack;

/**
 * Created by ali on 2017/3/2.
 */

public interface IDryReuseControl {

    /**
     *
     * @param callBack
     * @param o
     * @param tag
     * @param name
     */
    void getDryData(RequestCallBack callBack, Object o, int tag, String name);
}
