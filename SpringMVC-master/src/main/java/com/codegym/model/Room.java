package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getRoomCateoryId() {
        return roomCateoryId;
    }

    public void setRoomCateoryId(Long roomCateoryId) {
        this.roomCateoryId = roomCateoryId;
    }

    private Long roomCateoryId;




    @ManyToOne
    @JoinColumn(name = "category_id")
    private RoomCategory roomCategory;

    public Room() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public RoomCategory getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(RoomCategory roomCategory) {
        this.roomCategory = roomCategory;
    }
}

