//package com.example.LocalReservationApp.security;
//
//import com.example.LocalReservationApp.dal.entity.UserEntity;
//import com.example.LocalReservationApp.dal.repository.UserRepository;
//import com.example.LocalReservationApp.domain.UserModel;
//import com.example.LocalReservationApp.mapper.UserEntityMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    private UserRepository userRepository;
//
//    @Autowired
//    public UserDetailsServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserEntity user = userRepository.findByUsername(username)
//                                                 .orElseThrow(() -> new UsernameNotFoundException("Username '" + username + "' does not exist"));
//
//        return new UserDetails() {
//
//            @Override
//            public Collection<? extends GrantedAuthority> getAuthorities() {
//                return null;
//            }
//
//            @Override
//            public String getPassword() {
//                return user.getPassword();
//            }
//
//            @Override
//            public String getUsername() {
//                return user.getUserName();
//            }
//
//            @Override
//            public boolean isAccountNonExpired() {
//                return true;
//            }
//
//            @Override
//            public boolean isAccountNonLocked() {
//                return true;
//            }
//
//            @Override
//            public boolean isCredentialsNonExpired() {
//                return true;
//            }
//
//            @Override
//            public boolean isEnabled() {
//                return true;
//            }
//        };
//    }
//}
