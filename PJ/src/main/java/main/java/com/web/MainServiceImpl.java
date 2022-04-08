package main.java.com.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("service")
public class MainServiceImpl implements MainService{
	
	@Resource
	MainDao dao;
	
	@Override
	public String select() {
		System.out.println("serviceimpl");
		return dao.select();
	}

}
