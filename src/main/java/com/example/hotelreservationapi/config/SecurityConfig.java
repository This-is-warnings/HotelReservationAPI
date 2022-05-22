package com.example.hotelreservationapi.config;

import com.example.hotelreservationapi.config.jwt.JwtFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

    @Autowired
    private JwtFilter jwtFilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and()
                .httpBasic().disable()
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()

                //users
                .antMatchers("/users", "/users/*").hasAnyRole("ADMIN", "MANAGER")
                .antMatchers("/users/*/cards", "/users/cards/*").hasRole("CLIENT")

                //reserved rooms
                .antMatchers("/reservedRoom", "/reservedRoom/status").hasRole("MANAGER")
                .antMatchers(HttpMethod.PUT, "/reservedRoom/*").hasRole("CLIENT")
                .antMatchers(HttpMethod.DELETE, "/reservedRoom/*").hasRole("MANAGER")
                .antMatchers("/reservedRoom/users/*").hasRole("CLIENT")

                //roles
                .antMatchers("/roles").hasRole("ADMIN")

                // rooms
                .antMatchers("/rooms").hasRole("MANAGER")
                .antMatchers(HttpMethod.GET, "/rooms/*").hasAnyRole("CLIENT", "MANAGER")
                .antMatchers(HttpMethod.DELETE, "/rooms/*").hasRole("MANAGER")
                .antMatchers(HttpMethod.POST, "/rooms/*").hasRole("MANAGER")

                // requests
                .antMatchers(HttpMethod.GET, "/requests").hasRole("MANAGER")
                .antMatchers(HttpMethod.POST, "/requests").hasRole("CLIENT")
                .antMatchers(HttpMethod.GET, "/requests/**").hasAnyRole("MANAGER", "CLIENT")
                .antMatchers(HttpMethod.PUT, "/requests/**").hasAnyRole("MANAGER", "CLIENT")
                .antMatchers(HttpMethod.DELETE, "/requests/**").hasAnyRole("MANAGER", "CLIENT")
                .antMatchers(HttpMethod.POST, "/requests/status").hasAnyRole("MANAGER", "CLIENT")

                //auth
                .antMatchers("/auth").permitAll()

                //.anyRequest().authenticated()
                .and()
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
