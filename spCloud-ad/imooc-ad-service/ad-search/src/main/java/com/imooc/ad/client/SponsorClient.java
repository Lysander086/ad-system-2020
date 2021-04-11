package com.imooc.ad.client;

import com.imooc.ad.client.vo.AdPlan;
import com.imooc.ad.client.vo.AdPlanGetRequest;
import com.imooc.ad.vo.CommonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 使用 feign 的方式调用其他微服务的接口
 */
@FeignClient(
        value = "eureka-client-ad-sponsor", /* value 指向要调用的 微服务的名称 */
        fallback = SponsorClientHystrix.class /* 服务降级 */)
public interface SponsorClient {

    @PostMapping(value = "/ad-sponsor/get/adPlan")
    CommonResponse<List<AdPlan>> getAdPlans(@RequestBody AdPlanGetRequest request);

}
