package com.yellow.bot.service.abstracts;

import com.yellow.bot.model.DialogFlowQuery;
import org.springframework.stereotype.Service;

@Service
public interface IntentService {
    public String handleQuery(DialogFlowQuery dialogFlowQuery) throws Exception;
}
