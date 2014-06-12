package org.eksplorasi.web.controller;

import java.util.List;
import org.eksplorasi.domain.Actor;
import org.eksplorasi.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/actor")
public class ActorController {
	
	@Autowired ActorService actorService;
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	@ResponseBody
	public Actor getActorByFirstName(@PathVariable String firstName) {
            Actor actor = actorService.findByFirstName(firstName);
            return actor;
	}
        
        @RequestMapping(value="/all", method = RequestMethod.GET)
        @ResponseBody
        public List<Actor> getAllBukuUjian() {
            List<Actor> actors = actorService.findAll();
            return actors;
        }
}
