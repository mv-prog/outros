package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.User;
import repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	public User getUserByEmail(String email) {
		return userRepository.findById(email).orElse(null);
	}
	public List<User> getUsersByCountry(String country) {
		return userRepository.findByCountry(country);
	}
	
	public String deleteUser(String email) {
		userRepository.deleteById(email);
		return "usuario elimando: " + email;
	}
	public User updateUser (User user){
		User existingUser= userRepository.findById(user.getEmail()).orElse(null);
		existingUser.setName(user.getName());
		existingUser.setLastname(user.getLastname());
		existingUser.setCountry(user.getCountry());
		existingUser.setPassword(user.getPassword());
		return userRepository.save(existingUser);
	}
}
