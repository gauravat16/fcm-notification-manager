package com.hermes.cloudmessaging.model.dto.request;

import com.hermes.cloudmessaging.model.constants.enums.UserRoles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreationRequest {

    private String userId;

    private String passwordHash;

    private UserRoles userRole;
}
