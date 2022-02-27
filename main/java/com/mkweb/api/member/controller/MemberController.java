package com.mkweb.api.member.controller;

import com.mkweb.api.member.domain.CalcDTO;
import com.mkweb.api.member.domain.MemberDTO;
import com.mkweb.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: com.mkweb.api.member.controller
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-11
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-11   kangmin5    최초생성
 */


@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;

    @PostMapping("/calc")
    public String calc(@RequestBody CalcDTO calc){
        return service.calc(calc);
    }
    @PostMapping("/bmi")
    public String bmi(@RequestBody MemberDTO bmi) {
        return service.bmi(bmi);
    }
    @PostMapping("/grade")
    public String grade(@RequestBody MemberDTO grade){
        return  service.grade(grade);
    }
    @PostMapping("/login")
    public String login(@RequestBody MemberDTO login){
        return service.login(login);
    }
}

