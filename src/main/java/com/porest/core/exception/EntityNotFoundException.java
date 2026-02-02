package com.porest.core.exception;

/**
 * 엔티티 조회 실패 예외 (404 Not Found)
 * 데이터베이스에서 엔티티를 찾을 수 없을 때 사용
 *
 * 사용 예시:
 * - throw new EntityNotFoundException(ErrorCode.NOT_FOUND);
 * - throw new EntityNotFoundException(HrErrorCode.USER_NOT_FOUND, "사용자 ID: " + userId);
 */
public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException(ErrorCodeProvider errorCode) {
        super(errorCode);
    }

    public EntityNotFoundException(ErrorCodeProvider errorCode, String customMessage) {
        super(errorCode, customMessage);
    }

    public EntityNotFoundException(ErrorCodeProvider errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public EntityNotFoundException(ErrorCodeProvider errorCode, String customMessage, Throwable cause) {
        super(errorCode, customMessage, cause);
    }
}
