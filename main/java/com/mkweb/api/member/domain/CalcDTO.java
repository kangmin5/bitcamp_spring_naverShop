package com.mkweb.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.mkweb.api.member.domain
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-25
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-25   kangmin5    최초생성
 */
@Data
@Component
public class CalcDTO {
    private int num1;
    private String opcode;
    private int num2;
}
