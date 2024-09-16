package vn.hang.services.impl;

import vn.hang.dao.IUserDao;
import vn.hang.dao.impl.UserDaoImpl;
import vn.hang.models.UserModel;
import vn.hang.services.IUserService;

public class UserServiceImpl implements IUserService {
	//lấy tất cả hàm trong tầng Dao
	IUserDao userDao = new UserDaoImpl();
	

	@Override
	public UserModel login(String username, String password) {
		
		UserModel user = this.findByUsername(username);
		 
		if (user != null && password.equals(user.getPassword())) {
			 return user;
		 }
		 return null;
	}

	@Override
	public UserModel findByUsername(String username) {
		
		return userDao.findByUsername(username);
	}
	public static void main(String[] args) {
	 	
        IUserService userDao = new UserServiceImpl();
        System.out.println(userDao.findByUsername("trungnh"));
        //List<UserModel> list = userDao.findAll();
       // for (UserModel user : list) {
       //     System.out.println(user);
       // }
    }
}
