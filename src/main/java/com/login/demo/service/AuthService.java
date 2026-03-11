//package com.login.demo.service;
//
//import lombok.RequiredArgsConstructor;
//
//
//@RequiredArgsConstructor
//public class AuthService {
//	
//}


package com.login.demo.service;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.login.demo.DTO.LoginRequest;
import com.login.demo.DTO.RegisterRequest;
import com.login.demo.entity.User;
import com.login.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public String register(RegisterRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return "Email already exists!";
        }

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        userRepository.save(user);

        return "User Registered Successfully!";
    }

    public String login(LoginRequest request) {

        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            return "Login Successful!";
        } else {
            return "Invalid Password!";
        }
    }
}


