package com.restboilarplate.acl.auth.entity.settings;

import com.restboilarplate.entity.baseEntity.BaseEntity;
import lombok.*;


import javax.persistence.Entity;

@Entity(name = "AUTH_TYPE")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthType extends BaseEntity {
    private String authType;
}
