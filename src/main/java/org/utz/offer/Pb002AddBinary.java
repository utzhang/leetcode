package org.utz.offer;

public class Pb002AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            int digitA = i < a.length() ? a.charAt(a.length() - i - 1) - '0' : 0;
            int digitB = i < b.length() ? b.charAt(b.length() - i - 1) - '0' : 0;
            int cur = (digitA + digitB + carry) % 2;
            sb.append(cur);
            carry = (digitA + digitB + carry) / 2;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
