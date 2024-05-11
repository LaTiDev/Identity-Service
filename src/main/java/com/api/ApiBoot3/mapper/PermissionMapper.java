package com.api.ApiBoot3.mapper;

import org.mapstruct.Mapper;

import com.api.ApiBoot3.dto.request.PermissionRequest;
import com.api.ApiBoot3.dto.response.PermissionResponse;
import com.api.ApiBoot3.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
