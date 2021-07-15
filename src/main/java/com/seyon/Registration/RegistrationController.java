package com.seyon.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "seyon/api/registration")
public class RegistrationController {

	private final RegistrationService registrationService;
	
	@Autowired	
	public RegistrationController(RegistrationService registrationService) {		
		this.registrationService = registrationService;
	}

	@GetMapping("/users")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_PATIENT')")
	public List<User> getUsers() {
		return registrationService.getUsers();
	}

	//seyon/user?id=101
	@GetMapping("/user/{id}")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_PATIENT')")
	public Patient getUser(@RequestParam String id, @PathVariable("user") String user) {
		return registrationService.getUser(id);
	}
	
	@PostMapping("/user/save")
	@PreAuthorize("hasAuthority('patient:write')")
	public void addUser(@RequestBody User user) {
		registrationService.addUser(user);
	}

	@PutMapping("/user/update/{id}")
	@PreAuthorize("hasAuthority('patient:write')")
	public void updateUser(@RequestParam String id, @RequestBody User user) {
		registrationService.updateUser(user);
	}

	@DeleteMapping("/user/delete/{id}")
	@PreAuthorize("hasAuthority('patient:write')")
	public void deleteUser(@RequestParam String id ) {
		registrationService.deleteUser(id);
	}
	

}
