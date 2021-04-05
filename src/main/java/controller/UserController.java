package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.User;
import model.UserDao;
import service.UserService;
@RestController
public class UserController {
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/create")
	@ResponseBody //lo que se devuelva en el metodo será el cuerpo de la respuesta y será lo que se pueda visualizar-
	public String create(String name, String lastname, String email) {
		try {
		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setLastname(lastname);
		userDao.create(user);
		return "usuario creado correctamente";
		}catch (Exception e) {
			return "error en la creacion del usuario";
		}
	}
	@RequestMapping(value="/update")
	@ResponseBody //lo que se devuelva en el metodo será el cuerpo de la respuesta y será lo que se pueda visualizar-
	public String update(String name, String lastname, String email) {
		try {
		User user = userDao.getById(email);
		user.setEmail(email);
		user.setName(name);
		user.setLastname(lastname);
		userDao.update(user);
		return "usuario actualizad ocorrectamente";
		}catch (Exception e) {
			return "error en la actualización del usuario";
		}
	}
	@RequestMapping(value="/delete")
	@ResponseBody //lo que se devuelva en el metodo será el cuerpo de la respuesta y será lo que se pueda visualizar-
	public String update(String email) {
		try {
		User user = new User();
		user.setEmail(email);
		userDao.delete(user);
		return "usuario borrado ocorrectamente";
		}catch (Exception e) {
			return "error en el borrado del usuario";
		}
	}
	
//	@Autowired 
//	UserService userService;
//	@PostMapping("/addUsers")
//	public User addUser(@RequestBody User user) {
//		return userService.saveUser(user);
//	}
////	public List<User> addUsers(@RequestBody List<User> users) {
////		return userService.saveUsers(users);
////	}
//	@GetMapping("/users")
//	public List<User> findAllUsers(){
//		return userService.getAllUsers();
//	}
//	
//	@GetMapping("/user/{email}")
//	public User findUserByEmail(@PathVariable String email) {
//		return userService.getUserByEmail(email);
//	}
//	@GetMapping("/users/{country}")
//	public List<User> findUsersByCountry(@PathVariable String country) {
//		return userService.getUsersByCountry(country);
//	}
//	@DeleteMapping("delete/{email}")
//	public String deleteUser(@PathVariable String email) {
//		return userService.deleteUser(email);
//	}
}
