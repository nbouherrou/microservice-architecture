package org.test.gateway.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PostFilter extends ZuulFilter{

	@Override
	public Object run() {
	    RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();
	    System.out.println(String.format("Post filter : %s request to %s", request. getMethod(), request.getRequestURL().toString()));
	    
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 2;
	}

	@Override
	public String filterType() {
		return "post";
	}

}
