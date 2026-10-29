package e1;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public abstract class t {
    protected t() {
    }

    public static t d(Context context) {
        return f1.j.k(context);
    }

    public static void e(Context context, androidx.work.a aVar) {
        f1.j.e(context, aVar);
    }

    public abstract m a(String str);

    public final m b(u uVar) {
        return c(Collections.singletonList(uVar));
    }

    public abstract m c(List list);
}
