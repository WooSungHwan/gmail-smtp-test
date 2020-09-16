package com.mail.test.controller;

import com.mail.test.dto.MailDto;
import com.mail.test.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MailController {
    private final MailService mailService;

    @GetMapping("/mail")
    public String dispMail() {
        return "mail";
    }

    @PostMapping("/mail")
    public void execMail(MailDto mailDto) {
        long start = System.currentTimeMillis();
        // mailService.mailSend(mailDto);
        mailService.sendEmail(mailDto);
        System.out.println(System.currentTimeMillis() - start);
    }
}
