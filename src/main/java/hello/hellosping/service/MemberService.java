package hello.hellosping.service;

import hello.hellosping.domain.Member;
import hello.hellosping.domain.MemberRepository;
import hello.hellosping.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
    * 회원 가입
    */
    public Long join(Member member){
        /*
        // 같은 이름이 있는 중복 회원은 가입 불가능
        Optional<Member> result = memberRepository.findByName(member.getName());
        result.ifPresent(m -> { // null이 아니고 값이 있으면 -> Optional로 Member를 감싸서 반환해주기 때문에 해당 메소드 사용 가능
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
        */

        // 중복 회원 검증
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> { // null이 아니고 값이 있으면 -> Optional로 Member를 감싸서 반환해주기 때문에 해당 메소드 사용 가능
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }

}
