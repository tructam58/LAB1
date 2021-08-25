package ptithcm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
public class WelcomeController {

	@RequestMapping("welcome") 
	public String welcome() {
		
		return "welcome";
	}
}
