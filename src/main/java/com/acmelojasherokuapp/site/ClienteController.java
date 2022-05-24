package com.acmelojasherokuapp.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.acmelojasherokuapp.model.Cliente;
import com.acmelojasherokuapp.model.ClienteService;

@Controller
@ComponentScan("com.acmelojasherokuapp.model")
public class ClienteController {
	
	@Autowired
	private ApplicationContext context;
	
	public String index() {
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
	
	@GetMapping("/cliente")
	public String formcli(Model model) {
		model.addAttribute("cli", new Cliente(0, "", "", "", ""));
		return "formcli";
	}
	
	@PostMapping("/cliente")
	public String inserircli(@ModelAttribute Cliente cli){
		ClienteService cs = context.getBean(ClienteService.class);
		cs.inserirCliente(cli);
		return "sucesso";
	}

}