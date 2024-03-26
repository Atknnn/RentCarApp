package com.atakan.utility;

import com.atakan.repository.entity.BaseEntity;

public class Constants {
    public static BaseEntity getBaseEntity(){
        return BaseEntity.builder()
                .createAt(System.currentTimeMillis())
                .updateAt(System.currentTimeMillis())
                .state(1)
                .isActive(true)
                .build();
    }
}
