package emlakburada.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakburada.dto.request.UserRequest;
import emlakburada.dto.response.UserResponse;
import emlakburada.model.User;
import emlakburada.repository.UserRepository;

@Service
public class UserService extends UserBaseService {

	@Autowired
	private UserRepository userRepository;

	public List<UserResponse> getAllUser() {
		List<User> users = userRepository.findAll();
		return users.stream().map(user -> convertToUserResponse(user)).collect(Collectors.toList());
	}

	public UserResponse saveUser(UserRequest userRequest) {
		return convertToUserResponse(userRepository.save(convertToUserEntity(userRequest)));
	}

}