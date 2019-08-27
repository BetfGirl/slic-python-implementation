package spring;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.JstlView;

@Controller
@RequestMapping("Book")
@SessionAttributes("user")
public class sprtest1 {
	
	@RequestMapping("sss")
	public  @ResponseBody String aaa(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest req ){
		String oname=file.getOriginalFilename();
		String ex=oname.substring(oname.lastIndexOf("."),oname.length());
		String nname = UUID.randomUUID()+ex;
		
		String path=req.getSession().getServletContext().getRealPath("/");
		path=new File(path).getParentFile().getPath()+"/upload";
		System.out.println(path);
		try {
			file.transferTo(new File(path,nname));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "/upload/"+nname;
	}
	
	@RequestMapping("aaa")
	public void test() {
		System.out.println("akfjaofjoa");
	}
	
	@GetMapping("sss")
	public void testa(Model s) {
		s.addAttribute("user", "asdasd");
	}
	
	@RequestMapping("aaaa")
	public ModelAndView  sad() {
		ModelAndView view=new ModelAndView();
		view.addObject("name","nfonfa");
		view.setViewName("Book/index");
		view.setView(new JstlView("url"));
		return view;
	}
		
	
	
	

}
