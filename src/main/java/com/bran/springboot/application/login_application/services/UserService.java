package com.bran.springboot.application.login_application.services;
import com.bran.springboot.application.login_application.dto.ChangePasswordForm;
import com.bran.springboot.application.login_application.entities.User;
import com.bran.springboot.application.login_application.exception.IdorUsernameNotFound;

import jakarta.validation.Valid;

public interface UserService { 
public Iterable<User> getAllUsers();

public User createUser(User user) throws Exception; 

public User getUserById(Long id) throws Exception;

public User updateUser(User user) throws Exception;

public void deleteUser(Long id) throws IdorUsernameNotFound;

public User changePassword(ChangePasswordForm form) throws Exception;
}
