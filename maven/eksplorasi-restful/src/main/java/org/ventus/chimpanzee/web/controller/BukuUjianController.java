package org.ventus.chimpanzee.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ventus.chimpanzee.domain.BukuUjianEntity;
import org.ventus.chimpanzee.service.BukuUjianService;

@Controller
@RequestMapping("/bukuUjian")
public class BukuUjianController {
	
	@Autowired BukuUjianService bukuUjianService;
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	@ResponseBody
	public BukuUjianEntity getBukuUjian(@PathVariable String name) {
            BukuUjianEntity bukuUjianEntity = bukuUjianService.findByName(name);
            return bukuUjianEntity;
	}
        
        @RequestMapping(value="/all", method = RequestMethod.GET)
        @ResponseBody
        public List<BukuUjianEntity> getAllBukuUjian() {
            List<BukuUjianEntity> bukuUjianEntities = bukuUjianService.findAll();
            return bukuUjianEntities;
        }
}
