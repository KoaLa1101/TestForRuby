public class RubyTask {

    public static String printNumbers(int n) {
        String str = "1";
        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (int i = 1; i < n; i++) {
            str = swap(str);
            sb.append(str);
            System.out.println(str);
        }
        return sb.toString();
    }

    private static String swap(String str) {
        int index = 0;
        int val;
        StringBuilder sb = new StringBuilder();
        while (index < str.length()) {
            val = 0;
            char c = str.charAt(index);
            while (c == str.charAt(index)) {
                index++;
                val++;
                if (index == str.length())
                    break;
            }
            sb.append(val);
            sb.append(c);
        }
        return sb.toString();
    }
}
