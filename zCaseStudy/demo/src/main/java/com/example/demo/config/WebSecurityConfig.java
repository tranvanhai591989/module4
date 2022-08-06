package com.example.demo.config;

import com.example.demo.service.user.MyUserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailServiceImpl myUserDetailService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailService).passwordEncoder(passwordEncoder());
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
//                .antMatchers("/bootstrap-5.0.2-dist/**","/css/**", "/js/**","/image/**").permitAll();
//        http.csrf().disable().formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/").permitAll()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/login").permitAll()
//                .antMatchers("/").permitAll()
//                .antMatchers("/**").hasAnyRole("hai")
//                .antMatchers("/customer").hasAnyRole("employee")
//                .anyRequest().authenticated();
//
//        http.authorizeRequests().and().rememberMe()
//                .tokenRepository(persistentTokenRepository())
//                .tokenValiditySeconds(30 * 24 * 60 * 60);


        http.csrf().disable();
//                no need to login
        http.authorizeRequests()
                .antMatchers("/", "/login").permitAll();
        http.authorizeRequests().requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                .antMatchers("/bootstrap-5.0.2-dist/**","/css/**", "/js/**","/img/**").permitAll();
//                role match
        http.authorizeRequests().antMatchers("/customer/**").access("hasAnyRole('ROLE_employee', 'ROLE_hai')");
        http.authorizeRequests().antMatchers("/employee/**").access("hasAnyRole( 'ROLE_hai')");
        http.authorizeRequests().antMatchers("/service/**").access("hasAnyRole('ROLE_employee', 'ROLE_hai')");

        http.authorizeRequests().antMatchers("/contract/**").access("hasAnyRole('ROLE_hai')");
//                error 403
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
//                login form setup
        http.authorizeRequests().and().formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .failureUrl("/login?error=true")
                .usernameParameter("username")
                .passwordParameter("password");
        // Cấu hình cho Logout Page.
//                .and().logout().logoutUrl("/home").logoutSuccessUrl("/home");

        http.authorizeRequests().and().rememberMe().tokenRepository(persistentTokenRepository()).tokenValiditySeconds(24 * 60 * 60);
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        InMemoryTokenRepositoryImpl memoryTokenRepository = new InMemoryTokenRepositoryImpl();
        return memoryTokenRepository;
    }
}
