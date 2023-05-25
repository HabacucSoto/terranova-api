package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Property;

@RestController
@RequestMapping("/properties")
public class PropertiesREST {
	Property properties[] = new Property[15];
	Property property1 = new Property(1,"https://images.pexels.com/photos/106399/pexels-photo-106399.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "123 Calle del Roble, Ciudad Ficticia", "Casa de estilo victoriano con tejado a dos aguas y detalles ornamentales en su fachada", "$500,000");
	Property property2 = new Property(2,"https://images.pexels.com/photos/323780/pexels-photo-323780.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "456 Avenida del Mar, Playavista", "Casa contemporánea de líneas rectas y grandes ventanales que permiten la entrada de luz natural", "$850,000");
	Property property3 = new Property(3,"https://images.pexels.com/photos/1115804/pexels-photo-1115804.jpeg?auto=compress&cs=tinysrgb&w=600", "789 Calle de la Cascada, Pueblo Encantado", "Casa rústica de piedra y madera, con un acogedor porche y chimenea de piedra en el salón.", "$350,000");
	Property property4 = new Property(4,"https://images.pexels.com/photos/1396132/pexels-photo-1396132.jpeg?auto=compress&cs=tinysrgb&w=600", "321 Calle del Sol, Costa del Sueño", "Casa de playa de diseño minimalista, con amplias terrazas y vistas panorámicas al océano.", "$1,200,000");
	Property property5 = new Property(5,"https://images.pexels.com/photos/259588/pexels-photo-259588.jpeg?auto=compress&cs=tinysrgb&w=600", "654 Calle de los Coloniales, Ciudad Antigua", "Casa colonial de dos pisos, con balcones de hierro forjado y jardines frondosos.", "Casa 5: $600,000");
	Property property6 = new Property(6,"https://images.pexels.com/photos/209296/pexels-photo-209296.jpeg?auto=compress&cs=tinysrgb&w=600","987 Camino del Prado, Valle Verde","Casa de campo con techo de paja y paredes de adobe, rodeada de extensos campos verdes.","$400,000");
	Property property7 = new Property(7,"https://images.pexels.com/photos/1029599/pexels-photo-1029599.jpeg?auto=compress&cs=tinysrgb&w=600","654 Avenida Moderna, Metrópolis Futurista","Casa moderna de estructura metálica y vidrio, con un jardín vertical en la fachada.","$1,800,000");
	Property property8 = new Property(8,"https://images.pexels.com/photos/221540/pexels-photo-221540.jpeg?auto=compress&cs=tinysrgb&w=600","321 Calle Georgiana, Distrito Histórico","321 Calle Georgiana, Ciudad Histórica, Casa adosada de estilo georgiano con fachada de ladrillo y jardín trasero.","$750,000");
	Property property9 = new Property(9,"https://images.pexels.com/photos/210617/pexels-photo-210617.jpeg?auto=compress&cs=tinysrgb&w=600","789 Calle de la Montaña, Cumbre Serena","Casa de montaña construida con piedra natural, con amplias terrazas y vistas a los picos nevados.","$900,000");
	Property property10 = new Property(10,"https://images.pexels.com/photos/15579024/pexels-photo-15579024/free-photo-of-mar-casas-casa-direccion.jpeg?auto=compress&cs=tinysrgb&w=600","123 Avenida Mediterránea, Marbella Soleada","Casa mediterránea de color blanco, con techos rojos de tejas y un patio interior con fuente.","$1,500,000");
	Property property11 = new Property(11,"https://images.pexels.com/photos/15526518/pexels-photo-15526518/free-photo-of-ciudad-casas-calle-edificios.jpeg?auto=compress&cs=tinysrgb&w=600","456 Calle Futurista, Ciudad Metropolitana","Casa contemporánea de diseño futurista, con formas geométricas y uso de materiales vanguardistas.","$550,000");
	Property property12 = new Property(12,"https://images.pexels.com/photos/3571200/pexels-photo-3571200.png?auto=compress&cs=tinysrgb&w=600","987 Camino Tradicional, Pueblo Sereno, Casa de campo tradicional con fachada de piedra y jardín de flores.","Casa de campo tradicional con techos de paja, paredes de piedra y un hermoso jardín de flores.","$650,000");
	Property property13 = new Property(13,"https://images.pexels.com/photos/7473282/pexels-photo-7473282.jpeg?auto=compress&cs=tinysrgb&w=600","654 Calle Tudor, Villa Encantada","Casa de estilo Tudor con vigas de madera a la vista, ventanas pequeñas y un encantador jardín de rosas.","$1,100,000");
	Property property14 = new Property(14,"https://images.pexels.com/photos/4497373/pexels-photo-4497373.jpeg?auto=compress&cs=tinysrgb&w=600","321 Avenida del Concreto, Ciudad Moderna","Casa de arquitectura brutalista, con formas angulares y una fachada de concreto.","$950,000");
	Property property15 = new Property(15,"https://images.pexels.com/photos/14356690/pexels-photo-14356690.jpeg?auto=compress&cs=tinysrgb&w=600","789 Calle Neoclásica, Atenas Eterna","Casa de estilo neoclásico con columnas corintias, frontón triangular y jardines simétricos","$1,250,000");
	
	@GetMapping
	public ResponseEntity<Property[]> getProperty(){
		properties[0] = property1;
		properties[1] = property2;
		properties[2] = property3;
		properties[3] = property4;
		properties[4] = property5;
		properties[5] = property6;
		properties[6] = property7;
		properties[7] = property8;
		properties[8] = property9;
		properties[9] = property10;
		properties[10] = property11;
		properties[11] = property12;
		properties[12] = property13;
		properties[13] = property14;
		properties[14] = property15;
		return ResponseEntity.ok(properties);
	}
	
	
	
}
