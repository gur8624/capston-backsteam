package com.caston.back.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.CorsUtils;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity // 스프링 시큐리티 필터가 스프링 필토체인에 등록됨
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CorsFilter corsFilter;
    // 해당 메서드의 리턴되는 오브젝트를 loc로 등록해준다.
    @Bean
    public BCryptPasswordEncoder encodePwd() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void
    configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable();
        http.authorizeRequests()
//                .antMatchers("/user/**").authenticated() // 권한 상관없이 가능
//                .antMatchers("/manager/**").access("hasRole('ROLE_ADMIN' or hasRole('ROLE_MANGER'))") // admin, manager 권한이 있어야 함
//                .antMatchers("/admint/**").access("hasRole('ROLE_ADMIN')") // admin 권한이 있어야 함
                .anyRequest().permitAll()
                .and().addFilter(corsFilter);
//                .and()
//                .formLogin() // 이거 없이 하면
//                .loginPage("/login");
    }

//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        // - (3)
//        configuration.addAllowedOrigin("*"); // CORS 허용할 사이트
//        configuration.addAllowedMethod("*");  // CORS 허용할 Http Method(GET, PUT, POST)
//        configuration.addAllowedHeader("*"); // 특정 헤더를 가진 경우에만 CORS 요청을 허용
//        configuration.setAllowCredentials(true);
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }
}
