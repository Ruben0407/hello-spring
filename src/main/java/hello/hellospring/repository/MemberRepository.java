package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {

    Member save(Member member); //회원 저장소 저장
    Optional<Member> findById(Long id);//Optional 은 자바8에 추가된 기능으로 null값을 감싸는 최신방
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
