package cn.info.mapper;
import cn.info.pojo.User;
import java.util.List;
public interface UserMapper {
    void  insertUser(User user);
    List<User>  selectAll();
}
