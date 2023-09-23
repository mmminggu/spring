package hello.hellosping;

import hello.hellosping.domain.MemberRepository;
import hello.hellosping.repository.JdbcMemeberRepository;
import hello.hellosping.repository.JdbcTemplateMemberRepository;
import hello.hellosping.repository.JpaMemberRepository;
import hello.hellosping.repository.MemoryMemberRepository;
import hello.hellosping.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
