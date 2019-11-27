package com.yellow.bot.service.impl;


import com.yellow.bot.model.DialogFlowQuery;
import com.yellow.bot.service.abstracts.IntentService;
import com.yellow.bot.util.Constants;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IntentServiceImpl implements IntentService {


    @Override
    public String handleQuery(DialogFlowQuery dialogFlowQuery) {

        String clientAccessToken = Constants.ACCESS_TOKEN;
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBearerAuth(clientAccessToken);

        HttpEntity<DialogFlowQuery> dialogFlowQueryHttpEntity = new HttpEntity<>(dialogFlowQuery,httpHeaders);
        return restTemplate.postForObject(Constants.DIALOG_FLOW_QUERY_URL,dialogFlowQueryHttpEntity,String.class);
    }


}
