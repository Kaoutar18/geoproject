package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentService;
import ma.pfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentControllers {
    public StudentControllers(@Qualifier("service1") StudentService service) {
        Service = service;
    }
    public StudentControllers(){}
    private final static Logger LOGGER= LoggerFactory.getLogger(StudentControllers.class);


    private StudentService Service;
  @PostMapping
  public Long save(@RequestBody StudentDto dto){
      LOGGER.debug("start save method {} ",dto);

      return (Long) Service.save(dto);
  }
@PutMapping
  public Boolean update(@RequestBody StudentDto dto)
  {
      LOGGER.debug("start update method {} ",dto);

      return Service.update(dto);
  }
@DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("ids") Long id)
{LOGGER.debug("start delete method ");

    return Service.deleteById(id);
  }@GetMapping
    public List<StudentDto>SelectAll()
    {LOGGER.debug("start select All method ");

        return Service.SelectAll();
    }



}
