package com.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Coordonnee {
    private float latitude;
    private float longitude;
}
