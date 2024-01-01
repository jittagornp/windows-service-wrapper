package com.lotuss.store.winsw.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author jittagornp
 */
@Data
@Builder
public class Response<T> {

    private int status;

    private T data;

    public static <T> Response<T> ok(T data) {
        return Response.<T>builder().status(200).data(data).build();
    }

}
