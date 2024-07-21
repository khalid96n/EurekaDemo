package com.EurekDemo.payment_service.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/payment-provider")
public class paymentController {

    @GetMapping("/payNow/{price}")

    public String payNow(@PathVariable int price){
        return "payment with" + price +"is successful";
    }
}
