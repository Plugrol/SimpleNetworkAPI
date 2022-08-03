package de.mika.network.socket;

import java.io.Serializable;

public record Sign(String sender, String group) implements Serializable { }
