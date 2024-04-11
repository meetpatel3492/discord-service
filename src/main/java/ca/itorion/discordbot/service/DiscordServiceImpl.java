package ca.itorion.discordbot.service;

import ca.itorion.discordbot.config.DiscordWebhookConfig;
import ca.itorion.discordbot.model.DiscordMessageRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@AllArgsConstructor
public class DiscordServiceImpl implements DiscordService {

    private final WebClient webClient;
    private final DiscordWebhookConfig discordWebhookConfig;

    public Mono<String> sendMessage(DiscordMessageRequest content) {
        log.info("Sending message to Discord");
        return webClient
                .post()
                .uri(String.format(discordWebhookConfig.getUrl(),
                        discordWebhookConfig.getId(),
                        discordWebhookConfig.getToken()))
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(content), DiscordMessageRequest.class)
                .retrieve()
                .bodyToMono(String.class);
    }
}
