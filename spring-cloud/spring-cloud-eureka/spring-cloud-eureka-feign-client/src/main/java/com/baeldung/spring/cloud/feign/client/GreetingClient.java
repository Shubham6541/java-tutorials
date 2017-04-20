package com.nklkarthi.spring.cloud.feign.client;

import com.nklkarthi.spring.cloud.eureka.client.GreetingController;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient extends GreetingController {
}
