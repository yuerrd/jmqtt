package org.jmqtt.broker.session;

import org.jmqtt.common.bean.ClientSession;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConnectManager {

    private  Map<String, ClientSession> clientCache = new ConcurrentHashMap<>();

    private static final  ConnectManager INSTANCE  =  new ConnectManager();

    private ConnectManager(){};

    private ConnectManager getInstance(){
        return INSTANCE;
    }

    public ClientSession putClient(String clientId,ClientSession clientSession){
        return this.clientCache.put(clientId,clientSession);
    }

    public ClientSession removeClient(String clientId){
        return this.clientCache.remove(clientId);
    }
}
