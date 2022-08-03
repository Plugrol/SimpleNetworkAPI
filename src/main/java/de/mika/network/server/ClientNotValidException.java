package de.mika.network.server;

import java.net.Socket;

public class ClientNotValidException extends NullPointerException
{
    private Socket SOCKET;

    public ClientNotValidException(Socket socket)
    {
        this.SOCKET = socket;
    }

    public Socket getSocket() {
        return SOCKET;
    }
}
