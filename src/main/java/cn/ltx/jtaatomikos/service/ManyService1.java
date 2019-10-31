package cn.ltx.jtaatomikos.service;

import cn.ltx.jtaatomikos.entity.User1;
import cn.ltx.jtaatomikos.entity.User2;
import cn.ltx.jtaatomikos.mapper1.UserMapper1;
import cn.ltx.jtaatomikos.mapper2.UserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

/**
* @author czs
* @version 创建时间：2018年8月12日 下午7:28:07 
*/
@Service
public class ManyService1 {
 
	@Autowired
	private UserMapper1 userMapper1;
 
	@Autowired
	private UserMapper2 userMapper2;
 
	// 开启事务，由于使用jta+atomikos解决分布式事务，所以此处不必再指定事务
	@Transactional
	public int insert(String name, Integer age) {
		User1 user1 = new User1();
		user1.setAge(age);
		user1.setName(name);
		int insert = userMapper1.insert(user1);
		int i = 1 / age;// 赋值age为0故意引发事务
		return insert;
	}
 
	// 开启事务，由于使用jta+atomikos解决分布式事务，所以此处不必再指定事务
	@Transactional
	public int insertDb1AndDb2(String name, Integer age) {
		User1 user1 = new User1();
		User2 user2 = new User2();
		user1.setAge(age);
		user1.setName(name);
		user2.setAge(age);
		user2.setName(name);
		int insert = userMapper1.insert(user1);
		int insert2 = userMapper2.insert(user2);
		int i = 1 / age;// 赋值age为0故意引发事务
		return insert + insert2;
	}
 
}