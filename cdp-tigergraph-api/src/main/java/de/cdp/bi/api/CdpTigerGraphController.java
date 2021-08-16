package de.cdp.bi.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class CdpTigerGraphController {


    @GetMapping("/{userData}")
    public String getUserData() {
        return null;
    }
}
