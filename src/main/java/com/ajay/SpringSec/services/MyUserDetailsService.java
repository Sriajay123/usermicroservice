package com.ajay.SpringSec.services;

import com.ajay.SpringSec.models.MyUserDetails;
import com.ajay.SpringSec.models.Users;
import com.ajay.SpringSec.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Users user= usersRepository.findByUsername(username);
        if(user==null){
            System.out.println("user is not present");
            throw  new UsernameNotFoundException("user is not present");
        }




        return new MyUserDetails(user);
    }
}
