package com.evaluationmanager.test;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.LoginLog;
import com.evaluationmanager.service.LogService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml" })
public class LoginTest {
	
	@Autowired
	private LogService logService;
	
	@Test
	public void test() {
		
		try {
			LoginLog loginLog = new LoginLog();
			String paginSearch = logService.paginSearch(new Pagin<Map<String,Object>>(1,10), loginLog);
			System.err.println(paginSearch);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
