package p2p.utils;

import java.security.SecureRandom;

public class UploadUtils {
    public static int generatecode() {
        int DYNAMIC_STARTING_PORT =49152;
        int DYNAMIC_ENDING_PORT = 61192;

        SecureRandom random =new SecureRandom();
        return random.nextInt((DYNAMIC_ENDING_PORT - DYNAMIC_STARTING_PORT) +DYNAMIC_STARTING_PORT);
    }


    public static int generateCode() {

        return 0;
    }
}
