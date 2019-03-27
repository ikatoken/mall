package com.mall.dao;

import com.mall.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  订单DAO
 */
public interface OrderItemMapper {
    /*
     * 根据订单详情主键编号删除订单信息
     * @param id    订单详情主键编号
     * @return      0 /1
     */
    int deleteByPrimaryKey(Integer id);

    /*
     * 新增订单详情对象
     * @param record    订单对象详情
     * @return          0 /1
     */
    int insert(OrderItem record);

    /*
     * 新增检查后的订单详情对象
     * @param record    订单对象详情
     * @return          0 /1
     */
    int insertSelective(OrderItem record);

    /*
     * 根据订单主键编号查询订单对象
     * @param id    订单主键编号
     * @return      订单对象 OrderItem
     */
    OrderItem selectByPrimaryKey(Integer id);

    /*
     * 根据订单主键编号检查后更新订单对象
     * @param record    订单对象
     * @return          0 /1
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /*
     * 更具订单详情的主键编号更新订单对象
     * @param record    订单对象
     * @return          0 /1
     */
    int updateByPrimaryKey(OrderItem record);

    /*
     * 根据订单编号跟用户主键编号查询订单列表
     * @param orderNo   订单编号
     * @param userId    用户编号
     * @return          0 /1
     */
    List<OrderItem> getByOrderNoUserId(@Param("orderNo") Long orderNo, @Param("userId") Integer userId);

    /*
     * 更具订单详情编号查询订单列表
     * @param orderNo  订单编号
     * @return         0 /1
     */
    List<OrderItem> getByOrderNo(@Param("orderNo") Long orderNo);


    /*
     * 批量插入订单详情
     * @param orderItemList
     */
    void batchInsert(@Param("orderItemList") List<OrderItem> orderItemList);


}