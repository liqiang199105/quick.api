package com.opapi.ctrl;

import com.opapi.service.admin.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Larkin on 30/9/15.
 */

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;


    @RequestMapping("/sysInfo")
    public Map<String, Object> getSysInfo(@RequestParam(value="name", defaultValue="World") String name) {
        return adminService.getSysInfo();
    }
}
