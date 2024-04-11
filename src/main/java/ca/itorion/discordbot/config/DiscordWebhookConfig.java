package ca.itorion.discordbot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "discord.webhook.*")
@Data
public class DiscordWebhookConfig {
    private String url;
    private String id;
    private String token;
}
