package pers.hbx.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.hbx.entity.User;

/**
 * 类描述：
 * <p>
 * <pre>
 * -------------History------------------
 *   DATE                     AUTHOR         VERSION        DESCRIPTION
 *   2018年08月31日 11:30      Bluesky       V01.00.001		  新增内容
 * </pre>
 *
 * @author <a href="mailto:huangbingxin@zhangkongapp.com">黄兵新</a>
 */
@Service
@Slf4j
public class UserService {


    @Cacheable(value = "user", key = "'user:'.concat(#id)")
    public User getById(long id) {
        User user = new User();
        user.setId(id);
        user.setName("test");
        user.setPass("test");

        log.info("创建了一个用户...{}", user);
        return user;
    }
}
