package com.acmelojas.herokuapp.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {
	
	@GetMapping("/")
	public String index() {
		//chama o template index.html da pasta templates
		return "index";
	}
	
	@GetMapping("/#sobre")
	public String sobre() {
		//chama o template #sobre link interno
		return "sobre";
	}
	
	@GetMapping("/#nossaslojas")
	public String nossaslojas() {
		//chama o template #nossaslojas link interno
		return "nossaslojas";
	}
	
	@GetMapping("/#lancamentos")
	public String lancamentos() {
		//chama o template #lancamentos link interno
		return "lancamentos";
	}
	
	@GetMapping("/#contato")
	public String contato() {
		//chama o template #contato link interno
		return "contato";
	}
	
}
