package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

	@Autowired
	ProRepo pr;
	
	@RequestMapping("/all")
	public String allProduct(Model m) {
		List<Product> pd = pr.findAll();
		m.addAttribute("pd", pd);
		return "allProduct";
	}
	
	@RequestMapping("/saveform")
	public String ProSaveFrom(@ModelAttribute Product pro, Model m) {
	m.addAttribute("pr", pro);
	return "sform";
	}
	
	
	@PostMapping("/save")
	public String savePro(@ModelAttribute Product pro, Model m) {
		pr.save(pro);
		List<Product> pd = pr.findAll();
		m.addAttribute("pd", pd);
		return "allProduct";
	}
	
	@RequestMapping("/deleteteform")
	public String ProUpdateFrom(@RequestParam int productId, Model m) {
	Product pro = pr.findById(productId).get();
	pr.delete(pro);
	m.addAttribute("pr", pro);
	return "allProduct";
	}
	
	
}
