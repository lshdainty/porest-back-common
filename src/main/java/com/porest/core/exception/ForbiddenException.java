package com.porest.core.exception;

/**
 * 접근 권한 없음 예외 (403 Forbidden)
 * 인증은 되었으나 해당 리소스에 대한 권한이 없을 때 사용
 *
 * 사용 예시:
 * - throw new ForbiddenException(ErrorCode.FORBIDDEN);
 * - throw new ForbiddenException(HrErrorCode.PERMISSION_DENIED, "접근 권한이 없습니다.");
 */
public class ForbiddenException extends BusinessException {

    public ForbiddenException(ErrorCodeProvider errorCode) {
        super(errorCode);
    }

    public ForbiddenException(ErrorCodeProvider errorCode, String customMessage) {
        super(errorCode, customMessage);
    }

    public ForbiddenException(ErrorCodeProvider errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public ForbiddenException(ErrorCodeProvider errorCode, String customMessage, Throwable cause) {
        super(errorCode, customMessage, cause);
    }
}
