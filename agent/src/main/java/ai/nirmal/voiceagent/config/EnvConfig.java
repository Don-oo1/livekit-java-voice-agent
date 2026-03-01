package ai.nirmal.voiceagent.config;


public class EnvConfig {

    public static String LIVEKIT_URL =
            System.getenv("LIVEKIT_URL");

    public static String API_KEY =
            System.getenv("LIVEKIT_API_KEY");

    public static String API_SECRET =
            System.getenv("LIVEKIT_API_SECRET");
}