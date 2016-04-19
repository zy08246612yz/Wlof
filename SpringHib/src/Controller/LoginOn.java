package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Service.DeptService;

@Controller("loginOn")
public class LoginOn {

	@Resource(name="deptService")
	private DeptService service;
	
	@RequestMapping("/Login.do")
	public String LoginIn(){
		return "login";
	}
	
	@RequestMapping("/Check.do")
	@ResponseBody
	public void check(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		
		//����ΪString returnʱ�����������ʱ���������ġ�
		//������˵û�з���ֵʱ������ʱ����� ���ñ������֡�
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw=resp.getWriter();
		if(service.check(name, pass)){
			System.out.println("true"+name+":"+pass);
			pw.write("��¼�ɹ�!");
		}else{
			System.out.println("false"+name+":"+pass);
			pw.write("��¼ʧ��!");
		}
		pw.close();
	}
	
}
