package dev.bolohonov.filmorate.model;

import dev.bolohonov.filmorate.enums.EventType;
import dev.bolohonov.filmorate.enums.OperationType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Event {

    private int id;
    private LocalDateTime timestamp;
    private int userId;
    private EventType eventType;
    private OperationType operation;
    private int entityId;
}
