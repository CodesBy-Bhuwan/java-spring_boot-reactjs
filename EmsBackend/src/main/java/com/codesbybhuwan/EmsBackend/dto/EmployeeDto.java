package com.codesbybhuwan.EmsBackend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//These means response
public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String emil;
    private String addr;
}
