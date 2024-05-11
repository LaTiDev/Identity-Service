package com.api.ApiBoot3.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.api.ApiBoot3.dto.request.RoleRequest;
import com.api.ApiBoot3.dto.response.RoleResponse;
import com.api.ApiBoot3.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
