package bean;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

public class ReadJSONSample {

	public static void main(String[] args) throws IOException {
		File file = new File(ReadJSONSample.class.getResource("/wangxiaoer.json").getFile());
		String content = FileUtils.readFileToString(file);
		JSONObject jsonObject = new JSONObject(content);
		System.out.println("姓名是：" + jsonObject.getString("name"));
	}
}
