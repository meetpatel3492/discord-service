package ca.itorion.discordbot.service;

import ca.itorion.discordbot.model.DiscordMessageRequest;
import reactor.core.publisher.Mono;

public interface DiscordService {
    Mono<String> sendMessage(DiscordMessageRequest content);
}
