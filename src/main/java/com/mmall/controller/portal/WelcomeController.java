package com.mmall.controller.portal;

import com.mmall.common.Const;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by yichenyang on 2018/3/10.
 */
@Controller
@RequestMapping("/welcome/")
public class WelcomeController {
    @RequestMapping(value = "index.do")
    public String welcome(){
        return "/index";
    }
}
