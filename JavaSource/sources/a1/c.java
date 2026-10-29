package a1;

import android.os.Trace;

/* compiled from: MyApplication */
abstract class c {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
