package com.example.toyprojectboard.core.basetime.entity

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.CreationTimestamp
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
// @MappedSuperclass : 해당 엔티티의 테이블을 생성하지 않고 속성정보를 상속받을 수 있게 하는 어노테이션
@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseTimeEntity {
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    val createDateTime: LocalDateTime? = null
    @CreationTimestamp
    @Column(nullable = false)
    val updateDateTime: LocalDateTime? = null
}