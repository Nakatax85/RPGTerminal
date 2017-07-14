package team.rpgterminal.server.tools;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Security helper class that has some essential methods to validate hostname and port and a method to hash a password
 *
 * @author H4x0R
 * @see <a href="joaowritecode.github.io">H4x0R Github</a>
 */
public final class Security {

    /**
     * Validate a given hostname
     * if the hostname equals localhost then it is a valid hostname
     *
     * @param hostname
     * @return boolean
     */
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

    /**
     * Validate a given port
     * to be a valid port number it should be 0 < port < 65536
     *
     * if the port is not a valid number port it will throw an exception in the form of a boolean false,
     * it means it's not a valid port number
     *
     * @param port
     * @return boolean
     */
    public static boolean validatePort(String port) {

        try {

            return (Integer.parseInt(port) > 0 && Integer.parseInt(port) < 65536);

        } catch (IllegalArgumentException iae) {
            return false;
        }

    }

    /**
     * Password will be encrypted using an encryption algorithm on the client side,
     * just sow it comes protected.
     *
     * When Server receives the client login information,
     * it encrypts the hash of the password received again with a different encryption algorithm.
     *
     * @param password
     * @return doubleHashedPassword
     */
    public static String hashPassword(String password) throws IOException, NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());

        byte byteData[] = md.digest();

        StringBuffer hexString = new StringBuffer();
        for (int i=0;i<byteData.length;i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }

}
