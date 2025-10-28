package dev.naimsulejmani.webformularet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private int age = 18;
    private String email;
    private String password;
}
