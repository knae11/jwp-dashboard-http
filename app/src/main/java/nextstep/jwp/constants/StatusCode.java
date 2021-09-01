package nextstep.jwp.constants;

public enum StatusCode {
    OK("200", "OK"),
    FOUND("302", "Found"),
    UNAUTHORIZED("401", "Unauthorized"),
    NOT_FOUND("404", "Not Found"),
    INTERNAL_SERVER_ERROR("500", "Internal Server Error"),
    BAD_REQUEST("400", "Bad Request");

    private final String statusCode;
    private final String status;

    StatusCode(String statusCode, String status) {
        this.statusCode = statusCode;
        this.status = status;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getStatus() {
        return status;
    }
}
