package com.acmelojasherokuapp.site;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/buscar/{nome}")
	public String buscarNome(@ModelAttribute Cliente cli, Model model) {
		ClienteService cs = context.getBean(ClienteService.class);
		Map<String,Object> reg = cs.buscarCliNome(cli.getNome()).get(0);
		return "redirect:/perfil/" + reg.get("id");
	}
	
	@GetMapping("/buscar")
	public String buscarNome(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "buscaNome";
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
	
	//localhost:8080/perfil/2
	@GetMapping("/perfil/{id}")
	public String getPerfil(@PathVariable("id") int id, Model model) {
		ClienteService cs = context.getBean(ClienteService.class);
		Map<String,Object> mapa = cs.getCliente(id);
		model.addAttribute("nome",mapa.get("nome"));
		model.addAttribute("endereco",mapa.get("endereco"));
		model.addAttribute("telefone",mapa.get("telefone"));
		model.addAttribute("email",mapa.get("email"));
		model.addAttribute("id",id);
		return "perfil";
	}
	
	//listar
	@GetMapping("/clientes")
	public String listar(Model model) {
		ClienteService pdao = context.getBean(ClienteService.class);
		List<Map<String,Object>> clientes = pdao.getClientes();
		model.addAttribute("clientes", clientes);
		return "formlista";
	}
	
	//apagar
	@PostMapping("/apagar/cliente/{id}")
	public String apagarCliente(@PathVariable("id") int id) {
		ClienteService cdao = context.getBean(ClienteService.class);
		cdao.deleteCliente(id);
		return "redirect:/clientes";
	}
	
	//atualizar
	@GetMapping("/upd/{id}")
	public String formAtualizar(@PathVariable("id") int id, Model model) {
		ClienteService cdao = context.getBean(ClienteService.class);
		Map<String,Object> regs = cdao.getCliente(id);
		Cliente cli = new Cliente(id,regs.get("nome").toString(), regs.get("endereco").toString(), regs.get("telefone").toString(), regs.get("email").toString());
		model.addAttribute("cliente", cli);
		model.addAttribute("id",id);
		return "formupdcliente";
	}
	
	@PostMapping("/upd/{id}")
	public String atualizarCliente(@PathVariable("id") int id, Model model, @ModelAttribute Cliente cli){
		ClienteService cdao = context.getBean(ClienteService.class);
		cdao.atualizarCliente(id, cli);
		return "redirect:/clientes";
	}
	
}