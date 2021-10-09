package com.example.test.starter;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


@RequiredArgsConstructor
public class OnProductionConditional implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        System.out.println("IS IT PROD?");
        return true;
    }
}
