package com.lifeng.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class DemoListener implements HttpSessionListener {
    // 创建监听
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext context = httpSessionEvent.getSession().getServletContext();
        Integer listener = (Integer) context.getAttribute("listener");
        if (listener == null) {
            listener = new Integer(1);
        } else {
            int count = listener.intValue();
            listener = new Integer(count + 1);
        }
        context.setAttribute("listener",listener);
    }
    // 销毁监听
    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext context = httpSessionEvent.getSession().getServletContext();
        Integer listener = (Integer) context.getAttribute("listener");
        if (listener == null) {
            listener = new Integer(0);
        } else {
            int count = listener.intValue();
            listener = new Integer(count - 1);
        }
        context.setAttribute("listener",listener);
    }
}
