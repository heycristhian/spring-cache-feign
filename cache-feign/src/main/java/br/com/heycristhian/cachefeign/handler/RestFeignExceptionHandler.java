package br.com.heycristhian.cachefeign.handler;

import br.com.heycristhian.cachefeign.error.ApiError;
import feign.FeignException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestFeignExceptionHandler {

    @ExceptionHandler(FeignException.class)
    public ApiError error(FeignException e) {
        return ApiError.builder()
                .code(404)
                .statusCode("BAD REQUEST")
                .message(e.getMessage())
                .build();
    }
}
