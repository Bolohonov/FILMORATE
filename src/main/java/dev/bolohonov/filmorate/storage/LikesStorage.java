package dev.bolohonov.filmorate.storage;

import dev.bolohonov.filmorate.model.Film;

import java.util.Collection;

public interface LikesStorage {
    void addLike(Integer userId, Integer filmId);

    void removeLike(Integer userId, Integer filmId);

    Collection<Film> getFilmsByLikes(Integer count, Integer genreId, Integer year);
    
    Collection<Film> getRecommendations(Integer userId);

}
