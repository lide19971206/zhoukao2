package com.lide.domain;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.lide.common.utils.RandomUtil;
import com.lide.common.utils.StringUtil;

public class PersonTest {

	@Test
	public void test() throws UnsupportedEncodingException {
	//生成10000个人类
		for (int i = 0; i < 10000; i++) {
			Person p = new  Person();
			//使用工具类插入姓名
			p.setName(StringUtil.generateChineseName());
			//使用工具类插入年龄
			p.setAge(RandomUtil.random(1,120));
			//使用工具类插入介绍
			p.setAbout(StringUtil.randomChineseString(140));
			//创建日历类
			Calendar c = Calendar.getInstance();
			c.set(2010,0,1);
			Date datec = c.getTime();
			Date date = new Date();
			//生成随机年 因为random是int取值 所以用Math的random
			date.setTime((long) (Math.random()*(date.getTime()-datec.getTime())+datec.getTime()));
			p.setCreated(date);
			System.out.println(p);
		}
	}

}
