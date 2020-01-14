package com.tracing.representation.advice;

import com.tracing.representation.response.CommonResponse;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static java.lang.String.format;

@Slf4j
@NoArgsConstructor
@RestControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public CommonResponse defaultErrorHandler(Exception ex) {
        log.error("Error occurs ex:{} message: {} cause:{} stack_trace: {}",
                ex.getClass(), ex.getMessage(), ex.getCause(), ex.getStackTrace());
        return CommonResponse.ofError(ex.getLocalizedMessage());
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        String failedFields = ex.getBindingResult().getFieldErrors().stream()
                .map(FieldError::getField)
                .reduce((f1, f2) -> f1 + " , " + f2).get();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(CommonResponse.ofError(
                        format("Api Request Error: fields %s require not empty", failedFields)));
    }
}
