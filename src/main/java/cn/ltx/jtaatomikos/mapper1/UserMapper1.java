package cn.ltx.jtaatomikos.mapper1;

import cn.ltx.jtaatomikos.entity.User1;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper1 {
    int insert(User1 user1);
}
