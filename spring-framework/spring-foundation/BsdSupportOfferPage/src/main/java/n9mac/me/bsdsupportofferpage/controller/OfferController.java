package n9mac.me.bsdsupportofferpage.controller;

import lombok.extern.slf4j.Slf4j;
import n9mac.me.bsdsupportofferpage.model.SupportModel;
import n9mac.me.bsdsupportofferpage.model.SupportedOs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class OfferController {


    @GetMapping("/support-offer/show")
    public String showOfferList(Model model) {

        List<SupportedOs> osList = Arrays.asList(
                SupportedOs.builder()
                        .name("FreeBSD")
                        .version("13.0")
                        .shortDescription("Aims to be usable for any purpose.")
                        .support(SupportModel.REGULAR_PRICE).build(),
                SupportedOs.builder()
                        .name("OpenBSD")
                        .version("7.0")
                        .shortDescription("Aims for maximum correctness in code, bringing simplicity and security.")
                        .support(SupportModel.REGULAR_PRICE).build(),
                SupportedOs.builder()
                        .name("NetBSD")
                        .version("9.2")
                        .shortDescription("Aims for maximum portability.")
                        .support(SupportModel.REGULAR_PRICE).build());

        model.addAttribute("osList", osList);
        return "showOfferForm";
    }
}
