package com.cloneloanrule.presentation.web;

import com.cloneloanrule.application.activity.LoanActivity;
import com.cloneloanrule.domain.member.MemberNumber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("members")
public class LoanController {

    LoanActivity loanActivity;

    public LoanController(LoanActivity loanActivity) {
        this.loanActivity = loanActivity;
    }

    @GetMapping("/{会員番号}/loans")
    String 貸出状況(
            @PathVariable MemberNumber 会員番号,
            Model model
    ){
        return "loan/context";
    }

}
