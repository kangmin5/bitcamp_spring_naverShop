package com.mkweb.api;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * packageName: com.mkweb.api
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-24
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-24   kangmin5    최초생성
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods(CorsConfiguration.ALL)
                .allowedHeaders(CorsConfiguration.ALL)
                .allowedOriginPatterns(CorsConfiguration.ALL);
    }
}