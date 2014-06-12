/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eksplorasi.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Budi Ariyanto <fx.budi.ariyanto at gmail.com>
 */
@Entity
@Table(name = "actor")
public class Actor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actor_actor_id_seq")
    @SequenceGenerator(name = "actor_actor_id_seq", sequenceName = "actor_actor_id_seq", initialValue = 1, allocationSize = 1)
    private Integer actor_id;
    
    private String first_name;
    
    private String last_name;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date last_update;

    public Integer getActor_id() {
        return actor_id;
    }

    public void setActor_id(Integer actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
