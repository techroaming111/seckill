package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: wangbo
 * \* Date: 2019/7/4
 * \* Time: 11:06
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface SeckillDao {


    /*
    * 减库存
    *
    * */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /*
    * 根据id查商品
    * */
    Seckill queryById(long seckillId);

    /*
    * 根据偏移量查询商品列表
    * */
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}