package sysc4806.project.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findById(long id);

    Project getById(long id);

    List<Project> findAll();

    List<Project> findByStatus(String stat);


}
