//package com.gcp.finaltask.service;
//
//import com.gcp.finaltask.model.User;
//import com.gcp.finaltask.model.dto.UserRequest;
//import com.gcp.finaltask.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//@Slf4j
//public class UserService {
//
//    private final UserRepository userRepository;
//
//    public User save(UserRequest user) {
//        var newUser = new User();
//        newUser.setUserName(user.getUserName());
//        newUser.setUserComment(user.getUserComment());
//        var savedUser = userRepository.save(newUser);
//        log.info("User {} saved", savedUser);
//        return savedUser;
//    }
//
//    public User findUserById(Long id) {
//        var user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
//        log.info("User {} found by id {}", user, id);
//        return user;
//    }
//}
