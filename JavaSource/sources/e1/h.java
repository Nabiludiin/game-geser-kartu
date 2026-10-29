package e1;

import java.util.List;

/* compiled from: MyApplication */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23166a = j.f("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).newInstance();
        } catch (Exception e8) {
            j.c().b(f23166a, "Trouble instantiating + " + str, e8);
            return null;
        }
    }

    public abstract androidx.work.b b(List list);
}
