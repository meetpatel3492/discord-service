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

    @GetMapping(value = "/v1/mock/orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAllOrders(){
        return ResponseEntity.ok("{\n" +
                "    \"content\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"farmerUserName\": \"meet_patel_1688866452569\",\n" +
                "            \"supplierUserName\": \"mit_shah_1688866455835\",\n" +
                "            \"charges\": [\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 2000.00,\n" +
                "                    \"rate\": 4.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"STOCK_WEIGHT\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 5.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"C_CLASS_WEIGHT\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 5.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"STOCK_WEIGHT\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"emptyBoxes\": [\n" +
                "                {\n" +
                "                    \"brand\": \"Samsung\",\n" +
                "                    \"size\": 20.00,\n" +
                "                    \"weight\": 1500.00,\n" +
                "                    \"numberOfBoxes\": 35.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 15.40,\n" +
                "                    \"totalAmount\": 0.00\n" +
                "                },\n" +
                "                {\n" +
                "                    \"brand\": \"Del Monte\",\n" +
                "                    \"size\": 20.00,\n" +
                "                    \"weight\": 1500.00,\n" +
                "                    \"numberOfBoxes\": 35.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 15.40,\n" +
                "                    \"totalAmount\": 0.00\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"farmerUserName\": \"meet_patel_1688866452569\",\n" +
                "            \"supplierUserName\": \"mit_shah_1688866455835\",\n" +
                "            \"charges\": [\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 2000.00,\n" +
                "                    \"rate\": 4.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"STOCK_WEIGHT\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 5.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"C_CLASS_WEIGHT\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 5.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"STOCK_WEIGHT\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"emptyBoxes\": [\n" +
                "                {\n" +
                "                    \"brand\": \"Samsung\",\n" +
                "                    \"size\": 20.00,\n" +
                "                    \"weight\": 1500.00,\n" +
                "                    \"numberOfBoxes\": 35.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 15.40,\n" +
                "                    \"totalAmount\": 0.00\n" +
                "                },\n" +
                "                {\n" +
                "                    \"brand\": \"Del Monte\",\n" +
                "                    \"size\": 20.00,\n" +
                "                    \"weight\": 1500.00,\n" +
                "                    \"numberOfBoxes\": 35.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 15.40,\n" +
                "                    \"totalAmount\": 0.00\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 52,\n" +
                "            \"farmerUserName\": \"meet_patel_1688866452569\",\n" +
                "            \"supplierUserName\": \"mit_shah_1688866455835\",\n" +
                "            \"charges\": [],\n" +
                "            \"emptyBoxes\": []\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 102,\n" +
                "            \"farmerUserName\": \"meet_patel_1688866452569\",\n" +
                "            \"supplierUserName\": \"mit_shah_1688866455835\",\n" +
                "            \"charges\": [\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 2000.00,\n" +
                "                    \"rate\": 4.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"STOCK_WEIGHT\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 5.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"C_CLASS_WEIGHT\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 5.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"STOCK_WEIGHT\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"emptyBoxes\": []\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 103,\n" +
                "            \"farmerUserName\": \"meet_patel_1688866452569\",\n" +
                "            \"supplierUserName\": \"mit_shah_1688866455835\",\n" +
                "            \"charges\": [],\n" +
                "            \"emptyBoxes\": []\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 104,\n" +
                "            \"farmerUserName\": \"meet_patel_1688866452569\",\n" +
                "            \"supplierUserName\": \"mit_shah_1688866455835\",\n" +
                "            \"charges\": [],\n" +
                "            \"emptyBoxes\": [\n" +
                "                {\n" +
                "                    \"brand\": \"Samsung\",\n" +
                "                    \"size\": 20.00,\n" +
                "                    \"weight\": 1500.00,\n" +
                "                    \"numberOfBoxes\": 35.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 15.40,\n" +
                "                    \"totalAmount\": 0.00\n" +
                "                },\n" +
                "                {\n" +
                "                    \"brand\": \"Del Monte\",\n" +
                "                    \"size\": 20.00,\n" +
                "                    \"weight\": 1500.00,\n" +
                "                    \"numberOfBoxes\": 35.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 15.40,\n" +
                "                    \"totalAmount\": 0.00\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 105,\n" +
                "            \"farmerUserName\": \"meet_patel_1688866452569\",\n" +
                "            \"supplierUserName\": \"mit_shah_1688866455835\",\n" +
                "            \"charges\": [\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 2000.00,\n" +
                "                    \"rate\": 4.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"STOCK_WEIGHT\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 5.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"C_CLASS_WEIGHT\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"numberOfBoxes\": 10.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 5.00,\n" +
                "                    \"totalAmount\": 0.00,\n" +
                "                    \"chargeType\": \"STOCK_WEIGHT\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"emptyBoxes\": [\n" +
                "                {\n" +
                "                    \"brand\": \"Samsung\",\n" +
                "                    \"size\": 20.00,\n" +
                "                    \"weight\": 1500.00,\n" +
                "                    \"numberOfBoxes\": 35.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 15.40,\n" +
                "                    \"totalAmount\": 0.00\n" +
                "                },\n" +
                "                {\n" +
                "                    \"brand\": \"Del Monte\",\n" +
                "                    \"size\": 20.00,\n" +
                "                    \"weight\": 1500.00,\n" +
                "                    \"numberOfBoxes\": 35.00,\n" +
                "                    \"netWeight\": 1000.00,\n" +
                "                    \"rate\": 15.40,\n" +
                "                    \"totalAmount\": 0.00\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"pageable\": {\n" +
                "        \"sort\": {\n" +
                "            \"empty\": true,\n" +
                "            \"sorted\": false,\n" +
                "            \"unsorted\": true\n" +
                "        },\n" +
                "        \"offset\": 0,\n" +
                "        \"pageNumber\": 0,\n" +
                "        \"pageSize\": 10,\n" +
                "        \"paged\": true,\n" +
                "        \"unpaged\": false\n" +
                "    },\n" +
                "    \"totalPages\": 1,\n" +
                "    \"totalElements\": 7,\n" +
                "    \"last\": true,\n" +
                "    \"size\": 10,\n" +
                "    \"number\": 0,\n" +
                "    \"sort\": {\n" +
                "        \"empty\": true,\n" +
                "        \"sorted\": false,\n" +
                "        \"unsorted\": true\n" +
                "    },\n" +
                "    \"numberOfElements\": 7,\n" +
                "    \"first\": true,\n" +
                "    \"empty\": false\n" +
                "}");
    }
}
