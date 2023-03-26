package ma.pfe.services;


import ma.pfe.Models.StudentDto;

import java.util.List;

public interface StudentService {
    Long save(StudentDto dto);
    long update(StudentDto dto);
    Boolean deleteById(Long id);
    List <StudentDto>SelectAll();

}
