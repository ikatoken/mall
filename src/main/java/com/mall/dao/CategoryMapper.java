package com.mall.dao;

import com.mall.pojo.Category;

import java.util.List;

/**
 * 品类DAO
 * 作者：jeff
 *
 */
public interface CategoryMapper {

    /*
     * 根据用户主键删除指定分类
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /*
     * 不为空的插入
     * @param record 品类对象
     * @return       0 /1
     */
    int insert(Category record);

    /*
     * 查询带有数值的插入
     * @param record 品类对象
     * @return       0/1
     */
    int insertSelective(Category record);

    /*
     * 根据主键查询品类
     * @param id 品类ID
     * @return   品类对象
     */
    Category selectByPrimaryKey(Integer id);

    /*
     * 跟具主键ID 修改品类数据
     * @param record 品类对象
     * @return       0 /1
     */
    int updateByPrimaryKeySelective(Category record);

    /*
     * 根据主键修改品类信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Category record);

    /*
     * 根据品类的父亲节点查询品类集合
     * @param parentId
     * @return
     */
    List<Category> selectCategoryChildrenByParentId(Integer parentId);
}