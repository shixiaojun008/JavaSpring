package game;

import org.springframework.cglib.proxy.Proxy;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class ProxyBeanUtil implements InvocationHandler {

    // 被代理对象
    private Object obj;

    // 拦截器
    private Interceptor interceptor = null;

    /**
     * @param proxy  代理对象
     * @param method 当前调度方法
     * @param args   参数
     * @return 方法返回
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retObj = null;

        boolean exceptionFlag = false;
        //before 方法
        interceptor.before(obj);

        try {
            // 反射原有方法
            retObj = method.invoke(obj, args);
        } catch (Exception ex) {
            exceptionFlag = true;
        } finally {
            interceptor.after(obj);
        }

        if (exceptionFlag) {
            //afterThrow 方法
            interceptor.afterThrowing(obj);
        } else {
            // afterReturning 方法
            interceptor.afterReturning(obj);
        }
        return retObj;
    }

    /**
     * @param obj         被代理对象
     * @param interceptor 拦截器
     * @return 动态代理对象
     */
    public static Object getBean(Object obj, Interceptor interceptor) {

        // 使用当前类，作为代理方法，此时被代理对象执行方法的时候，会进入当前类的 invoke 方法里
        ProxyBeanUtil _this = new ProxyBeanUtil();

        //保存被代理对象
        _this.obj = obj;

        //保存拦截器
        _this.interceptor = interceptor;

        //生成代理对象，并绑定代理方法
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), _this);

    }


}
