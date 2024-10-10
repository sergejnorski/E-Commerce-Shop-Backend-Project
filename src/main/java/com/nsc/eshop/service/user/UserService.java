package com.nsc.eshop.service.user;

import com.nsc.eshop.dto.UserDto;
import com.nsc.eshop.model.User;
import com.nsc.eshop.request.CreateUserRequest;
import com.nsc.eshop.request.UserUpdateRequest;

public interface UserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
    UserDto convertUserToDto(User user);
    User getAuthenticatedUser();
}
