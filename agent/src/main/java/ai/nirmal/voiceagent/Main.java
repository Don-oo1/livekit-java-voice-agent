package ai.nirmal.voiceagent;

import ai.nirmal.voiceagent.agent.VoiceAgent;
import ai.nirmal.voiceagent.livekit.LiveKitService;

public class Main {

    public static void main(String[] args) {

        LiveKitService service = new LiveKitService();

        VoiceAgent agent = new VoiceAgent(service);

        agent.start();
    }
}