package se.selimkose.personregistrybasicauth.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @NotBlank(message = "Username cannot be blank")
    @NonNull
    @Column(unique = true)
    String username;
    @NotBlank(message = "Password cannot be bland")
    @NonNull
    String password;
}
