package com.pwa.localshop.config;

import com.pwa.localshop.model.Producto;
import com.pwa.localshop.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** Carga datos de ejemplo al iniciar la aplicación si la tabla está vacía. */
@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner cargarProductos(ProductoRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                repo.save(new Producto(null, "Café de olla", "Café artesanal con piloncillo y canela", 85.50, null));
                repo.save(new Producto(null, "Pan dulce (docena)", "Surtido de pan recién horneado", 120.00, null));
                repo.save(new Producto(null, "Miel de abeja", "Frasco de 500 g, producto local", 150.00, null));
                repo.save(new Producto(null, "Queso Chihuahua", "Queso menonita de 1 kg", 210.00, null));
                repo.save(new Producto(null, "Tortillas de harina", "Paquete de 12 piezas", 45.00, null));
                repo.save(new Producto(null, "Salsa roja casera", "Botella de 350 ml", 60.00, null));
            }
        };
    }
}
