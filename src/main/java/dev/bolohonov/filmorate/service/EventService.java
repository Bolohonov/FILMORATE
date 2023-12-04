package dev.bolohonov.filmorate.service;

import dev.bolohonov.filmorate.exceptions.UserNotFoundException;
import dev.bolohonov.filmorate.model.Event;
import dev.bolohonov.filmorate.storage.EventStorage;
import dev.bolohonov.filmorate.storage.UserStorage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@Service
public class EventService {

    private final EventStorage eventStorage;
    private final UserStorage userStorage;

    public EventService(EventStorage eventStorage, @Qualifier("userDbStorage") UserStorage userStorage) {
        this.eventStorage = eventStorage;
        this.userStorage = userStorage;
    }

    public Collection<Event> getFeedForUser(int id) {
        if (userStorage.findUserById(id).isEmpty()) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return eventStorage.getFeedForUser(id);
    }
}
