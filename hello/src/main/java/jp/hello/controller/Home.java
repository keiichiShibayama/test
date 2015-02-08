package jp.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class Home {

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home(Model model) {

		System.out.println("test");

		return "";
	}

}
