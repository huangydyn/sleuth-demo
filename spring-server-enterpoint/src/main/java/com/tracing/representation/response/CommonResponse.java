package com.tracing.representation.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {

    private String code;

    private T data;

    @Builder.Default
    private String message = "success";

    public static CommonResponse ofError(String msg) {
        return CommonResponse.builder().message(msg).build();
    }
}
