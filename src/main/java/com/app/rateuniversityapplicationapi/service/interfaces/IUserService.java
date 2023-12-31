package com.app.rateuniversityapplicationapi.service.interfaces;

import com.app.rateuniversityapplicationapi.dto.requests.AuthenticationRequest;
import com.app.rateuniversityapplicationapi.dto.requests.RegisterRequest;
import com.app.rateuniversityapplicationapi.dto.responses.AuthenticationResponse;
import com.app.rateuniversityapplicationapi.dto.responses.UserResponse;
import com.app.rateuniversityapplicationapi.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface IUserService {
    AuthenticationResponse authenticate(AuthenticationRequest request);

    ResponseEntity<AuthenticationResponse> register(RegisterRequest request);

    int getNumberOfStudents();

    User findUserById(UUID uuid);

    UserResponse getCurrentUser();

    void dropCourse(UUID uuid, String email);
}
