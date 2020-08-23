package com.example.blog.service;

import com.example.blog.model.params.LoginParam;
import com.example.blog.security.token.AuthToken;
import org.springframework.lang.NonNull;




public interface AdminService {


    /**
     * Check authCode and build authToken.
     *
     * @param loginParam login param must not be null
     * @return User
     */
    @NonNull
    String authenticate(@NonNull LoginParam loginParam);


}
