package org.nklkarthi.persistence.dao;

import org.nklkarthi.persistence.model.MyUser;
import org.nklkarthi.persistence.model.QMyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

import com.querydsl.core.types.dsl.StringPath;

public interface MyUserRepository extends JpaRepository<MyUser, Long>, QueryDslPredicateExecutor<MyUser>, QuerydslBinderCustomizer<QMyUser> {
    @Override
    default public void customize(final QuerydslBindings bindings, final QMyUser root) {
        bindings.bind(String.class).first((final StringPath path, final String value) -> path.containsIgnoreCase(value));
        bindings.excluding(root.email);
    }

}
