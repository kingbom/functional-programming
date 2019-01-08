package com.kingbom.functionalprogramming.service;

import com.kingbom.functionalprogramming.dto.UserDto;
import com.kingbom.functionalprogramming.model.User;
import com.kingbom.functionalprogramming.repository.UserRepo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

class UserService {

    private final UserRepo userRepo;

    private final UserMapper userMapper;

    public UserService(UserRepo userRepo, UserMapper userMapper) {
        this.userRepo = userRepo;
        this.userMapper = userMapper;
    }

    public List<UserDto> findAll(){
        return userRepo.findAll().stream()
                       .map(userMapper::toDto)
                       .collect(Collectors.toList());
    }
}


@Component
class UserMapper {

    public UserDto toDto(User user) {
        UserDto dto = new UserDto();
        dto.setUsername(user.getUsername());
        dto.setFullName(user.getFirstName() + " " + user.getLastName());
        dto.setActive(user.getActive());
        return dto;
    }
}
