package org.mallchat;

import org.junit.runner.RunWith;
import org.mallchat.user.dao.UserDao;
import org.mallchat.user.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cjh
 * @date 2023/11/19
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {
    @Autowired
    private UserDao userDao;
    @org.junit.Test
    public  void test(){
        User user=new User();
        user.setName("1");
        user.setOpenId("测试");
        userDao.save(user);
    }
}
