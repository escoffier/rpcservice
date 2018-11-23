package com.example.rpcservice;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import org.springframework.stereotype.Component;

@SofaService(interfaceType = HelloSyncService.class, bindings = { @SofaServiceBinding(bindingType = "bolt")})
@Component
public class HelloSyncServiceImpl implements HelloSyncService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
