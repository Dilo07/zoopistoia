package zoopistoia_API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import zoopistoia_API.Model.Permesso;
import zoopistoia_API.Service.PermessiService;

@RestController
@RequestMapping("/Permessi")
public class PermessiController {
	
	@Autowired
	public PermessiService permessiService;
	
	@RequestMapping(method=RequestMethod.GET,value="/getAll")
	public List<Permesso> getPermessi() {
		return this.permessiService.getAllPermessi();
	}

	@RequestMapping(method=RequestMethod.POST,value="/newPermesso")
	public boolean newPermesso(@RequestBody Permesso permesso) {
		return this.permessiService.newPermesso(permesso);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deletePermesso/{id}")
	public void deletePermesso(@PathVariable Integer id) {
		this.permessiService.deletePermesso(id);
	}
}
