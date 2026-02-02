package com.porest.core.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * Core 공통 에러 코드 정의
 * 도메인 특화 에러 코드는 각 프로젝트의 HrErrorCode 등에서 정의
 * 실제 메시지는 messages.properties에서 다국어로 관리
 */
@Getter
@RequiredArgsConstructor
public enum ErrorCode implements ErrorCodeProvider {

    // ========================================
    // COMMON (공통)
    // ========================================
    SUCCESS("COMMON_200", "error.common.success", HttpStatus.OK),
    INVALID_INPUT("COMMON_400", "error.common.invalid.input", HttpStatus.BAD_REQUEST),
    INVALID_DATE_RANGE("COMMON_401", "error.common.invalid.date.range", HttpStatus.BAD_REQUEST),
    INVALID_PARAMETER("COMMON_402", "error.common.invalid.parameter", HttpStatus.BAD_REQUEST),
    UNSUPPORTED_TYPE("COMMON_403", "error.common.unsupported.type", HttpStatus.BAD_REQUEST),
    UNAUTHORIZED("COMMON_411", "error.common.unauthorized", HttpStatus.UNAUTHORIZED),
    FORBIDDEN("COMMON_412", "error.common.forbidden", HttpStatus.FORBIDDEN),
    NOT_FOUND("COMMON_404", "error.common.not.found", HttpStatus.NOT_FOUND),
    INTERNAL_SERVER_ERROR("COMMON_500", "error.common.internal.server", HttpStatus.INTERNAL_SERVER_ERROR),

    // ========================================
    // FILE (파일)
    // ========================================
    FILE_NOT_FOUND("FILE_001", "error.file.notfound", HttpStatus.NOT_FOUND),

    ;

    /**
     * 응답 코드 (예: COMMON_200, FILE_001)
     */
    private final String code;

    /**
     * 메시지 키 (messages.properties의 키)
     */
    private final String messageKey;

    /**
     * HTTP 상태 코드
     */
    private final HttpStatus httpStatus;
}
