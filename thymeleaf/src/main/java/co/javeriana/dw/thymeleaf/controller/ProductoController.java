package co.javeriana.dw.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

import co.javeriana.dw.thymeleaf.model.Producto;

@Controller
public class ProductoController {

    @GetMapping("/productos")
    public String listar(Model model) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Computador", 2500000, "Tecnologia"));
        productos.add(new Producto("Teclado", 75.00, "Tecnologia"));
        productos.add(new Producto("Monitor", 350.00, "Pantallas"));
        productos.add(new Producto("Auriculares", 80.00, "Audio"));
        productos.add(new Producto("Webcam", 60.00, "Video"));

        model.addAttribute("productos", productos);

        return "productos";
    }
}