import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    //El siguiente método funciona para hacer la auttenticación del usuario
   @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("juan")
                    .password("{noop}123")
                    .roles("ADMIN","VENDEDOR","USER")
                .and()
                .withUser("rebeca")
                    .password("{noop}123")
                    .roles("VENDEDOR","USER")
                .and()
                .withUser("pedro")
                    .password("{noop}123")
                    .roles("USER");
    }
}
