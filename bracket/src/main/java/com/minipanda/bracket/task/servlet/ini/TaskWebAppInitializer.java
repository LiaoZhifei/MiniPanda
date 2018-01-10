package com.minipanda.bracket.task.servlet.ini;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TaskWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{TaskRootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{TaskWebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// 所有的"/app/task/*"请求都进入到这个servlet中
		return new String[]{"/task/*"};
	}

}
