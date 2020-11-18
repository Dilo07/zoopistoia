package zoopistoia_API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zoopistoia_API.Model.Accesso;
import zoopistoia_API.Service.AccessiService;

@RestController
@RequestMapping("/Accessi")
public class AccessiController {
	
	 //public AccessiService c1 = new AccessiService();
	@Autowired
	AccessiService accessiService;
	
	@RequestMapping("/getAll")
	public List<Accesso> getAccessi() {
		return this.accessiService.getAllAccessi();
	}
	
	@RequestMapping("/Ingresso")
	public boolean Ingresso(@RequestBody Accesso accesso) {
		return this.accessiService.Ingresso(accesso);
	}
	
	@RequestMapping("/Uscita")
	public boolean Uscita(@RequestBody Accesso accesso) {
		return this.accessiService.Uscita(accesso);
	}

}
