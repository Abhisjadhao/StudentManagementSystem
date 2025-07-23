package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Student {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message ="Name is required" )
    private String name;

    @Min(value = 1,message = "Age must be at least 1")
    private int age;

    public @NotBlank(message = "Name is required") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is required") String name) {
        this.name = name;
    }

    public @Min(value = 1, message = "Age must be at least 1") int getAge() {
        return age;
    }

    public void setAge(@Min(value = 1, message = "Age must be at least 1") int age) {
        this.age = age;
    }
}
