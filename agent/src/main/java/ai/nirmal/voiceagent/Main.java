package ai.nirmal.voiceagent;

import ai.nirmal.voiceagent.livekit.LiveKitService;

public class Main {

    public static void main(String[] args) {

        LiveKitService service = new LiveKitService();

        String token = service.createAgentToken();

        System.out.println("Room: " + service.getRoomName());
        System.out.println("Agent: " + service.getAgentIdentity());
        System.out.println("Token: " + token);
    }
}