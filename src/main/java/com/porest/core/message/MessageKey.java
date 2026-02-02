package com.porest.core.message;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Core 공통 메시지 키 중앙 관리
 * messages.properties의 키를 enum으로 관리하여 타입 안전성 보장
 */
@Getter
@RequiredArgsConstructor
public enum MessageKey {

    // ========================================
    // FILE (파일 관련)
    // ========================================
    FILE_NOT_FOUND("error.file.notfound"),
    FILE_READ("error.file.read"),
    FILE_COPY("error.file.copy"),
    FILE_MOVE("error.file.move"),
    FILE_SAVE_ERROR("error.file.save"),

    // ========================================
    // COMMON (공통)
    // ========================================
    COMMON_SUCCESS("error.common.success"),
    COMMON_INVALID_INPUT("error.common.invalid.input"),
    COMMON_UNAUTHORIZED("error.common.unauthorized"),
    COMMON_FORBIDDEN("error.common.forbidden"),
    COMMON_NOT_FOUND("error.common.not.found"),
    COMMON_404("error.common.404"),
    COMMON_INTERNAL_SERVER("error.common.internal.server"),

    ;

    private final String key;
}
