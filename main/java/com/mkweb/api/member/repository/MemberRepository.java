package com.mkweb.api.member.repository;

import com.mkweb.api.member.domain.CalcDTO;
import com.mkweb.api.member.domain.MemberDTO;

/**
 * packageName: com.mkweb.api.member.repository
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-11
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-11   kangmin5    최초생성
 */
public interface MemberRepository {
    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);

    String login(MemberDTO login);
}
