package com.sjw.webservice;

import javax.jws.WebService;

@WebService
public interface IMyService {
	//定义几个方法，每个方法将被暴露成一个Web Services操作
	String sayHi(String text);
}
