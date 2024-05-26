package com.userservice.mapper;

import com.userservice.model.User;
import com.userservice.repository.entity.UserEntity;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntityMapper {

  UserEntity map(User model);

  User map(UserEntity entity);

  List<User> map(List<UserEntity> entity);
}
