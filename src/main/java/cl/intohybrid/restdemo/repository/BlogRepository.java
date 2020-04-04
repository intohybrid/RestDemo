package cl.intohybrid.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.intohybrid.restdemo.modelo.Blog;

public interface BlogRepository extends JpaRepository<Blog, Long>{

}
