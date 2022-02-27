package com.mkweb.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.mkweb.api.member.domain
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-11
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-11   kangmin5    최초생성
 */
@Data
@Component
public class MemberDTO {

    private String userid;
    private String name;
    private String address;
    private String phone;
    private double height;
    private double weight;
    private String debutDate;
    private int kor;
    private int eng;
    private int math;
    private String password;
    private int num;
    private int number;

}
