package com.mall.dao;


import com.mall.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 *  作者：jeff
 *  地址：www.ikay.top
 *
 *
 *  存在的问题修正：
 *  代码到提交组织之前一定要进行codereviw 的操作!!!
 *
 */
public interface UserMapper {

    /*
     * 不为空的插入
     * @param record 用户类属性
     * @return int   数量
     *
     */
    int insert(User record);

    /*
     * 指定插入
     * @param record
     * @return
     */
    int insertSelective(User record);

    /*
     * 根据主键查询
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /*
     * 更具主键删除数据
     * @param id 用户编号
     * @return int
     *
     * 用户数据属于核心数据删除用户数据属于高级权限
     */
    int deleteByPrimaryKey(Integer id);

    /*
     * 根据填充的数据修改用户信息
     * @param record 用户对象
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /*
     * 完整数据修改用户信息
     * @param record 用户对象
     * @return
     */
    int updateByPrimaryKey(User record);

    /*
     * 检验用户名是否存在
     * @param username 用户名
     * @return
     */
    int checkUsername(String username);

    /*
     * 校验用户邮箱是否存在
     * @param email 邮箱
     * @return
     */
    int checkEmail(String email);

    /*
     * 查询用户名密码是否正确
     * @param username  用户名
     * @param password  密码
     * @return 用户信息
     *
     *  用户盐值加密校验密码非明文密码
     */
    User selectLogin(@Param("username") String username, @Param("password") String password);

    /*
     * 根据用户名获取用户重置密码问题
     * @param username 用户登录名
     * @return         密码提示问题
     */
    String selectQuestionByUsername(String username);

    /*
     * 校验问题的答案
     * @param username 用户登录名
     * @param question 密码提示问题
     * @param answer   问题答案
     * @return         0/1
     */
    int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    /*
     * 更改用户登录密码
     * @param username    用户名
     * @param passwordNew 新密码的md5加密值
     * @return            0/1
     */
    int updatePasswordByUsername(@Param("username") String username, @Param("passwordNew") String passwordNew);

    /*
     * 根据用户编号校验用户密码
     * @param password    密码
     * @param userId      用户编号
     * @return
     */
    int checkPassword(@Param(value = "password") String password, @Param("userId") Integer userId);

    /*
     * 根据用户编号校验用户邮箱
     * @param email
     * @param userId
     * @return
     */
    int checkEmailByUserId(@Param(value = "email") String email, @Param(value = "userId") Integer userId);
}