package br.com.heycristhian.cachefeign.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String name;
    private String lastName;
    private String city;
}
