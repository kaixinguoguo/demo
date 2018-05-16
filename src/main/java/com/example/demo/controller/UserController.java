package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "用户接口")
public class UserController {

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "string",paramType = "query")
    )
    @GetMapping("user/id")
    public String getUser(String id) {
        return id;
    }

}
