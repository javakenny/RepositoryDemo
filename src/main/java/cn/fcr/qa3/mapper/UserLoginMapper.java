package cn.fcr.qa3.mapper;

import org.apache.ibatis.annotations.Param;

import cn.fcr.qa3.pojo.UserLogin;

public interface UserLoginMapper {
	
	UserLogin selectByEmail(String userEmail);
	
	int login(@Param("userEmail")String userEmail,@Param("password")String password);
	
	int selectUserLoginCount();
	
	int selectUser(UserLogin record);
	
    int deleteByPrimaryKey(Integer userId);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);
}