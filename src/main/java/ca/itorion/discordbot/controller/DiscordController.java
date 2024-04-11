package ca.itorion.discordbot.controller;

import ca.itorion.discordbot.model.DiscordMessageRequest;
import ca.itorion.discordbot.service.DiscordService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@Slf4j
public class DiscordController {

    private final DiscordService discordService;

    @PostMapping(value = "/api/v1/discord/message", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> getDiscordConfig(@RequestBody DiscordMessageRequest request) {
        return discordService.sendMessage(request);
    }

