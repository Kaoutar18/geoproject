package ma.pfe.services;


import ma.pfe.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    Long save(StudentDto dto);
    Boolean update(StudentDto dto);
    Boolean deleteById(Long id);
    List <StudentDto>SelectAll();

}
