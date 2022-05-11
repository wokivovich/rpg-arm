package com.wokivovich.arm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hero")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int health;
    private int mana;

    private int strength;
    private int intelligence;
    private int wisdom;
    private int agility;
    private int charisma;
    private int physique;

    @OneToMany
    @JoinTable(name = "hero_item",
            joinColumns = {@JoinColumn(name = "hero_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "item_id", referencedColumnName = "id")}
    )
    private Set<Item> items;

}
