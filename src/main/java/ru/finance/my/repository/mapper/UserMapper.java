package ru.finance.my.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import ru.finance.my.entity.User;

@Mapper
public interface UserMapper {

  User getByLogin(String login);

  void createNew(User user);

  boolean existByEmail(String email);

  void updateUser(User user);

  void deleteUserById(Long userId);

  boolean emailIsNotUnique(String email, Long userId);
}
