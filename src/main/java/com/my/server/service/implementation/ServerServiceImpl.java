package com.my.server.service.implementation;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;

import javax.transaction.Transactional;

import com.my.server.enums.Status;
import com.my.server.model.Server;
import com.my.server.repo.ServerRepo;
import com.my.server.service.ServerService;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class ServerServiceImpl implements ServerService {

    private final ServerRepo serverRepo;

    @Override
    public Server create(Server server) {

        System.out.println("Saving new server: {}" + server.getName());
        server.setImageUrl(setServerImageUrl());
        return serverRepo.save(server);
    }

    public ServerServiceImpl(ServerRepo serverRepo) {
        this.serverRepo = serverRepo;
    }

    @Override
    public Collection<Server> list(int limit) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Server get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Server date(Server server) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Server ping(String ipAddress) throws IOException {
        System.out.println("Ping server ip: {}" + ipAddress);
        Server server = serverRepo.findByIpAdderss(ipAddress);
        InetAddress address = InetAddress.getByName(ipAddress);
        server.setStatus(address.isReachable(10000) ? Status.SERVER_UP : Status.SERVER_DOWN);
        serverRepo.save(server);

        return server;
    }

    private String setServerImageUrl() {
        return null;
    }

}
