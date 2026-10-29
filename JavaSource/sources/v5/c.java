package v5;

import android.os.Trace;

/* compiled from: MyApplication */
public abstract class c {
    public static void a() {
        Trace.endSection();
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }
}
