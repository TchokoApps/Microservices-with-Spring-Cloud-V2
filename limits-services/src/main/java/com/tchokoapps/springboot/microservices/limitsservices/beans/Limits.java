package com.tchokoapps.springboot.microservices.limitsservices.beans;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Limits {
    private int min;
    private int max;
}
