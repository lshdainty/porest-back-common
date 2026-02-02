package com.porest.core.exception;

/**
 * 인증 실패 예외 (401 Unauthorized)
 * 인증이 필요하거나 인증 정보가 유효하지 않을 때 사용
 *
 * 사용 예시:
 * - throw new UnauthorizedException(ErrorCode.UNAUTHORIZED);
 * - throw new UnauthorizedException(ErrorCode.UNAUTHORIZED, "토큰이 만료되었습니다.");
 */
public class UnauthorizedException extends BusinessException {

    public UnauthorizedException(ErrorCodeProvider errorCode) {
        super(errorCode);
    }

    public UnauthorizedException(ErrorCodeProvider errorCode, String customMessage) {
        super(errorCode, customMessage);
    }

    public UnauthorizedException(ErrorCodeProvider errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public UnauthorizedException(ErrorCodeProvider errorCode, String customMessage, Throwable cause) {
        super(errorCode, customMessage, cause);
    }
}
