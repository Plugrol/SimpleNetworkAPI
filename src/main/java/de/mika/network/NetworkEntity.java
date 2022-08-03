package de.mika.network;

import de.mika.network.pipeline.ChannelHandler;

import java.net.InetSocketAddress;

/**
 * This is the bare type of entity, it holds the basic information about the entity.
 *
 * @author mika
 */
public interface NetworkEntity
{

    InetSocketAddress getAddress();

    boolean isClient();

    ChannelHandler getChannelHandler();


    /**
     * This method lets the server / client start up
     */
    void run();

    /**
     * This method lets the server / client shutdown
     */
    void shutdown();


    //COMING UP: void setNetworkProcessingType();

}
