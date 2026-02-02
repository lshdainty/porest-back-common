package com.porest.core.exception;

import org.springframework.http.HttpStatus;

/**
 * ErrorCode 인터페이스
 * Core의 ErrorCode와 각 도메인별 ErrorCode가 구현하는 공통 인터페이스
 * BusinessException에서 이 인터페이스를 통해 다양한 ErrorCode를 처리할 수 있음
 */
public interface ErrorCodeProvider {

    /**
     * 응답 코드를 반환합니다. (예: USER_001, VACATION_002)
     *
     * @return 응답 코드
     */
    String getCode();

    /**
     * 메시지 키를 반환합니다. (messages.properties의 키)
     *
     * @return 메시지 키
     */
    String getMessageKey();

    /**
     * HTTP 상태 코드를 반환합니다.
     *
     * @return HTTP 상태 코드
     */
    HttpStatus getHttpStatus();

    /**
     * HTTP 상태 코드 값을 반환합니다.
     *
     * @return HTTP 상태 코드 값
     */
    default int getHttpStatusCode() {
        return getHttpStatus().value();
    }
}
