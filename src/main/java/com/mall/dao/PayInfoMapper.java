package com.mall.dao;

import com.mall.pojo.PayInfo;

/**
 * 支付详情DAO
 */
public interface PayInfoMapper {
    /*
     * 根据支付详情主键编号删除支付详情信息
     * @param id    支付详情主键编号
     * @return      0 /1
     */
    int deleteByPrimaryKey(Integer id);

    /*
     * 插入支付详情
     * @param record    支付详情对象
     * @return          0 /1
     */
    int insert(PayInfo record);

    /*
     * 插入查询后的支付详情
     * @param record    支付详情对象
     * @return          0 /1
     */
    int insertSelective(PayInfo record);

    /*
     * 根据主键标号查询支付详情对象
     * @param id        支付详情主键编号
     * @return          支付详情对象
     */
    PayInfo selectByPrimaryKey(Integer id);

    /*
     * 修改查询后的支付详情对象内容根据主键编号
     * @param record    支付详情主键编号
     * @return          0 /1
     */
    int updateByPrimaryKeySelective(PayInfo record);

    /*
     * 修改支付详情对象内容根据主键编号
     * @param record    支付详情主键编号
     * @return          0 /1
     */
    int updateByPrimaryKey(PayInfo record);
}