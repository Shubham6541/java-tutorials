package com.nklkarthi.dynamicvalidation.dao;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.nklkarthi.dynamicvalidation.model.ContactInfoExpression;

public interface ContactInfoExpressionRepository extends Repository<ContactInfoExpression, String> {
    Optional<ContactInfoExpression> findOne(String id);
}
