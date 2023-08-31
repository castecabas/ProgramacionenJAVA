package com.Empresa.Empleados.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Tipo_contrato;
    private Integer Horas;
    private Integer Salario;
    private Integer Bonificaciones;
    

}
