package com.decoration.service.repository;

import com.decoration.service.model.UserVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserVo, Long> {
    /**
     * 通过手机号或者邮箱查询用户
     *
     * @param phone
     * @param email
     * @return
     */
    UserVo findByUsernameAndPassword(String phone, String email);

    /**
     * 通过手机号或者邮箱查询用户
     *
     * @param phone
     * @param email
     * @return
     */
    UserVo findByPhoneOrEmail(String phone, String email);

    /**
     * 分页查询用户信息
     *
     * @param pageable
     * @return
     */
    Page<UserVo> findAll(Pageable pageable);

    /**
     * 通过ID查询用户信息
     *
     * @param id
     * @return
     */
    UserVo getById(Long id);
}
