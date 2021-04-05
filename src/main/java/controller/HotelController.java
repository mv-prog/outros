package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Hotel;
import service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired
	HotelService hotelService;
	
	@GetMapping("")
	List<Hotel> getHoteles(){
		return hotelService.getHoteles();
	}
	
//	@RequestMapping("/")
//	@ResponseBody
//	String helloWorld() {
//		return "HelloWorld";
//	}

	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	public ResponseEntity<String> crear(@RequestBody Hotel hotel) {
		// Podriamos guardar este usuario en base de datos
		System.out.println(hotel.toString());
		return new ResponseEntity<String>("Hotel creado", HttpStatus.CREATED);
	}
	
	@GetMapping(value="/listar")
	public ResponseEntity<String> listar() {
//		System.out.println(hotel.toString());
		return new ResponseEntity<String>("Hotel listado", HttpStatus.ACCEPTED);
	}
	
//	@RequestMapping(value = "/editar", method = RequestMethod.PUT)
//	public ResponseEntity<String> editar(@RequestParam(value = "id") long id, @RequestBody Usuario usuario) {
//		// Buscariamos al usuario en base de datos por su ID y guardariamos el que nos indicarian
//		System.out.println(usuario.toString());
//		return new ResponseEntity<String>("Usuario editado", HttpStatus.OK);
//}

}