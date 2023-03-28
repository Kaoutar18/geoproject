package ma.pfe.services;


import ma.pfe.Models.StudentDto;
import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity save(StudentDto dto);
    long update(StudentDto dto);
    Boolean deleteById(Long id);
    List <StudentDto>SelectAll();

}
