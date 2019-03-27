package com.mall.dao;

import com.mall.pojo.Shipping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  购物车DAO
 *
 */
public interface ShippingMapper {

    /*
     * 根据主键删除购物车中的商品
     * @param id 购物车编号
     * @return   0 /1
     */
    int deleteByPrimaryKey(Integer id);

    /*
     * 添加购物车商品
     * @param record    购物车对象
     * @return          0 /1
     */
    int insert(Shipping record);

    /*
     * 添加查询后的购物车商品
     * @param record    购物车对象
     * @return          0 /1
     */
    int insertSelective(Shipping record);

    /*
     * 根据购物车编号查询购物车对象
     * @param id    购物车主键
     * @return      购物车对象
     */
    Shipping selectByPrimaryKey(Integer id);

    /*
     * 根据购物车的编号检查更新购物车对象的属性
     * @param record    购物车对象
     * @return          0 /1
     */
    int updateByPrimaryKeySelective(Shipping record);

    /*
     * 更具提供的购物车对对象的编号更新购物车的属性
     * @param record    购物车对象(不检查)
     * @return          0 /1
     */
    int updateByPrimaryKey(Shipping record);

    /*
     * 删除指定指定用户在购物车中的商品
     * @param userId        用户主键编号
     * @param shippingId    购物车编号
     * @return              0 ...
     */
    int deleteByShippingIdUserId(@Param("userId") Integer userId, @Param("shippingId") Integer shippingId);

    /*
     * 根据购物车主键编号更新购物车对象的属性
     * @param record    过车的对象
     * @return          0 /1
     */
    int updateByShipping(Shipping record);

    /*
     * 跟具用户主键及购物车编号查询购物车对象
     * @param userId        用户主键编号
     * @param shippingId    购物车主键编号
     * @return              购物车对象<Shipping>
     */
    Shipping selectByShippingIdUserId(@Param("userId") Integer userId, @Param("shippingId") Integer shippingId);

    /*
     * 查询用户在购物车购买的数量
     * @param userId        用户主键编号
     * @return              购物车集合List<Shipping>
     */
    List<Shipping> selectByUserId(@Param("userId") Integer userId);

}