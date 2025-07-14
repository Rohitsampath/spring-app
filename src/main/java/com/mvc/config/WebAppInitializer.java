package com.mvc.config;



import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Root config classes (e.g., services, data source)
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class }; // your main config
    }

    // Servlet config classes (controllers, view resolvers)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebMvcConfig.class }; // controller-related config
    }

    // URL mapping for DispatcherServlet
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
