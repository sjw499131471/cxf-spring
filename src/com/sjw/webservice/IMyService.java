package com.sjw.webservice;

import javax.jws.WebService;

@WebService
public interface IMyService {
	//���弸��������ÿ������������¶��һ��Web Services����
	String sayHi(String text);
}
