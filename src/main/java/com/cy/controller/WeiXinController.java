package com.cy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Create by 猪小帅
 * @date 2022/8/31 15:32
 * @mood happy
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeiXinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.error("进入auth方法....");
        log.info("code = {}", code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxa7020bbc7570f57b&secret=431bb6ef7e6cee98850e8928cb53c4c4&code=" + code + "&grant_type=authorization_code";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url,  String.class);
        log.info("response = {}", response);
    }
}
