package OraConnect;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ReadXML {
	/**
	 * 用来读取配置文件中数据库的信息
	 */
	
   public static Map<String,String> Config=null;
   
   public static void Reader(String path){
	   String p="config.xml";
	   SAXReader reader=new SAXReader();
	   Document doc=null;
	   try {
		doc=reader.read(new File(p));
		Element root=doc.getRootElement();
		List<Element> elements=root.elements();
		Config=new HashMap<String,String>();
		for(Element e:elements){
			Config.put(e.getName(), e.getText());
		}
		
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
