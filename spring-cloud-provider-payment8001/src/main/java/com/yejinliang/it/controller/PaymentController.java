package com.yejinliang.it.controller;


import com.yejinliang.it.entity.PaymentDao;
import com.yejinliang.it.entity.basic.Result;
import com.yejinliang.it.service.IPaymentService;
import com.yejinliang.it.vo.PaymentVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yejinliang
 * @since 2022-07-08
 */
@Api(value = "用户管理",tags = "用户管理")
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private IPaymentService paymentService;

    @ApiOperation(value = "创建", notes = "创建")
    @PostMapping("/create")
    public Result create(@RequestBody PaymentVO paymentVO) {
        return paymentService.create(paymentVO);
    }

    @ApiOperation(value = "根据id查询", notes = "根据id查询")
    @GetMapping("/getById/{id}")
    public Result getById(@PathVariable("id") Long id) {
        PaymentDao byId = paymentService.getById(id);
        return Result.success(byId);
    }

}
