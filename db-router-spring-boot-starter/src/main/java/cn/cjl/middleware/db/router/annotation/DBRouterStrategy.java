package cn.cjl.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * @description：路由策略，分表标记
 * @author： cjl
 * @create： 2025/2/12 17:23
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {

    boolean splitTable() default false;

}