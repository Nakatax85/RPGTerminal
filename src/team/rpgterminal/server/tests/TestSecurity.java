package team.rpgterminal.server.tests;

import team.rpgterminal.server.tools.Security;

public class TestSecurity {

    public static void main(String[] args) {

        TestSecurity test = new TestSecurity();

        test.assertCondition("Hostname is valid: ", test.testOne());
        test.assertCondition("Port is valid: ", test.testTwo());
        test.assertCondition("Hash is valid: ", test.testThree());

    }

    /**
     * Test whether or not the hostname is valid
     *
     * if any of the tests go wrong then the method validateHostname should be refactored
     *
     * @return boolean
     */
    public boolean testOne() {

        String hostname = "192.168.0.1";

        if(!Security.validateHostname(hostname)) {
            assertCondition(hostname + " is valid: ", false);
            return false;
        }

        hostname = "127.0.0.1";
        if(!Security.validateHostname(hostname)) {
            assertCondition(hostname + " is valid: ", false);
            return false;
        }

        hostname = "10.10.10.10";
        if(!Security.validateHostname(hostname)) {
            assertCondition(hostname + " is valid: ", false);
            return false;
        }

        hostname = "localhost";
        if(!Security.validateHostname(hostname)) {
            assertCondition(hostname + " is valid: ", false);
            return false;
        }

        return true;
    }

    /**
     * Test whether or not the port number is valid
     *
     * if any of these tests go wrong then the method validatePort should be refactored
     *
     * @return
     */
    public boolean testTwo() {

        if(Security.validatePort("")) {
            return false;
        }

        if(Security.validatePort("aabbcc")) {
            return false;
        }

        if(Security.validatePort("124124")) {
            return false;
        }

        if(!Security.validatePort("6969")) {
            return false;
        }

        if(Security.validatePort("0")) {
            return false;
        }

        if(Security.validatePort("-1124")) {
            return false;
        }

        if(!Security.validatePort("1000")) {
            return false;
        }

        return true;
    }

    public boolean testThree() {

        String hashedPass = Security.hashPassword("123456789");
        if(!(hashedPass.equals(Security.hashPassword("123456789")))) {
            return false;
        }



        return true;
    }

    private void assertCondition(String message, boolean value) {
        System.out.println(message + (value ? "OK" : "FAIL"));
    }
}
