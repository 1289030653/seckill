package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by eddie on 2017/3/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        long id = 1001L;
        long phone = 1350218110L;
        int insertCount = successKilledDao.insertSuccessKilled(id, phone);
        System.out.println("insertCount = " + insertCount);

    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id = 1001L;
        long phone = 1350218110L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id,phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
        /**
         *
         SuccessKilled
         {
            seckillId=1000,
            userPhone=1350218110, state=-1,
            createTime=Fri Mar 17 18:10:59 CST 2017}
         Seckill{seckillId=1000, name='1000元秒杀小米', number=99, startTime=Wed Mar 15 17:40:43 CST 2017, endTime=Sun Apr 02 00:00:00 CST 2017, createTime=Sun Mar 12 19:10:17 CST 2017}
         Disconnected from the target VM, address: '127.0.0.1:49764', transport: 'socket'
         */
    }

}