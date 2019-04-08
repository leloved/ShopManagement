package cn.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("goods")
public class GoodsController {

    @RequestMapping("/list")
    public String goodsList(){
        return "goodsList"; //返回逻辑视图名
    }
}
