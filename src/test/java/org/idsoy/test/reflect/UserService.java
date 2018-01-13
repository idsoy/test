package org.idsoy.test.reflect;

public interface UserService {

	InnerResponse<User> queryUserNameById(Long userId);
	
}
