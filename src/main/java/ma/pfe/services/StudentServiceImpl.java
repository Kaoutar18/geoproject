package ma.pfe.services;



import ma.pfe.Models.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositorises.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "service1")

public class StudentServiceImpl implements  StudentService {
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository repository;
    private  StudentMapper mapper;

    public StudentServiceImpl(@Qualifier("repo1") StudentRepository repository,@Qualifier("mapper1") StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }



    @Override
    public StudentEntity save(StudentDto dto) {
        LOG.debug("start debug save{}", dto);
        StudentEntity e=mapper.convertToEntity((dto));
      StudentEntity st=repository.save(e);
        return st;
    }

    @Override
    public long update(StudentDto dto)
    {
        LOG.debug("start debug update{}", dto);
        StudentDto re = mapper.convertToDto(repository.save(mapper.convertToEntity(dto)));
        return re.getId();

    }

    @Override
    public Boolean deleteById(Long id) {
        LOG.debug("start method delete id : {} ",id);
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<StudentDto> SelectAll() {
        LOG.debug("start debug SELECTALL{}");
        return mapper.studentEntiesToDtos(repository.findAll());


    }
}