package com.example.demo.Controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dipendenti.Dipendente;

@RestController
public class DipendentiController {

	@RequestMapping("/Dipendente")
	@ResponseBody
	public List<Dipendente> getdipendenti() {
		return Arrays.asList(new Dipendente("Andrea","Di Lorenzo"),new Dipendente("Marco","Di Lorenzo"),
				new Dipendente("Cristina","Di Lorenzo"));
	}
}
