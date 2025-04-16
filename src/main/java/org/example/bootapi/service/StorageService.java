// 설명서
package org.example.bootapi.service;

import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
    // 2가지 전략
    // 1. 파일명 - 파일명.. 나머지는 서버가 관리..
    // 2. URL - 괜히 서버를 거치는 것도 ..
    String upload(MultipartFile file);
}
