package com.sridhar.ecommerceApp.RazorpayPaymentLink;

import com.razorpay.PaymentLink;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.List;

@RestController
public class Controller {
    @GetMapping("/api/paymentLink")
    public List<PaymentLink> paymentLink ()throws RazorpayException {
        RazorpayClient razorpay = new RazorpayClient("rzp_test_SYxQKFMJrZMFd7", "ewHKZBdQ05OgfyKRlWkIzEVP");

        JSONObject params = new JSONObject();
        params.put("reference_id","56H1989");


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);



        return razorpay.paymentLink.fetchAll(params);
    }
}
