package ai.nirmal.voiceagent.livekit;

import ai.nirmal.voiceagent.TokenGenerator;
import ai.nirmal.voiceagent.config.EnvConfig;

public class LiveKitService {

    private static final String ROOM_NAME = "test-room";
    private static final String AGENT_IDENTITY = "java-agent";

    public String createAgentToken() {

        return TokenGenerator.generate(
                EnvConfig.API_KEY,
                EnvConfig.API_SECRET,
                ROOM_NAME,
                AGENT_IDENTITY
        );
    }

    public String getRoomName() {
        return ROOM_NAME;
    }

    public String getAgentIdentity() {
        return AGENT_IDENTITY;
    }
}