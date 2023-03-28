package ma.pfe.entities;

import javax.persistence.*;

// @Embeddable @EmbeddedId
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "T_students")
//@DiscriminatorColumn(name = "C_TAYPE_Student")
//@DiscriminatorValue("s")

public class StudentEntity {

   // @EmbeddedId
  //  private StudentId studentId;
    @Id
    @Column(name = "id_student")
   private  long id;
    @Column(name = "name_student")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="rue",column = @Column(name = "rue_student")),
            @AttributeOverride(name="avenue",column = @Column(name = "avenue_student"))
    })
    private Adresse adresse;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}