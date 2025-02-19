package cn.cjl.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * @description：路由注解
 * @author： cjl
 * @create： 2025/2/11 19:49
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouter {
    /** 分库分表字段 */
    String key() default "";
}
