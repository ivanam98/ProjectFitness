package com.project.ProjectFitness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.Member;
import com.project.ProjectFitness.repository.MemberRepository;




@Service
public class MemberService {

	@Autowired 
	private MemberRepository memberRepository;
	
	public void create(Member member) throws Exception {
		
        if(member.getId() != null){
            throw new Exception("Id mora biti null.");
        }
        this.memberRepository.save(member);

    }
	
	public Member findByUsername(String username) {
        return this.memberRepository.findByUsername(username);
	}
}
