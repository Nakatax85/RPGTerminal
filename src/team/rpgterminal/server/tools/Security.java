package team.rpgterminal.server.tools;

public final class Security {

    public static boolean validateHostname(String hostname) {
        String regex = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

        if(hostname.equals("localhost")) {
            return true;
        }

        if(hostname.matches(regex)) {
            return true;
        }

        return false;
    }

    public static final boolean validatePort(String port) {

        try {

            if(Integer.parseInt(port) < 1 && Integer.parseInt(port) > 65535) {
                return false;
            }

            return true;

        } catch (IllegalArgumentException iae) {
            return false;
        }

    }

}
