package ma.pfe.repositorises;

import ma.pfe.entities.StudentEntity;
import ma.pfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository(value = "repo1")
public class StudentRepositoryImpl implements  StudentRepository {
    private final static Logger LOG= LoggerFactory.getLogger(StudentRepositoryImpl.class);

    @Override
    public Long save(StudentEntity e) {
        LOG.debug("start save method ");
        return null;
    }

    @Override
    public Boolean update(StudentEntity e) {
        LOG.debug("start update method ");

        return null;
    }

    @Override
    public boolean delete(Long id) {
        LOG.debug("start delete  method ");

        return false;
    }

    @Override
    public List<StudentEntity> SelectAll() {
        LOG.debug("start salect All method ");

        return null;
    }
}