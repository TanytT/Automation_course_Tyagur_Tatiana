package com.company.infrostructure.data;

public interface UserDataMapper {

    User findUserByEmail(String email);
    User findUsedByName(String name);
}
