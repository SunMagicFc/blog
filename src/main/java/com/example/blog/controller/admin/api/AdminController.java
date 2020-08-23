package com.example.blog.controller.admin.api;


import com.example.blog.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.blog.model.params.LoginParam;
import com.example.blog.security.token.AuthToken;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")

@Api(value = "管理员操作", tags = "Admin", description = "管理员信息")
public class AdminController {


    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    @PostMapping("login")
    @ApiOperation("Login")
    public String auth(@RequestBody @Valid LoginParam loginParam) {
        return adminService.authenticate(loginParam);
    }
}
