package ma.pfe.controllers;

import ma.pfe.Models.StudentDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentControllers {
    private StudentService studentService;
    public StudentControllers(@Qualifier("service1") StudentService service) {
        this.studentService = service;
    }

    public StudentControllers() {
    }

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentControllers.class);




    @PostMapping
    public Long save(@RequestBody StudentDto dto) {
        LOGGER.debug("start save method {} ", dto);
        return studentService.save(dto);
    }

    @PutMapping
    public long update(@RequestBody StudentDto dto) {
        LOGGER.debug("start update method {} ", dto);

        return studentService.update(dto);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Long id) {
        LOGGER.debug("start delete method ");

        return studentService.deleteById(id);
    }

    @GetMapping
    public List<StudentDto> SelectAll() {
        LOGGER.debug("start select All method ");

        return studentService.SelectAll();
    }


}
