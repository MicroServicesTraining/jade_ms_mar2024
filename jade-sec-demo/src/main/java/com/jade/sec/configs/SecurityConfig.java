/**
 * 
 */
package com.jade.sec.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * 
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

	/*@Bean
	public InMemoryUserDetailsManager userDetailsManager(PasswordEncoder passwordEncoder) {
		UserDetails userGopi = User.withUsername("gopi")
				.password(passwordEncoder.encode("1234"))
				.roles("ADMIN")
				.build();
		UserDetails userRamu = User.withUsername("ramu")
				.password(passwordEncoder.encode("abcd"))
				.roles("STUDENT")
				.build();
		UserDetails userRavi = User.withUsername("ravi")
				.password(passwordEncoder.encode("ab12"))
				.roles("TEACHER")
				.build();
		return new InMemoryUserDetailsManager(userGopi, userRamu, userRavi);
	}*/
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsManager configureAuthentication() {
		JdbcUserDetailsManager userDetailsManager = new JdbcUserDetailsManager(dataSource);
		userDetailsManager
				.setUsersByUsernameQuery("select user_name, user_pwd, enabled from sn_users where user_name = ?");
		userDetailsManager
				.setAuthoritiesByUsernameQuery("select user_name, role_name from sn_roles where user_name = ?");
		return userDetailsManager;
	}
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	
		http
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/greet/hello").permitAll())
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/greet/welcome").authenticated())
		//.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/student/welcome").authenticated())
		//.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/teacher/welcome").authenticated())
		//.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/admin/welcome").authenticated())
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/student/welcome").hasRole("STUDENT"))
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/student/writeexam").hasRole("STUDENT"))
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/student/checkresult").hasAnyRole("STUDENT", "TEACHER", "ADMIN"))
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/teacher/welcome").hasRole("TEACHER"))
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/teacher/evaluate").hasRole("TEACHER"))
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/v1/admin/**").hasRole("ADMIN"))
				/*
				 * .authorizeHttpRequests((authorize) ->
				 * authorize.requestMatchers("/api/v1/admin/welcome").hasRole("ADMIN"))
				 * .authorizeHttpRequests((authorize) ->
				 * authorize.requestMatchers("/api/v1/admin/addstudent").hasRole("ADMIN"))
				 * .authorizeHttpRequests((authorize) ->
				 * authorize.requestMatchers("/api/v1/admin/addteacher").hasRole("ADMIN"))
				 */
		.logout(Customizer.withDefaults())
		.formLogin(Customizer.withDefaults());
		//.httpBasic(Customizer.withDefaults());
		
		return http.build();
    }
	
	/*
	 * @Bean public PasswordEncoder passwordEncoder() { return
	 * PasswordEncoderFactories.createDelegatingPasswordEncoder(); }
	 */
	
}
