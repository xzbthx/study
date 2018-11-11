package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import bean.Diaosi;

public class GsonCreateSample {

	public static void main(String[] args) {
		Diaosi wangxiaoer = new Diaosi();
		String[] major = new String[] {"理发","挖掘机"};
		wangxiaoer.setName("王小二");
		wangxiaoer.setAge(25.2);
		wangxiaoer.setBirthday("1990-01-01");
		wangxiaoer.setSchool("蓝翔");
		wangxiaoer.setMajor(major);
		wangxiaoer.setHas_girlfriend(false);
		wangxiaoer.setCar(null);
		wangxiaoer.setHouse(null);
		wangxiaoer.setComment("这是一个注释");
		//
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		Gson gson = gsonBuilder.create();
		System.out.println(gson.toJson(wangxiaoer));
	}
}
