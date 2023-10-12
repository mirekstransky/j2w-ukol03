package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Members;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BusinessCardController {
  private final List<Members> listMembers = List.of(
          new Members("Tony","Tlustý","Springfieldská mafie",null,null,"tlusty.tony@gangster.com","893 095 111","www.tlustytony.com", "Šéf"),
          new Members("Frankie","Práskač","Springfieldská mafie","Greenside Drive 2201","Springfield","frankie.praskac@gangster.com","893 095 247","www.praskac.com", "Práskač"),
          new Members("Louie","Střelec","Springfieldská mafie","Greenside Drive 2201","Springfield","louie.strelec@gangster.com","893 095 147","www.strelec.com", "Gangster"),
          new Members("Johnny","Nemluva","Springfieldská mafie","Greenside Drive 2201","Springfield","johny.nemluva@gangster.com","893 095 369","www.nemluva.com", "Mluvčí"),
          new Members("Bill","Legs",null,null,null,null,null,null,null),
          new Members(null,"Bezejmenný","Springfieldská mafie","Greenside Drive 2201","Springfield","bezejmenny@gangster.com","893 095 111","www.bezejmenny.com", "Nic")
  );
  @GetMapping("/")
  public ModelAndView listOfMembers() {
    ModelAndView modelAndView = new ModelAndView("/index");
    modelAndView.addObject("member", listMembers);
    return modelAndView;
  }
  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("/detail");
    modelAndView.addObject("memberDetail", listMembers.get(id));
    modelAndView.addObject("memberNum", id);

    return modelAndView;
  }
}
