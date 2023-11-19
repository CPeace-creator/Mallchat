package org.mallchat.user.user.dao;

import org.mallchat.user.user.domain.entity.User;
import org.mallchat.user.user.mapper.UserMapper;
import org.mallchat.user.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author cjh
 * @since 2023-11-19
 */
@Service
public class UserDao extends ServiceImpl<UserMapper, User> implements IUserService {

}
