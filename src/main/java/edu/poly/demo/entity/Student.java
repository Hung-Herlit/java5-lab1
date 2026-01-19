package edu.poly.demo.entity;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {
    @NotBlank(message = "ID không được để trống!")
    @Size(min = 3, max = 10, message = "ID từ 3 đến 10 ký tự!")
    private String id;

    @NotEmpty(message = "Name không được để trống!")
    @Length(min = 3, max = 50, message = "Name từ 3 đến 50 ký tự!")
    private String name;

    @NotEmpty(message = "Email không được để trống!")
    @Email(message = "Email không đúng định dạng!")
    private String email;

    @NotEmpty(message = "Phone không được để trống!")
    @Pattern(regexp = "^(\\+84|0)\\d{9,10}$", message = "Phone không đúng định dạng!")
    private String phone;

    private boolean gender;

    @NotNull(message = "Sinh nhật không được để trống!")
    @Past(message = "Sinh nhật phải là ngày trong quá khứ!")
    private LocalDate dob;
}
