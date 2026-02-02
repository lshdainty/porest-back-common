package com.porest.core.exception;

import lombok.Getter;

/**
 * 비즈니스 로직 처리 중 발생하는 예외
 * ErrorCodeProvider를 포함하여 일관된 에러 응답 제공
 * 실제 메시지는 GlobalExceptionHandler에서 MessageSource를 통해 다국어로 처리
 */
@Getter
public class BusinessException extends RuntimeException {

    private final ErrorCodeProvider errorCode;

    /**
     * ErrorCodeProvider만 사용하는 생성자
     * 메시지는 GlobalExceptionHandler에서 MessageSource를 통해 가져옴
     */
    public BusinessException(ErrorCodeProvider errorCode) {
        super(errorCode.getMessageKey());
        this.errorCode = errorCode;
    }

    /**
     * ErrorCodeProvider + 커스텀 메시지 생성자
     * 커스텀 메시지를 직접 지정할 때 사용
     */
    public BusinessException(ErrorCodeProvider errorCode, String customMessage) {
        super(customMessage);
        this.errorCode = errorCode;
    }

    /**
     * ErrorCodeProvider + Cause 생성자
     */
    public BusinessException(ErrorCodeProvider errorCode, Throwable cause) {
        super(errorCode.getMessageKey(), cause);
        this.errorCode = errorCode;
    }

    /**
     * ErrorCodeProvider + 커스텀 메시지 + Cause 생성자
     */
    public BusinessException(ErrorCodeProvider errorCode, String customMessage, Throwable cause) {
        super(customMessage, cause);
        this.errorCode = errorCode;
    }
}
