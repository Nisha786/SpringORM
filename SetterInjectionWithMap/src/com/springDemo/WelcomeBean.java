package com.springDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WelcomeBean {

	public Map studentsData;

	public void setStudentsData(Map studentsData) {
		this.studentsData = studentsData;
	}
	
	public void show()
	{
		Set s = studentsData.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey() + "\t" + me.getValue());
		}
	}
}
