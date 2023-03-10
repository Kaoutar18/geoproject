package ma.pfe.dtos;

import org.springframework.context.annotation.Primary;

public class StudentDto {
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private  Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;
}
