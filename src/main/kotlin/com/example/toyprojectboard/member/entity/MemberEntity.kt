package com.example.toyprojectboard.member.entity

import com.example.toyprojectboard.core.basetime.entity.BaseTimeEntity
import jakarta.persistence.*
import lombok.Getter
import lombok.NoArgsConstructor

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member")
class MemberEntity(name: String, email: String, password: String): BaseTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var uId: Long? = null

    @Column(nullable = false)
    var name: String = name

    @Column(nullable = false, unique = true)
    var email: String = email

    @Column(nullable = false)
    var password: String = password

//    override fun getAuthorities(): MutableCollection<out GrantedAuthority>? {
//        return null
//    }
//
//    override fun getPassword(): String {
//        return password
//    }
//
//    override fun getUsername(): String {
//        return email
//    }
//
//    override fun isAccountNonExpired(): Boolean {
//        return true
//    }
//
//    override fun isAccountNonLocked(): Boolean {
//        return true
//    }
//
//    override fun isCredentialsNonExpired(): Boolean {
//        return true
//    }
//
//    override fun isEnabled(): Boolean {
//        return true
//    }
}
