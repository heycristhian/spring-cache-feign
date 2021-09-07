package br.com.heycristhian.user.error;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiError {
    private Integer code;
    private String statusCode;
    private String message;
}
