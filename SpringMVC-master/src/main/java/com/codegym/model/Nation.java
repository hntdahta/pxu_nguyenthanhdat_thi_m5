package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "nations")
public class Nation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @OneToMany(mappedBy = "nation")
        private Set<Miss> misses;

        public Set<Miss> getMisses() {
            return misses;
        }

        public void setMisses(Set<Miss> misses) {
            this.misses = misses;
        }

        public Nation() {
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
    }
