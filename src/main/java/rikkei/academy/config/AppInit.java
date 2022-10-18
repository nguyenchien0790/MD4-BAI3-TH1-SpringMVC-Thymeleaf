package rikkei.academy.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("33333333333333");
        return new Class[]{
                AppConfig.class
        };

    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("2222222222222222222");

        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("1111111111111");

        return new String[]{
                "/"
        };

    }
}
