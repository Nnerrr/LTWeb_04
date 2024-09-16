package vn.hang.services;

import vn.hang.services.String;
import vn.hang.services.UserModel;

public interface IUserService {
	 UserModel login(String username, String password);
	 UserModel findByUsername(String username);
}
