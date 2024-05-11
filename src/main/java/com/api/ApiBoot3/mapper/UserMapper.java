package com.api.ApiBoot3.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.api.ApiBoot3.dto.request.UserCreationRequest;
import com.api.ApiBoot3.dto.request.UserUpdateRequest;
import com.api.ApiBoot3.dto.response.UserResponse;
import com.api.ApiBoot3.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
