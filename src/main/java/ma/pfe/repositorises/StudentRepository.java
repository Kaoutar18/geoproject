package ma.pfe.repositorises;

import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {

    Long save(StudentEntity e);
    Boolean  update(StudentEntity e);
    boolean  delete(Long id);
    List<StudentEntity> SelectAll();

}
