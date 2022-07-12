package com.yejinliang.it.service.impl;

import com.yejinliang.it.entity.PaymentDao;
import com.yejinliang.it.entity.basic.Result;
import com.yejinliang.it.itenum.ResultEnum;
import com.yejinliang.it.mapper.PaymentMapper;
import com.yejinliang.it.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yejinliang.it.vo.PaymentVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yejinliang
 * @since 2022-07-08
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, PaymentDao> implements IPaymentService {

    @Override
    public Result create(PaymentVO vo) {
        PaymentDao dao = new PaymentDao();
        dao.setSerial(vo.getSerial());
        boolean save = save(dao);
        return Result.success(save);
    }
}
