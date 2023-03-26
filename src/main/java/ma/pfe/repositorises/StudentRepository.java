package ma.pfe.repositorises;

import ma.pfe.entities.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("repo1")
public interface StudentRepository extends PagingAndSortingRepository {


}
