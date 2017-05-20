package www.rxfamilyuser.com.network;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
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

/**
 * Created by ali on 2017/2/16.
 */

public interface AppService {
    /**
     * 获取文章标题类型
     *
     * @param cacheControl
     * @return
     */

    @GET("concentrantion/articletitle")
    Observable<TitleBean> getTitle(@Header("Cache-Control") String cacheControl);


    /**
     * 获取文章列表
     *
     * @param cacheControl
     * @param json
     * @return
     */
    @POST("concentrantion/articleinfor")
    Observable<DryReuseBean> articleAll(@Header("Cache-Control") String cacheControl, @Body DryReuseJson json);

    /**
     * 消息
     *
     * @param cacheControl
     * @return
     */
    @GET("message/message")
    Observable<MessageBean> getMessageData(@Header("Cache-Control") String cacheControl);

    /**
     * 单条文章评论
     *
     * @param cacheControl
     * @param json
     * @return
     */
    @POST("concentrantion/articleinfor/com")
    Observable<InforCommentBean> getInforComment(@Header("Cache-Control") String cacheControl, @Body InforCommentJson json);

    /**
     * 登录
     *
     * @param cacheControl
     * @param loginJson
     * @return
     */
    @POST("restful/login")
    Observable<UserBean> login(@Header("Cache-Control") String cacheControl, @Body LoginJson loginJson);


    /**
     * 注册接口
     *
     * @param cacheControl 缓存
     * @param registerJson 参数
     * @return Observable
     * @Header("Cache-Control") String cacheControl是缓存 />
     */
    @POST("restful/register")
    Observable<UserBean> register(@Header("Cache-Control") String cacheControl, @Body RegisterJson registerJson);

    /**
     * 找回密码
     *
     * @param cacheControl
     * @param json
     * @return
     */
    @POST("restful/findPass")
    Observable<UserBean> findPassWord(@Header("Cache-Control") String cacheControl, @Body FindPassWordJson json);


}
