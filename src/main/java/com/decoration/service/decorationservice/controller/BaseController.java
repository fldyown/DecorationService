package com.decoration.service.decorationservice.controller;

import com.decoration.service.decorationservice.modal.Vo.UserVo;
import com.decoration.service.decorationservice.utils.MapCache;
import com.decoration.service.decorationservice.utils.TaleUtils;

import javax.servlet.http.HttpServletRequest;

public abstract class BaseController {

    public static String THEME = "themes/default";

    protected MapCache cache = MapCache.single();

    /**
     * 主页的页面主题
     *
     * @param viewName
     * @return
     */
    public String render(String viewName) {
        return THEME + "/" + viewName;
    }

    public BaseController title(HttpServletRequest request, String title) {
        request.setAttribute("title", title);
        return this;
    }

    public BaseController keywords(HttpServletRequest request, String keywords) {
        request.setAttribute("keywords", keywords);
        return this;
    }

    /**
     * 获取请求绑定的登录对象
     *
     * @param request
     * @return
     */
    public UserVo user(HttpServletRequest request) {
        return TaleUtils.getLoginUser(request);
    }

    public Integer getUid(HttpServletRequest request) {
        return this.user(request).getUid();
    }

    public String render_404() {
        return "comm/error_404";
    }

}
