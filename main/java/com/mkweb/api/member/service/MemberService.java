package com.mkweb.api.member.service;

/**
 * packageName: com.mkweb.api.member.service
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-11
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-11   kangmin5    최초생성
 */
public interface MemberService {
    void memberList();
    void memberDetail();
    void mailSendList();
    void mailSendRegist();
    void saveMoneyList();
    void saveMoneyDetail();
    void saveMoneyAppend();
    void saveMoneyDelete();
}
