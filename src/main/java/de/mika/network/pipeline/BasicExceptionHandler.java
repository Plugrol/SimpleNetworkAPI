package de.mika.network.pipeline;

public interface BasicExceptionHandler
{

    boolean handle(Throwable throwable, ChannelState handleState);

}
