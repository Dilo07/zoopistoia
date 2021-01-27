package zoopistoia_API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import zoopistoia_API.Model.Animale;
import zoopistoia_API.Service.AnimaliService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/Animali")
public class AnimaliController {
	
	@Autowired
	private AnimaliService animaliservice;
	
	@RequestMapping("/getAll")
	public List<Animale> getAnimali() {
		return this.animaliservice.getAllAnimali();
	}
	
	@RequestMapping("/getAnimaliInRecinzione/{id}")
	public List<Animale> getAnimaliInRecizione(@PathVariable Integer id) {
		return this.animaliservice.getAnimaliInRecizione(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/newAnimale")
	public boolean addAnimale(@RequestBody Animale animale){
		return this.animaliservice.addAnimale(animale);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateAnimale")
	public boolean updateAnimale(@RequestBody Animale animale){
		return this.animaliservice.UpdateAnimale(animale);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteAnimale/{id}")
	public boolean deleteAnimale(@PathVariable Integer id){
		return this.animaliservice.deleteAnimale(id);
	}
}
