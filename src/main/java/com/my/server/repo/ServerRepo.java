package com.my.server.repo;

import com.my.server.model.Server;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
  Server findByIpAdderss(String ipAddress);

}
