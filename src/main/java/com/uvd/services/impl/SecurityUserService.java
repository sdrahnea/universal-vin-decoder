package com.uvd.services.impl;

import com.uvd.model.security.SecurityUser;
import com.uvd.repositories.SecurityUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by sdrahnea
 */
@Service
@RequiredArgsConstructor
public class SecurityUserService implements UserDetailsService {

    private final SecurityUserDto userDao;

    public SecurityUser register(SecurityUser user){
        return userDao.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("trying to access with username "+username);
        Optional<SecurityUser> userOptional= userDao.findByUsername(username);
        if(!userOptional.isPresent())throw new UsernameNotFoundException("user "+username+ " not found");
        SecurityUser user = userOptional.get();
        return new User(user.getUsername(),user.getPassword(),user.getSecurityRoles());
    }
}
