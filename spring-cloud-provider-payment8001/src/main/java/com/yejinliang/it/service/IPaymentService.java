package com.yejinliang.it.service;

import com.yejinliang.it.entity.PaymentDao;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yejinliang.it.entity.basic.Result;
import com.yejinliang.it.vo.PaymentVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yejinliang
 * @since 2022-07-08
 */
public interface IPaymentService extends IService<PaymentDao> {

    public Result create(PaymentVO vo);

}
