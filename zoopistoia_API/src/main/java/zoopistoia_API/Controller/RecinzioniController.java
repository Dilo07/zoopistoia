package zoopistoia_API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import zoopistoia_API.Model.Recinzione;
import zoopistoia_API.Service.RecinzioniService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/Recinzioni")
public class RecinzioniController {
	
	@Autowired
	private RecinzioniService recinzioniservice;

	@RequestMapping("/getAll")
	public List<Recinzione> getRecinzioni() {
		return this.recinzioniservice.getAllRecinzioni();
	}
	
	@RequestMapping("/getRecinzione/{id}")
	public Recinzione getRecinzione(@PathVariable Integer id) {
		return this.recinzioniservice.getRecinzione(id);
	}
	
//	@RequestMapping("/getPermessiDipendentiInRecinzione/{id}")
//	public List<Recinzione> getPermessiDipendentiInRecinzione(@PathVariable Integer id) {
//		return this.recinzioniservice.getPermessiDipendentiInRecinzione(id);
//	}
	
	@RequestMapping(method=RequestMethod.POST, value="/newRecinzione")
	public boolean addRecinzione(@RequestBody Recinzione recinzione) {
		return this.recinzioniservice.addUpdateRecinzione(recinzione);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateRecinzione")
	public boolean UpdateRecinzione(@RequestBody Recinzione recinzione) {
		return this.recinzioniservice.addUpdateRecinzione(recinzione);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteRecinzione/{id}")
	public boolean deleteRecinzione(@PathVariable Integer id) {
		return this.recinzioniservice.deleteRecinzione(id);
	}
}
