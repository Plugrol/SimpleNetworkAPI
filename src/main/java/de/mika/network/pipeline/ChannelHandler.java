package de.mika.network.pipeline;

import java.util.Map;

public interface ChannelHandler
{
    ChannelHandler connect(ChannelAction channelAction);

    ChannelHandler disconnect(ChannelAction channelAction);

    ChannelHandler before(ChannelAction channelAction);

    ChannelHandler before(String listen, ChannelAction channelAction);

    ChannelHandler execution(String listen, ChannelAction channelAction);

    ChannelHandler execution(ChannelAction channelAction);

    ChannelHandler after(ChannelAction channelAction);

    ChannelHandler after(String listen, ChannelAction channelAction);

    ChannelHandler exceptionHandler(BasicExceptionHandler basicExceptionHandler);

    Map<String, ChannelAction> getActions();

}
