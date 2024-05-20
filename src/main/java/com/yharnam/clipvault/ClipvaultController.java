package com.yharnam.clipvault;

import com.yharnam.clipvault.service.TwitchResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClipvaultController {
    private static final Logger logger = LoggerFactory.getLogger(ClipvaultController.class);

    @GetMapping("/clips")
    public String getClipsResponse() {
        logger.info("Handling request to retrieve clips data");
        String clipsData = TwitchResource.getClipsResponse().body();
        logger.debug("Received clips data: {}", clipsData);
        return clipsData;
    }
}
