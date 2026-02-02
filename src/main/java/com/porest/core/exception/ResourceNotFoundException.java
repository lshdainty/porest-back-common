package com.porest.core.exception;

/**
 * 리소스를 찾을 수 없을 때 발생하는 예외 (404 Not Found)
 * 파일, 외부 리소스 등 엔티티가 아닌 리소스를 찾을 수 없을 때 사용
 *
 * 사용 예시:
 * - throw new ResourceNotFoundException(ErrorCode.FILE_NOT_FOUND);
 * - throw new ResourceNotFoundException(ErrorCode.FILE_NOT_FOUND, "파일을 찾을 수 없습니다: " + path);
 */
public class ResourceNotFoundException extends BusinessException {

    public ResourceNotFoundException(ErrorCodeProvider errorCode) {
        super(errorCode);
    }

    public ResourceNotFoundException(ErrorCodeProvider errorCode, String customMessage) {
        super(errorCode, customMessage);
    }

    public ResourceNotFoundException(ErrorCodeProvider errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public ResourceNotFoundException(ErrorCodeProvider errorCode, String customMessage, Throwable cause) {
        super(errorCode, customMessage, cause);
    }
}
