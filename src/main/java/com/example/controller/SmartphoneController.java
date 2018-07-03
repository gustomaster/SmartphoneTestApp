package com.example.controller;

import java.util.List;

import com.example.domain.Smartphone;
import com.example.form.SmartphoneForm;
import com.example.service.SmartphoneService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;




@Controller
@RequestMapping(value= {"/smartphone","/"})
public class SmartphoneController {

	@Autowired
	SmartphoneService smartphoneService;
	
    @ModelAttribute
    SmartphoneForm smartphoneForm() {
    	return new SmartphoneForm();
    }
	
	@GetMapping
	String list(Model model) {
		List<Smartphone> smartphone = smartphoneService.findAll();
		model.addAttribute("smartphone", smartphone);
		return "smartphone/list";
	}
	
    @GetMapping("new")
    public String newPlayer(Model model) {
        return "smartphone/new";
    }
	
	@PostMapping(path = "create")
	String create(@Validated SmartphoneForm form, BindingResult result, Model model) {
		Smartphone smartphone = new Smartphone();
		BeanUtils.copyProperties(form, smartphone);
		smartphoneService.create(smartphone);
		return "redirect:/smartphone";
	}

    @GetMapping({ "/edit", "/edit/{id}" })
    public String edit(@PathVariable Integer id, Model model) {
        Smartphone smartphone = smartphoneService.findOne(id);
        model.addAttribute("smartphone",smartphone);
        return "smartphone/edit";
    }

    @PostMapping
	public String create(@ModelAttribute Smartphone smartphone) {
		smartphoneService.save(smartphone);
		return "redirect:/smartphone";
    }
	    
    @PostMapping(path = "delete")
    String delete(@RequestParam Integer id) {
        smartphoneService.delete(id);
        return "redirect:/smartphone";
    }	
	
    @GetMapping({ "/show", "/show/{id}" })
    public String show(@PathVariable Integer id, Model model) {
        Smartphone smartphone = smartphoneService.findOne(id);
        model.addAttribute("smartphone", smartphone);
        return "smartphone/show";
    }

	@PostMapping("{id}")
	public String update(@PathVariable Integer id, SmartphoneForm form) {
		Smartphone smartphone = new Smartphone();
		BeanUtils.copyProperties(form, smartphone);	
		smartphone.setId(id);
		smartphoneService.save(smartphone);
		return "redirect:/smartphone";
	}
		
    @GetMapping("delete/{id}")
    public String destroy(@PathVariable Integer id) {
        smartphoneService.delete(id);
        return "redirect:/smartphone";
    }
}