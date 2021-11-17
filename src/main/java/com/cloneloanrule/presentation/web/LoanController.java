package com.cloneloanrule.presentation.web;

import com.cloneloanrule.application.activity.LoanActivity;
import com.cloneloanrule.domain.collection.Entries;
import com.cloneloanrule.domain.collection.book.BookNumber;
import com.cloneloanrule.domain.loan.LoanContext;
import com.cloneloanrule.domain.loanability.Loanability;
import com.cloneloanrule.domain.member.MemberNumber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("members")
public class LoanController {

    LoanActivity loanActivity;

    public LoanController(LoanActivity loanActivity) {
        this.loanActivity = loanActivity;
    }

    /**
     * 会員の貸出状況を確認する
     */
    @GetMapping(path = "/{会員番号}/loans")
    String 貸出状況(
            @PathVariable MemberNumber 会員番号,
            Model model) {
        LoanContext loanContext = loanActivity.貸出状況(会員番号);
        Entries entries = loanActivity.蔵書一覧();
        model.addAttribute("loanContext", loanContext);
        model.addAttribute("entries", entries);
        return "loan/context";
    }

    /**
     * 会員が新規貸出可能か確認する
     */
    @GetMapping(path = "/{会員番号}/loanability")
    String 貸出可否(
            @PathVariable MemberNumber 会員番号,
            @RequestParam("bookNumber") BookNumber bookNumber,
            Model model) {
        LoanContext loanContext = loanActivity.貸出状況(会員番号);
        Entries entries = loanActivity.蔵書一覧();
        model.addAttribute("loanContext", loanContext);
        model.addAttribute("entries", entries);

        Loanability loanability = Loanability.of(loanContext);
        model.addAttribute("LoanabilityType", loanability);
        return "loan/context";
    }
}
