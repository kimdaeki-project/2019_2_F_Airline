package com.airline.a1.admin;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/**")
public class adminController {
	
	/*
	 * @GetMapping public void main() throws Exception{
	 * 
	 * }
	 */
	
	@GetMapping("/adminmain")
	public void adminmain() throws Exception{
		
	}
	
	@GetMapping("/admin1_1")
	public void admin1_1() throws Exception{
		
	}
	
	@GetMapping("/admin1_2")
	public void admin1_2() throws Exception{
		
	}
	
	@GetMapping("/admin1_3")
	public void admin1_3() throws Exception{
		
	}
	
	@GetMapping("/admin2_1")
	public void admin2_1() throws Exception{
		
	}
	
	@GetMapping("/admin2_2")
	public void admin2_2() throws Exception{
		
	}
	
	@GetMapping("/admin3_1")
	public void admin3_1() throws Exception{
		
	}
	
	@GetMapping("/admin4_1")
	public void admin4_1() throws Exception{
		
	}
	
	@GetMapping("/admin5_1")
	public void admin5_1() throws Exception{
		
	}
	
	@GetMapping("/admin5_2")
	public void admin5_2() throws Exception{
		
	}

	@GetMapping("/admin6_1")
	public void admin6_1() throws Exception{
		
	}
	
	@GetMapping("/admin6_2")
	public void admin6_2() throws Exception{
		
	}
	
	@GetMapping("/admin7_1")
	public void admin7_1() throws Exception{
		
	}

}

