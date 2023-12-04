package dev.bolohonov.filmorate.storage;

import dev.bolohonov.filmorate.enums.EventType;
import dev.bolohonov.filmorate.enums.OperationType;
import dev.bolohonov.filmorate.model.Event;

import java.util.Collection;

public interface EventStorage {

    void addEvent(int userId, int entityId, EventType eventType, OperationType operation);

    Collection<Event> getFeedForUser(int id);
}
