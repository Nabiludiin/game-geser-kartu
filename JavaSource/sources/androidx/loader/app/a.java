package androidx.loader.app;

import androidx.lifecycle.k;
import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: MyApplication */
public abstract class a {
    public static a b(k kVar) {
        return new b(kVar, ((z) kVar).h());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
