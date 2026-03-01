package ai.nirmal.voiceagent;

import io.livekit.server.AccessToken;
import io.livekit.server.RoomJoin;
import io.livekit.server.RoomName;

public class TokenGenerator {

    public static String generate(
            String apiKey,
            String apiSecret,
            String room,
            String identity) {

        AccessToken token = new AccessToken(apiKey, apiSecret);

        token.setIdentity(identity);

        // permission to join room
        token.addGrants(
                new RoomJoin(true),
                new RoomName(room)
        );

        return token.toJwt();
    }
}