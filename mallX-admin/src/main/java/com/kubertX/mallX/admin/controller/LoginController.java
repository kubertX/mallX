package com.kubertX.mallX.admin.controller;

import com.kubertX.mallX.admin.dto.CommonResult;
import com.kubertX.mallX.admin.dto.LoginDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
@Slf4j
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody LoginDto loginDto){
        log.info("login--name:{}--pass:{}",loginDto.getUsername(),loginDto.getPassword());
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", "token");
        tokenMap.put("tokenHead", "tokenHead");
        CommonResult result = new CommonResult(200L, "操作成功", tokenMap);
        return result;

    }

    @RequestMapping(value = "/halo",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult halo(){
        log.info("login--name:{}--pass:{}");
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", "token");
        tokenMap.put("tokenHead", "tokenHead");
        CommonResult result = new CommonResult(200L, "操作成功", tokenMap);
        return result;

    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAdminInfo(){

        Map<String, Object> data = new HashMap<>();
        data.put("username", "admin");
        //data.put("menus", roleService.getMenuList(umsAdmin.getId()));
        //data.put("icon", "");
        CommonResult result = new CommonResult(200L, "操作成功", data);
        return result;

    }
}
