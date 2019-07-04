package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: wangbo
 * \* Date: 2019/7/4
 * \* Time: 11:09
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface SuccessKilledDao {

    /*
    * 插入购买明细，可以过滤重复
    * */
    int insertSuccessKilled(long seckillId,long userPhone);


    SuccessKilled queryByIdWithSeckill(long seckillId);
}