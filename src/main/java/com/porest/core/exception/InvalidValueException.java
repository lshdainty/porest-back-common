package com.porest.core.exception;

/**
 * 유효하지 않은 값 예외 (400 Bad Request)
 * 입력값이 비즈니스 규칙에 맞지 않을 때 사용
 *
 * 사용 예시:
 * - throw new InvalidValueException(ErrorCode.INVALID_INPUT);
 * - throw new InvalidValueException(HrErrorCode.VACATION_INVALID_DATE, "시작일이 종료일보다 늦습니다.");
 */
public class InvalidValueException extends BusinessException {

    public InvalidValueException(ErrorCodeProvider errorCode) {
        super(errorCode);
    }

    public InvalidValueException(ErrorCodeProvider errorCode, String customMessage) {
        super(errorCode, customMessage);
    }

    public InvalidValueException(ErrorCodeProvider errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public InvalidValueException(ErrorCodeProvider errorCode, String customMessage, Throwable cause) {
        super(errorCode, customMessage, cause);
    }
}
