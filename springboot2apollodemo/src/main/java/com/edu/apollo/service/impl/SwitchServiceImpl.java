package com.edu.apollo.service.impl;

import com.edu.apollo.config.DemoGlobalConfig;
import com.edu.apollo.service.SwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SwitchServiceImpl implements SwitchService {
    @Autowired
    private DemoGlobalConfig demoGlobalConfig;

    @Override
    public String getSwitchData() {
        if (demoGlobalConfig.isSwitchFlag()) {
            return "new";
        } else {
            return "old";
        }
    }
}
