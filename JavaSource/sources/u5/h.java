package u5;

import android.content.Context;
import f5.r;

/* compiled from: MyApplication */
public abstract class h {

    /* compiled from: MyApplication */
    public interface a {
        String a(Object obj);
    }

    public static f5.c b(String str, String str2) {
        return f5.c.l(f.a(str, str2), f.class);
    }

    public static f5.c c(final String str, final a aVar) {
        return f5.c.m(f.class).b(r.i(Context.class)).e(new f5.h() { // from class: u5.g
            @Override // f5.h
            public final Object a(f5.e eVar) {
                f a8;
                a8 = f.a(str, aVar.a((Context) eVar.a(Context.class)));
                return a8;
            }
        }).c();
    }
}
