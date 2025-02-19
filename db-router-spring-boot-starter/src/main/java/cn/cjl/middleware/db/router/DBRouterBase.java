package cn.cjl.middleware.db.router;

/**
 * @description：数据源基础配置
 * @author： cjl
 * @create： 2025/2/11 18:22
 */
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }

}
