package com.knowyourneighborhood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.knowyourneighborhood.model.Store;
import com.knowyourneighborhood.service.StoreService;

@ComponentScan("com.knowyourneighborhood.service")
@Controller
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	@GetMapping("/")
	public String welcome() {
	    return "index";
	}
	@GetMapping("/registerStore")
	public String getRegisterStore(Model model) {
		// For later form Posting Purpose
		model.addAttribute("store", new Store());
		return "store-register";
	}
	
	@PostMapping("/registerStore")
	public String createStore(Model model, Store store) {
		 // Store record to DB through service class.
		Store storeRecord = storeService.saveStoreRecord(store);
		
		// Display all store records
		List<Store> storeRecords = storeService.getAllStores();
		// Model representation used to display record
		model.addAttribute("storeRecords", storeRecords);
		
		return "view-store";
	}
}
