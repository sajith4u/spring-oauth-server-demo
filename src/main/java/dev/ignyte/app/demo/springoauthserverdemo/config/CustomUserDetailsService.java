package dev.ignyte.app.demo.springoauthserverdemo.config;

import dev.ignyte.app.demo.springoauthserverdemo.domain.App;
import dev.ignyte.app.demo.springoauthserverdemo.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private AppRepository appRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        App user = findUserbyUername(username);

        User.UserBuilder builder = null;
        if (user != null) {
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(user.getPassword());
            builder.roles(new String[]{"ADMIN"});
        } else {
            throw new UsernameNotFoundException("User not found.");
        }

        return builder.build();
    }

    private App findUserbyUername(String username) {
        App byUsername = appRepository.findByUsername(username);
        return byUsername;
    }
}
