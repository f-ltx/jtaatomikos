package cn.ltx.jtaatomikos.mapper2;

import cn.ltx.jtaatomikos.entity.User2;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper2 {
    int insert(User2 user2);
}
