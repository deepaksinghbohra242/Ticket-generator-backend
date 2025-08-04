package com.collector.ticketcollector.security;

import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
//
//        return user;
//    }
//
//    @Transactional
//    public UserDetails loadUserById(Long id) {
//        User user = userRepository.findById(id)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found with id: " + id));
//
//        return user;
//    }
}
