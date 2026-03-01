package ai.nirmal.voiceagent.agent;

import ai.nirmal.voiceagent.livekit.LiveKitService;

public class VoiceAgent {

    private final LiveKitService liveKitService;

    public VoiceAgent(LiveKitService liveKitService) {
        this.liveKitService = liveKitService;
    }

    public void start() {

        System.out.println("Starting Voice Agent...");

        String token = liveKitService.createAgentToken();

        System.out.println("Connecting to LiveKit room...");
        System.out.println("Room: " + liveKitService.getRoomName());
        System.out.println("Identity: " + liveKitService.getAgentIdentity());

        // later:
        // connect to room
        // listen audio
        // respond audio

        System.out.println("Agent ready.");
    }
}