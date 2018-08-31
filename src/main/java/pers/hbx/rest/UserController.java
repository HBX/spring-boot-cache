package pers.hbx.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.hbx.entity.User;
import pers.hbx.service.UserService;

/**
 * 类描述：
 * <p>
 * <pre>
 * -------------History------------------
 *   DATE                     AUTHOR         VERSION        DESCRIPTION
 *   2018年08月31日 11:29      Bluesky       V01.00.001		  新增内容
 * </pre>
 *
 * @author <a href="mailto:huangbingxin@zhangkongapp.com">黄兵新</a>
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public User users(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

}
