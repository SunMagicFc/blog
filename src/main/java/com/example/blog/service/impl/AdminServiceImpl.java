package com.example.blog.service.impl;


import com.example.blog.exception.ServiceException;
import com.example.blog.model.params.LoginParam;
import com.example.blog.security.token.AuthToken;
import com.example.blog.service.AdminService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;


@Slf4j
@Service
public class AdminServiceImpl implements AdminService {


    private final ApplicationEventPublisher eventPublisher;


    public AdminServiceImpl(
                            ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }


    @NonNull
    public String authenticate(@NonNull LoginParam loginParam) {
        Assert.notNull(loginParam, "Login param must not be null");

        String code = loginParam.getCode();
        String password = loginParam.getPassword();

        String mismatchTip = "用户名或者密码不正确";

        if (StringUtils.isEmpty(code)||StringUtils.isEmpty(password)) {
            mismatchTip = "用户名或密码不能为空！";
        }
        return mismatchTip;
    }


}
