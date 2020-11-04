package com.example.demo.Dipendenti;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dipendenti.Dipendente;

@RestController
public class DipendentiController {
	
	@Autowired
	private DipendentiService dipendentiservice;

	@RequestMapping("/Dipendente")
	@ResponseBody
	public List<Dipendente> newdipendenti() {
		return dipendentiservice.getalldipendenti();
	}
	
}
