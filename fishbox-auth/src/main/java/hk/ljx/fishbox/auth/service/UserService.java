package hk.ljx.fishbox.auth.service;

import hk.ljx.framework.common.response.Response;
import hk.ljx.fishbox.auth.model.vo.user.UserLoginReqVO;

public interface UserService {

     /**
     * 登录与注册
     * @param userLoginReqVO
     * @return
     */
    Response<String> loginAndRegister(UserLoginReqVO userLoginReqVO);

}
