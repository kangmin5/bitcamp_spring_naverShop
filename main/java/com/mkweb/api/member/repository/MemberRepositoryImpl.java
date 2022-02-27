package com.mkweb.api.member.repository;

import com.mkweb.api.member.domain.CalcDTO;
import com.mkweb.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;

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
@Repository
public class MemberRepositoryImpl implements MemberRepository{
    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(MemberDTO bmi) {
        return null;
    }
    @Override
    public String grade(MemberDTO grade) {
        return null;
    }

    @Override
    public String login(MemberDTO login) {
        return null;
    }
}
