/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.julca_1.Controller;

import com.example.julca_1.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {

    // Ruta GET para mostrar el formulario
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "formulario_empleado";
    }

    // Ruta POST para procesar el formulario y mostrar el resultado
    @PostMapping("/resultado")
    public String procesarFormulario(Empleado empleado, Model model) {
        double sueldoTotal = empleado.calcularSueldoTotal();
        model.addAttribute("empleado", empleado);
        model.addAttribute("sueldoTotal", sueldoTotal);
        return "resultado_empleado";
    }
}
