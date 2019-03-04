package cn.info.service.impl;
import cn.info.mapper.UserMapper;
import cn.info.pojo.User;
import cn.info.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;
    public void addUser(User user) {
        mapper.insertUser(user);
    }
}
