package com.lcfc.spring_demo.others;


import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "HEAD", "POST", "PUT")
                .allowCredentials(true).maxAge(3600).allowedHeaders("*");
    }
    // private CorsConfiguration buildConfig() {
    // CorsConfiguration corsConfiguration = new CorsConfiguration();
    // corsConfiguration.setAllowCredentials(true);
    // corsConfiguration.addAllowedOrigin("http://localhost:8080"); // 允许该域名使用
    // corsConfiguration.addAllowedHeader("*"); // 允许任何头
    // corsConfiguration.addAllowedMethod("*"); // 允许任何方法（post、get等）
    // return corsConfiguration;
    // }

    // @Bean
    // public CorsFilter corsFilter() {
    // UrlBasedCorsConfigurationSource source = new
    // UrlBasedCorsConfigurationSource();
    // source.registerCorsConfiguration("/**", buildConfig()); // 对接口配置跨域设置
    // return new CorsFilter(source);
    // }

}