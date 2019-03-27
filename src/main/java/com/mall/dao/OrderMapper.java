package com.mall.dao;

import com.mall.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单DAO
 */
public interface OrderMapper{
    /*
     * 根据主键编号删除订单
     * @param id    订单编号
     * @return      0 ...
     */
    int deleteByPrimaryKey(Integer id);

    /*
     * 不为空的插入
     * 添加订单数据
     * @param record    订单对象
     * @return          0 /1
     */
    int insert(Order record);

    /*
     * 添加查询后的订单数据
     * @param record    订单对象
     * @return          0 /1
     */
    int insertSelective(Order record);

    /*
     * 根据主键查询订单
     * @param id    订单编号
     * @return      订单详情
     */
    Order selectByPrimaryKey(Integer id);

    /*
     * 根据订单编号修改查询后的订单信息
     * @param record    订单对象
     * @return          0 /1
     */
    int updateByPrimaryKeySelective(Order record);

    /*
     * 根据订单编号修改订单信息
     * @param record    订单对象
     * @return          0 /1
     */
    int updateByPrimaryKey(Order record);

    /*
     * 根据用户主键编号和订单编号查询订单
     * @param userId    用户主键编号
     * @param orderNo   订单主键编号
     * @return          订单对象
     */
    Order selectByUserIdAndOrderNo(@Param("userId") Integer userId, @Param("orderNo") Long orderNo);

    /*
     * 根据订单编号查询订单信息
     * @param orderNo   订单主键编号
     * @return          订单对象
     */
    Order selectByOrderNo(Long orderNo);

    /*
     * 根据用户主键查询订单列表
     * @param userId
     * @return
     */
    List<Order> selectByUserId(Integer userId);

    /*
     * 查询所有订单列表
     * @return
     */
    List<Order> selectAllOrder();
}