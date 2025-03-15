package cn.cjl.middleware.test;

import cn.cjl.middleware.db.router.annotation.DBRouter;

/**
 * @description：测试用接口
 * @author： cjl
 * @create： 2025/3/15 12:41
 */
public interface IUserDao {
    @DBRouter(key = "userId")
    void insertUser(String req);
}
