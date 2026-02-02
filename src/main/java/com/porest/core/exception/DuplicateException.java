package com.porest.core.exception;

/**
 * 중복 데이터 예외 (409 Conflict)
 * 이미 존재하는 데이터를 다시 생성하려 할 때 사용
 *
 * 사용 예시:
 * - throw new DuplicateException(HrErrorCode.USER_ALREADY_EXISTS);
 * - throw new DuplicateException(HrErrorCode.USER_DUPLICATE_EMAIL, "이메일: " + email);
 */
public class DuplicateException extends BusinessException {

    public DuplicateException(ErrorCodeProvider errorCode) {
        super(errorCode);
    }

    public DuplicateException(ErrorCodeProvider errorCode, String customMessage) {
        super(errorCode, customMessage);
    }

    public DuplicateException(ErrorCodeProvider errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public DuplicateException(ErrorCodeProvider errorCode, String customMessage, Throwable cause) {
        super(errorCode, customMessage, cause);
    }
}
