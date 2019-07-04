package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SeckillDaoTest {
    @Autowired
    private SeckillDao seckillDao;
    @Test
    public void reduceNumber() {
        int num = seckillDao.reduceNumber(1000L, new Date());
        System.out.println(num);
    }

    @Test
    public void queryById() {
        Seckill seckill = seckillDao.queryById(1000L);
        System.out.println(seckill);
    }

    @Test
    public void queryAll() {
        List<Seckill> list = seckillDao.queryAll(0, 10);
        System.out.println(list);
    }
}