package com.example.rpcservice;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import org.springframework.stereotype.Component;

@Component
public class HelloClientImpl {

    @SofaReference(interfaceType = HelloSyncService.class, jvmFirst = false, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private HelloSyncService helloSyncService;

    public String sayHelloClient(String name){
        String result = helloSyncService.sayHello(name);

        return result;
    }
}

