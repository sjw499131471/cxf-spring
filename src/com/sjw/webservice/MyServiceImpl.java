package com.sjw.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.sjw.webservice.IMyService",
serviceName = "myService")
public class MyServiceImpl implements IMyService {
	@Override
	public String sayHi(String text) {
		System.out.println("调用sayHi方法");
        return "Hello，" + text;
	}

}
