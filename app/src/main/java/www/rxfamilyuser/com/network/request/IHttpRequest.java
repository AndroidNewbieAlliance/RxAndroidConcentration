package www.rxfamilyuser.com.network.request;

import io.reactivex.Observable;
import www.rxfamilyuser.com.coom.Login.bean.UserBean;
import www.rxfamilyuser.com.coom.drycargo.bean.DryReuseBean;
import www.rxfamilyuser.com.coom.drycargo.bean.InforCommentBean;
import www.rxfamilyuser.com.coom.drycargo.bean.TitleBean;
import www.rxfamilyuser.com.coom.find.bean.MessageBean;

/**
 * Created by ali on 2017/2/16.
 */

public interface IHttpRequest {

    /**
     * 获取文章标题类型
     *
     * @return
     */
    Observable<TitleBean> getTitle();

    /**
     * 获取文章列表
     *
     * @param object
     * @return
     */
    Observable<DryReuseBean> articleAll(Object object);

    /**
     * 消息
     *
     * @return
     */
    Observable<MessageBean> getMessageData();

    /**
     * 获取单篇文章评论
     *
     * @param object
     * @return
     */
    Observable<InforCommentBean> getInforComment(Object object);

    /**
     * 登录接口
     *
     * @param object
     * @return
     */
    Observable<UserBean> login(Object object);



    /**
     * 注册接口
     *
     * @param object
     * @return
     */
    Observable<UserBean> register(Object object);


    /**
     * 找回密码接口
     *
     * @param object
     * @return
     */
    Observable<UserBean> findPassWord(Object object);



}
