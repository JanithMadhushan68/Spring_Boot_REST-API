package com.library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.model.Member;
import com.library.service.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    //add the data
    @PostMapping("/add")
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    // get by using id
    @GetMapping("/{id}")
    public Optional<Member> getMemberById(@PathVariable int id) {
        return memberService.getMemberById(id);
    }

    // get all the data
    @GetMapping("/all")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    //Update a member’s details using ID
    @PutMapping("/update/{id}")
    public Member updateMember(@PathVariable int id, @RequestBody Member updatedMember) {
        return memberService.updateMember(id, updatedMember);
    }

    //Delete a member using ID
    @DeleteMapping("/delete/{id}")
    public void deleteMember(@PathVariable int id) {
        memberService.deleteMember(id);
    }
}
