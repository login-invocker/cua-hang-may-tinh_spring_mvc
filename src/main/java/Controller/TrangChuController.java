package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.cj.xdevapi.SessionFactory;

@Controller
@RequestMapping("/")
public class TrangChuController {
	@Autowired
	org.hibernate.SessionFactory  sesion;
		@GetMapping
		@Transactional
		@ResponseBody
		public String trangChu() {
			Session ss= sesion.getCurrentSession();
			String sql= "from nhanvien";
		
			return "index";
		}
}