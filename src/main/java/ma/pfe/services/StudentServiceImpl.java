package ma.pfe.services;


import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositorises.StudentRepository;
import ma.pfe.repositorises.StudentRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "service1")
@Profile("prod")
public class StudentServiceImpl implements  StudentService {
private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository repository;
    private  StudentMapper mapper;

    public StudentServiceImpl(@Qualifier("repo1") StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }



    @Override
    public Long save(StudentDto dto) {
LOG.debug("start debug save{}", dto);
        StudentEntity e=mapper.convertToEntity(dto);
        return  repository.save(e);
    }

    @Override
    public Boolean update(StudentDto dto)
    {
        LOG.debug("start debug update{}", dto);
        StudentEntity e=mapper.convertToEntity(dto);
    return repository.update(e);

    }

    @Override
    public Boolean deleteById(Long id) {
        LOG.debug("start debug dalete{}",id);
        return repository.delete(id);
    }

    @Override
    public List<StudentDto> SelectAll() {
        LOG.debug("start debug SELECTALL{}");
        List<StudentEntity>l=repository.SelectAll();
        List<StudentDto>ld=mapper.convertToDto(l);
        return ld;

    }
}
