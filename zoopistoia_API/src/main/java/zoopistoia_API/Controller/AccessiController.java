package zoopistoia_API.Controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import zoopistoia_API.Model.Accesso;
import zoopistoia_API.Service.AccessiService;

@RestController
@RequestMapping("/Accessi")
public class AccessiController {
	
	//public AccessiService c1 = new AccessiService();
	@Autowired
	AccessiService accessiService;
	
	@RequestMapping(method=RequestMethod.GET,value="/getAll")
	public List<Accesso> getAccessi() {
		return this.accessiService.getAllAccessi();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Ingresso")
	public boolean Ingresso(@RequestBody Accesso accesso) {
		return this.accessiService.Ingresso(accesso);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Uscita")
	public boolean Uscita(@RequestBody Accesso accesso) {
		return this.accessiService.Uscita(accesso);
	}
	
	@RequestMapping("/DipinRec/{id}/{datein}/{dateout}") ///{datein}/{dateout}")
	public Accesso getDipinRec(@PathVariable Integer id,@PathVariable Timestamp datein,@PathVariable Timestamp dateout) {

		return this.accessiService.getDipinRec(id,datein,dateout);
			
	}

}
