package q4;

/* compiled from: MyApplication */
public abstract class v {
    public static String a(int i7) {
        if (i7 == 0) {
            return "DAILY";
        }
        if (i7 == 1) {
            return "WEEKLY";
        }
        if (i7 == 2) {
            return "ALL_TIME";
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Unknown time span ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }
}
