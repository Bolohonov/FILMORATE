package dev.bolohonov.filmorate.storage;

import dev.bolohonov.filmorate.model.User;

import java.util.Collection;

public interface FriendsStorage {
    boolean addToFriends(Integer firstUserId, Integer secondUserId);

    void removeFriend(Integer firstUserId, Integer secondUserId);

    Collection<User> getUserFriends(Integer userId);

    Collection<User> getMatchingFriends(Integer id, Integer otherId);

}
