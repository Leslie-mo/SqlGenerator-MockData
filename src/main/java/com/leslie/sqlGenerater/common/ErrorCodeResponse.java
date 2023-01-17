package com.leslie.sqlGenerater.common;

/**
 * error code
 *
 */
public enum ErrorCodeResponse {

    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "Request parameter error"),
    NOT_LOGIN_ERROR(40100, "Not logged in"),
    NO_AUTH_ERROR(40101, "No permission"),
    NOT_FOUND_ERROR(40400, "Request data does not exist"),
    FORBIDDEN_ERROR(40300, "No Access"),
    SYSTEM_ERROR(50000, "System internal exception"),
    OPERATION_ERROR(50001, "Operation failed");

    /**
     * status code
     */
    private final int code;

    /**
     * information
     */
    private final String message;

    ErrorCodeResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
