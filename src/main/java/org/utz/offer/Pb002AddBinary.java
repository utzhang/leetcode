package org.utz.offer;

public class Pb002AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder rs = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            int digitA = i < a.length() ? a.charAt(a.length() - i - 1) - '0' : 0;
            int digitB = i < b.length() ? b.charAt(b.length() - i - 1) - '0' : 0;
            int sum = (digitA + digitB + carry) & 1;
            carry = (digitA + digitB + carry) >> 1;
            rs.append(sum);
        }

        if (carry > 0) {
            rs.append(carry);
        }
        return rs.reverse().toString();
    }
}
