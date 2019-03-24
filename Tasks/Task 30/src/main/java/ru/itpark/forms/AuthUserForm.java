package ru.itpark.forms;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthUserForm {
    private String login;
    private String password;
}
