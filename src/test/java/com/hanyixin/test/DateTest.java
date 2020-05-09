package com.hanyixin.test;

import java.util.Date;

import org.junit.Test;

import com.hanyixin.common.utils.DateUtil;

public class DateTest {

	//日期类的测试方法
	@Test
	public void dateShow() {
		try {
			Date initMonth = DateUtil.getDateByInitMonth(new Date());
			System.out.println("结果是  " + initMonth);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
