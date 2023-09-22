package hello.hellosping;

import hello.hellosping.domain.MemberRepository;
import hello.hellosping.repository.JdbcMemeberRepository;
import hello.hellosping.repository.JdbcTemplateMemberRepository;
import hello.hellosping.repository.MemoryMemberRepository;
import hello.hellosping.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemeberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }

}
