package ma.pfe.mappers;

import ma.pfe.Models.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component(value = "mapper1")

public class StudentMapper {
    public StudentEntity convertToEntity (StudentDto dto)
    {
        StudentEntity studentEntity = new StudentEntity();
        //studentEntity.setStudentId(new StudentId(dto.getId(),""));
        studentEntity.setName(dto.getName());
        studentEntity.setId((dto.getId()));
       return studentEntity;


    }
    public   StudentDto convertToDto (StudentEntity e)
    {
        StudentDto dto = new StudentDto();
        dto.setId(e.getId());
      dto.setName(e.getName());
       return dto;

    }

    public List<StudentDto> studentEntiesToDtos (List<StudentEntity>entities)
    {
        if(entities!=null&&!entities.isEmpty()){
            return entities.stream().map(studentEntity -> convertToDto(studentEntity)).collect(Collectors.toList());
        }else {
            return new ArrayList<>();
        }
    }
}