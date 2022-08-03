package de.mika.network.pipeline;

import de.mika.network.socket.DataPacket;

import java.net.Socket;

public interface ChannelAction
{

    DataPacket run(DataPacket input, Socket tempSocket);

}
