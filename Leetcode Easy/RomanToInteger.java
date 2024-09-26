public class RomanToInteger {

    public static int romanToInt(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'M')
                ans += 1000;
            if (c == 'D')
                ans += 500;
            if (c == 'L')
                ans += 50;
            if (c == 'V')
                ans += 5;
            if (c == 'I') {
                if (i != s.length() - 1) {
                    char d = s.charAt(i + 1);
                    if (d == 'V') {
                        ans += 4;
                        i++;
                    } else if (d == 'X') {
                        ans += 9;
                        i++;
                    } else {
                        ans += 1;
                    }
                } else
                    ans += 1;
            }
            if (c == 'X') {
                if (i != s.length() - 1) {
                    char d = s.charAt(i + 1);
                    if (d == 'L') {
                        ans += 40;
                        i++;
                    } else if (d == 'C') {
                        ans += 90;
                        i++;
                    } else {
                        ans += 10;
                    }
                } else
                    ans += 10;
            }
            if (c == 'C') {
                if (i != s.length() - 1) {
                    char d = s.charAt(i + 1);
                    if (d == 'D') {
                        ans += 400;
                        i++;
                    } else if (d == 'M') {
                        ans += 900;
                        i++;
                    } else {
                        ans += 100;
                    }
                } else
                    ans += 100;
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        String input = "IX";
        int ans = romanToInt(input);
        System.out.println(input + " in roman is " + ans + " in Integer");

    }

}
