package com.leyou.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class LoginFilter extends ZuulFilter {
    /**
     * 过滤器类型（四种过滤器）
     * @return
     */
    @Override
    public String filterType() {
        // 登录校验，肯定是在前置拦截
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 过滤优先级，越小越高
     * @return
     */
    @Override
    public int filterOrder() {
        // 顺序设置为1
        return 1;
    }

    /**
     * 是否要过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        // 返回true，代表过滤器生效。
        return true;
    }

    /**
     * 过滤逻辑
     * @return
     */
    @Override
    public Object run() {
        // 登录校验逻辑。
        // 1）获取Zuul提供的请求上下文对象，类似request域，作用范围：zuul中
        RequestContext ctx = RequestContext.getCurrentContext();
        // 2) 从上下文中获取request对象
        HttpServletRequest request = ctx.getRequest();
        // 3) 从请求中获取token
        String token = request.getParameter("access-token");
        // 4) 判断
        if(StringUtils.isBlank(token)){
            // 没有token，登录校验失败，拦截
            ctx.setSendZuulResponse(false);
            // 返回401状态码。也可以考虑重定向到登录页。
            ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }
        // 校验通过，可以考虑把用户信息放入上下文，继续向后执行
        return null;
    }
}
