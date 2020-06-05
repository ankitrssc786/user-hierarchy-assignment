package com.user.hierarchy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.user.hierarchy.dao.TeamHierarchyDao;
import com.user.hierarchy.dao.UserAccessDao;
import com.user.hierarchy.dao.UserDao;
import com.user.hierarchy.dto.UserDto;
import com.user.hierarchy.model.TeamHierarchy;
import com.user.hierarchy.model.User;
import com.user.hierarchy.model.UserAccess;
import com.user.hierarchy.service.UserService;

@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private TeamHierarchyDao teamDao;

	@Autowired
	private UserAccessDao userAccessDao;

	@Override
	public UserDto save(UserDto userDto) {

		UserAccess useraccess = new UserAccess();
		if (userDto != null) {
			useraccess.setEmpid(userDto.getEmpid());
			useraccess.setAccesskey(userDto.getAccesskey());
			useraccess.setCountry(userDto.getCountry());
			useraccess.setSubuser(userDto.getEmpid());
			useraccess.setSubuseraccesskey(userDto.getAccesskey());
			useraccess.setSubusercountry(userDto.getCountry());
			userAccessDao.save(useraccess);

			List<TeamHierarchy> teamList = teamDao.findByManagerId(userDto.getEmpid(), userDto.getEmpid());
			if (teamList.size() != 0 && teamList != null) {
				for (TeamHierarchy team : teamList) {
					User user = userDao.findByEmpId(team.getEmpid());
					useraccess.setEmpid(userDto.getEmpid());
					useraccess.setAccesskey(userDto.getAccesskey());
					useraccess.setCountry(userDto.getCountry());
					useraccess.setSubuser(user.getEmpid());
					useraccess.setSubuseraccesskey(user.getAccesskey());
					useraccess.setSubusercountry(user.getCountry());
					userAccessDao.save(useraccess);
				}
			}
		} else {
			List<UserDto> userList = userDao.findUsers();
			for (UserDto userVal : userList) {
				useraccess.setEmpid(userVal.getEmpid());
				useraccess.setAccesskey(userVal.getAccesskey());
				useraccess.setCountry(userVal.getCountry());
				useraccess.setSubuser(userVal.getEmpid());
				useraccess.setSubuseraccesskey(userVal.getAccesskey());
				useraccess.setSubusercountry(userVal.getCountry());
				userAccessDao.save(useraccess);

				List<TeamHierarchy> teamList = teamDao.findByManagerId(userVal.getEmpid(), userVal.getEmpid());
				if (teamList.size() != 0 && teamList != null) {
					for (TeamHierarchy team : teamList) {
						User user = userDao.findByEmpId(team.getEmpid());
						useraccess.setEmpid(userVal.getEmpid());
						useraccess.setAccesskey(userVal.getAccesskey());
						useraccess.setCountry(userVal.getCountry());
						useraccess.setSubuser(user.getEmpid());
						useraccess.setSubuseraccesskey(user.getAccesskey());
						useraccess.setSubusercountry(user.getCountry());
						userAccessDao.save(useraccess);
					}
				}
			}
		}
		return userDto;
	}

}
