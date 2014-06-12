/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eksplorasi.service;

import java.util.List;
import org.eksplorasi.domain.Actor;

/**
 *
 * @author Budi Ariyanto <fx.budi.ariyanto at gmail.com>
 */
public interface ActorService {
        void save(Actor actor);
	void edit(Actor actor);
	void delete(Actor actor);
	List findAll();
	Actor findByFirstName(String firstName);
}
