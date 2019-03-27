package com.mall.dao;

import com.mall.pojo.Cart;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 *  购物车DAO
 *
 */
public interface CartMapper {

    /*
     * 插入购物车数据
     * @param record 购物车对象
     * @return       0 /1
     */
    int insert(Cart record);

    /*
     * 插入查询后的购物车对象
     * @param record    购物车对象
     * @return          0 /1
     */
    int insertSelective(Cart record);

    /*
     * 根据购物车主键编号的删除购物车
     * @param id    购物车主键编号
     * @return      0 /1
     */
    int deleteByPrimaryKey(Integer id);

    /*
     * 根据购物车主键编号查询购物
     * @param id    购物车主键编号
     * @return      购物车对象 Cart
     */
    Cart selectByPrimaryKey(Integer id);

    /*
     * 更新购物车数据根据购物车主键编号
     * @param record 购物车对象
     * @return       0 /1
     */
    int updateByPrimaryKeySelective(Cart record);

    /*
     * 插入购物车对象
     * @param record    购物车对象
     * @return          0 /1
     */
    int updateByPrimaryKey(Cart record);

    /*
     * 根据用户主键编号或者商品编号查询购物车对象
     * @param userId    用户编号
     * @param productId 商品编号
     * @return          购物车对象 Cart
     */
    Cart selectCartByUserIdProductId(@Param("userId") Integer userId, @Param("productId") Integer productId);

    /*
     * 根据用户编号查询购物车列表
     * @param userId    用户编号
     * @return          购物车列表
     */
    List<Cart> selectCartByUserId(Integer userId);

    /*
     * 检查用户的购物车商品是否被勾选
     * @param userId    用户编号
     * @return          0 /1
     */
    int selectCartProductCheckedStatusByUserId(Integer userId);

    /*
     * 删除指定用户编号的商品列表书
     * @param userId            用户编号
     * @param productIdList     商品列表
     * @return                  0 /1
     */
    int deleteByUserIdProductIds(@Param("userId") Integer userId, @Param("productIdList") List<String> productIdList);

    /*
     * 根据用户编号及产品编号修改商品被勾选的状态
     * @param userId            用户编号
     * @param productId         商品编号
     * @param checked           勾选状态
     * @return                  0 /1
     */
    int checkedOrUncheckedProduct(@Param("userId") Integer userId, @Param("productId") Integer productId, @Param("checked") Integer checked);

    /*
     *  查询购物车商品数量
     * @param userId        用户编号
     * @return              0 ...
     */
    int selectCartProductCount(@Param("userId") Integer userId);

    /*
     * 根据用户编号查询,查询已勾选的购物车列表
     * @param userId        用户编号
     * @return              购物车列表 list<Cart>
     */
    List<Cart> selectCheckedCartByUserId(Integer userId);

}