package com.learn.employee.portal.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserAuthFilter implements Filter {
	public UserAuthFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (!(request instanceof HttpServletRequest) || !(response instanceof HttpServletResponse))
			return;

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httResponse = (HttpServletResponse) response;

		HttpSession sessionObj = httpRequest.getSession(false);
		if (sessionObj == null || sessionObj.getAttribute("username") == null) {
			httResponse.sendRedirect(httpRequest.getContextPath());
		} else {
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
