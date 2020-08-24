package com.util;

import org.apache.commons.lang.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.UUID;

public class RequestUtil {

    /**
     * 获取完整请求URL
     * @param request
     * @return
     */
    public static String getRequestURL(HttpServletRequest request){
        String url = request.getScheme() + "://";  //请求协议 http 或者https
        url += request.getHeader("host"); //请求服务器
        url += request.getRequestURI();
        return url;
    }

    /**
     * 获取请求主机IP地址，如果通过代理进来，则透过防火墙获取真实IP地址
     * @param request
     * @return
     */
    public static String getIP(HttpServletRequest request){
        String ip = request.getHeader("X-Forwarded-For");
        try {
            if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)){
                if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)){
                    ip = request.getHeader("Proxy-Client-IP");
                }
                if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)){
                    ip = request.getHeader("WL-Proxy-Client-IP");
                }
                if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)){
                    ip = request.getHeader("HTTP-CLIENT-IP");
                }
                if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)){
                    ip = request.getHeader("HTTP-X-FORWARDED-FOR");
                }
                if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)){
                    ip = request.getRemoteAddr();
                }
            } else if (ip.length() > 15){
                String[] ips = ip.split(",");
                for (int i = 0; i < ips.length; i++) {
                    String ipStr = ips[i];
                    if (!"unknown".equalsIgnoreCase(ipStr)){
                        ip = ipStr;
                        break;
                    }
                }
            }
        } catch (Exception e){
            ip = "unknown";
        }
        return ip;
    }

    /**
     * 获取所有请求头信息
     * @param request
     * @return
     */
    public static HashMap<String, String> getRequestHeader(HttpServletRequest request){
        HashMap<String, String> map = new HashMap<>();
        Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()){
            String param = names.nextElement();
            map.put(param, request.getHeader(param));
        }
        return map;
    }

    /**
     * 添加cookie
     * @param key
     * @param value
     * @param maxAge
     * @param response
     */
    public static void addCookie(String key, String value, int maxAge, HttpServletResponse response){
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(maxAge);
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
    }

    /**
     * 获取特定cookie值
     * @param cookies
     * @param param
     * @return
     */
    public static String getParamFromCookie(Cookie[] cookies, String param){
        String result = null;
        if (cookies != null){
            for (Cookie cookie : cookies) {
                if (param.equals(cookie.getName())){
                    result = cookie.getValue();
                    if (StringUtils.isNotBlank(result)){
                        break;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 自定义sessionId， 适用于多服务实例
     * @param request
     * @param response
     * @return
     */
    public static String getSessionId(HttpServletRequest request, HttpServletResponse response){
        String sessionId = RequestUtil.getParamFromCookie(request.getCookies(), "sessionId");
        if (StringUtils.isBlank(sessionId)){
            sessionId = request.getHeader("sessionId"); //兼容页面不支持cookie的情况
            if (StringUtils.isBlank(sessionId)){
                sessionId = UUID.randomUUID().toString().replaceAll("-", "");
                RequestUtil.addCookie("sessionId", sessionId, 24 * 60 * 60, response);
            }
        }
        return sessionId;
    }
}
