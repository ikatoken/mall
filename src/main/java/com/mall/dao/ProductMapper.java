package com.mall.dao;

import com.mall.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品DAO
 * 作者：jeff
 *
 */
public interface ProductMapper {

    /*
     * 根据主键删除对应的产品数据
     * @param id 产品主键
     * @return   0 /1
     */
    int deleteByPrimaryKey(Integer id);

    /*
     * 添加商品信息
     * @param record 商品对象
     * @return       0 /1
     */
    int insert(Product record);

    /*
     * 添加查询后的商品信息
     * @param record  商品对象
     * @return        0 /1
     */
    int insertSelective(Product record);

    /*
     * 根据主键查询商品对象
     * @param id     商品主键
     * @return       商品对象 product
     */
    Product selectByPrimaryKey(Integer id);

    /*
     * 根据主键动态修改商品的信息
     * @param record    商品对象
     * @return          0 /1
     */
    int updateByPrimaryKeySelective(Product record);

    /*
     * 根据主键修改商品信息
     * @param record    商品对象
     * @return          0 /1
     */
    int updateByPrimaryKey(Product record);

    /*
     * 查询商品集合
     * @return List<Product>
     */
    List<Product> selectList();

    /*
     * 根据商品名称或者商品主键查询商品
     * @param productName 商品名称
     * @param productId   商品列表 List<Product>
     * @return
     */
    List<Product> selectByNameAndProductId(@Param("productName") String productName, @Param("productId") Integer productId);

    /*
     * 根据模糊匹配的产品名称或是分类编号查询商品的集合
     * @param productName      模糊的商品名称
     * @param categoryIdList   品类编号
     * @return                 商品List<Product>
     */
    List<Product> selectByNameAndCategoryIds(@Param("productName") String productName, @Param("categoryIdList") List<Integer> categoryIdList);


}