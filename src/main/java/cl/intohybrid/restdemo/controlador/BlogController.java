package cl.intohybrid.restdemo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.intohybrid.restdemo.modelo.Blog;
import cl.intohybrid.restdemo.servicio.BlogService;

@RestController
public class BlogController {

	//RestDemo
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping(value="/blog", method=RequestMethod.GET)
	public ResponseEntity<List<Blog>> consulta(){
		return new ResponseEntity<List<Blog>>(blogService.consulta(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/blog/{id}", method = RequestMethod.GET)
	public ResponseEntity<Blog> getToDoById(@PathVariable("id") long id) {
		return new ResponseEntity<Blog>(blogService.consultaPorId(id), HttpStatus.OK);
	}
    
    @RequestMapping(value = "/blog", method = RequestMethod.POST)
   	public ResponseEntity<Blog> saveToDo(@RequestBody Blog blog) {
		return new ResponseEntity<Blog>(blogService.registro(blog), HttpStatus.OK);
   	}
    
    @RequestMapping(value = "/blog", method = RequestMethod.PUT)
   	public ResponseEntity<Blog>  updateToDo(@RequestBody Blog blog) {
		return new ResponseEntity<Blog>(blogService.registro(blog), HttpStatus.OK);
   	}
    
    @RequestMapping(value = "/blog/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> removeToDoById(@PathVariable("id") long id){
    	Blog blog = blogService.consultaPorId(id);
    	blogService.eliminar(blog);
		return new ResponseEntity<String>("Blog eliminado", HttpStatus.OK);
	}
}
