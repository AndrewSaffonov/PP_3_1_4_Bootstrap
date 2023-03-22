package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;


import javax.transaction.Transactional;
import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {this.roleRepository = roleRepository;}

    @Transactional
    public List<Role> getRoles() {return roleRepository.findAll();}

    @Transactional
    public Role getRoleById(long id) {return roleRepository.getById(id);}
}