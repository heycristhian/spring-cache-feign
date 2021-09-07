package br.com.heycristhian.user.handler;

import br.com.heycristhian.user.error.ApiError;
import br.com.heycristhian.user.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestUserExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(UserNotFoundException.class)
    public ApiError error(UserNotFoundException e) {
        return ApiError.builder()
                .message(e.getMessage())
                .code(404)
                .statusCode("BAD REQUEST")
                .build();
    }
}
