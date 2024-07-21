package com.EurekDemo.shopping_service.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@ResponseBody
public class ShoppingController {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/shopping-payment/{price}")
    public String invokePaymentService(@PathVariable int price){
        String URL = "http://payment-service/payment-provider/payNow/"+price;
        return restTemplate.getForObject(URL,String.class);
    }
}
