package cl.intohybrid.restdemo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.intohybrid.restdemo.modelo.Blog;
import cl.intohybrid.restdemo.repository.BlogRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;
	
	public List<Blog> consulta(){
		return blogRepository.findAll();
	}
	
	public Blog consultaPorId(long id) {
		return blogRepository.findOne(id);
	}
	
	public Blog registro(Blog blog){
		return blogRepository.save(blog);
	}
	
	public void eliminar(Blog blog){
		blogRepository.delete(blog);
	}
	
}
