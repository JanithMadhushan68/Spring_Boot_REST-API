package com.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Member;
import com.library.repository.MemberRepository;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    public Optional<Member> getMemberById(int id) {
        return memberRepository.findById(id);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member updateMember(int id, Member updatedMember) {
        return memberRepository.findById(id).map(member -> {
            member.setMemberName(updatedMember.getMemberName());
            member.setPhoneNo(updatedMember.getPhoneNo());
            member.setAddress(updatedMember.getAddress());
            member.setMembershipType(updatedMember.getMembershipType());
            return memberRepository.save(member);
        }).orElse(null);
    }

    public void deleteMember(int id) {
        memberRepository.deleteById(id);
    }
}
