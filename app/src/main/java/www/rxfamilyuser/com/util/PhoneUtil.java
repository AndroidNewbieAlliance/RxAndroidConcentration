package www.rxfamilyuser.com.util;

import android.Manifest;
import android.app.Activity;
import android.telephony.TelephonyManager;

import com.blankj.utilcode.utils.DeviceUtils;
import com.tbruyelle.rxpermissions2.RxPermissions;

import io.reactivex.functions.Consumer;

import static android.content.Context.TELEPHONY_SERVICE;

/**
 * 手机工具类
 */
public class PhoneUtil {

    /**
     * 获取手机标示,获取不到就获取AndroidID和MacAddress拼写,加密
     *
     * @param activity
     * @return PhoneDeviceId
     */
    public static String getPhoneDeviceId(final Activity activity) {

        final String[] phoneDeviceId = new String[1];
        RxPermissions rxPermissions = new RxPermissions(activity);
        rxPermissions.request(Manifest.permission.READ_PHONE_STATE)
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean aBoolean) throws Exception {
                        if (aBoolean) {
                            TelephonyManager TelephonyMgr = (TelephonyManager) activity.getSystemService(TELEPHONY_SERVICE);
                            String deviceId = TelephonyMgr.getDeviceId();
                            phoneDeviceId[0] = AESHelperUtil.encrypt(deviceId);

                        } else {
                            String androidID = DeviceUtils.getAndroidID();
                            String macAddress = DeviceUtils.getMacAddress();
                            phoneDeviceId[0] = AESHelperUtil.encrypt(androidID + macAddress);
                        }
                    }
                });
        return phoneDeviceId[0];
    }
}
