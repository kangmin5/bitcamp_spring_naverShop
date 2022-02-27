package com.mkweb.api.member.service;
import com.mkweb.api.member.domain.CalcDTO;
import com.mkweb.api.member.domain.MemberDTO;
import com.mkweb.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (op){
            case "+": res = a + b;break;
            case "-": res = a - b;break;
            case "*": res = a * b;break;
            case "/": res = a / b;break;
            case "%": res = a % b;break;
        }
        return String.format("%d %s %d =%d",a,op,b,res);
    }

    @Override
    public String bmi(MemberDTO bmi) {
        double res =0;
        res = (bmi.getWeight() / (bmi.getHeight() * bmi.getHeight())) * 10000;
        String resResult;
        if(res>=30)
            resResult="고도비만";
        else if(res<30 && res>=25)
            resResult="비만";
        else if(res<25 && res>=23)
            resResult="과체중";
        else if(res<23 && res>=18.5)
            resResult="정상";
        else if(res<18.5)
            resResult = "저체중";
        else
            resResult = "다시 확인 바랍니다.";
        return String.format("%s 님의 키는 %.2f 몸무게는 %.2f 이고 BMI지수는 %.2f 건강상태는 %s ",
                bmi.getName(),bmi.getHeight(),bmi.getWeight(),res,resResult);
    }

    @Override
    public String grade(MemberDTO grade) {
        int total = grade.getKor()+ grade.getEng()+ grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" :"불합격";
        return String.format("%s 학생의 국어: %d 영어:%d 수학:%d 이고 합계는 %d, 평균은 %d\n %s",
                grade.getName(),grade.getKor(),grade.getEng(),grade.getMath(),total,avg,pass);
    }

    @Override
    public String login(MemberDTO login) {

        return String.format(" %s님의 비번은 %s 입니다.",login.getName(),login.getPassword());
    }

    @Override
    public String lotto(MemberDTO lotto) {
            //리액트에서 lotto[]값으로 보내왔다.
            int num = lotto.getNum();
            

        return String.format(" %d",lotto.getNum());
    }


}
