package com.zcf.utils.Plivo.mine;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 網站爬蟲
 * 
 * @author chenkang
 *
 */
@Slf4j
public class JsoupDemo {

	private static OutputStream os;

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.hljlr.gov.cn/xwdt/xwtt/201904/t20190402_274642.html").get();
			// 獲取單元素
			Elements titles = doc.getElementsByClass("logo");
			Elements a = titles.select("img");
			log.info(titles.size() + "獲取元素的長度");
			// 指定文件名及路径
			File file = new File("E:\\test.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			// 写入本地
			PrintWriter pw = new PrintWriter("E:\\test.txt", "UTF-8");
			for (Element element : a) {
				// pw.println(element.text());
				pw.println(element.attr("src"));
				pw.println(
						"------------------------------------------------------------------------------------------------------------------------------------");
			}
			pw.close(); // 关闭输出流
			Elements content = doc.select(".TRS_Editor SPAN");
			for (Element element : content) {
				System.out.println((element.text()));
			}
			// 获取页面上的图片保存到本地
			Elements imgs = doc.select(".logo img");
			for (Element element : imgs) {
				String img = element.attr("src");
				String url = "http://www.hljlr.gov.cn/xwdt/" + img;
				URL u = new URL("http://www.hljlr.gov.cn/images/logo.png");
				URLConnection uc = u.openConnection();
				System.out.println(uc.getContentLength());
				// 获取数据流
				InputStream is = uc.getInputStream();
				// 获取后缀名
				// String imageName = img.substring(img.lastIndexOf("/") + 1, img.length());
				// 写入本地
				os = new FileOutputStream(new File("E:\\img.png"));
				byte[] b = new byte[1024];
				int i = 0;
				while ((i = is.read(b)) != -1) {
					os.write(b, 0, i);
				}
				is.close();
				os.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}