package androidx.room;

import android.content.Context;
import androidx.room.h;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import x0.c;

/* compiled from: MyApplication */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final c.InterfaceC0143c f2701a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2702b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2703c;

    /* renamed from: d, reason: collision with root package name */
    public final h.d f2704d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2705e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2706f;

    /* renamed from: g, reason: collision with root package name */
    public final h.c f2707g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f2708h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f2709i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2710j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2711k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2712l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f2713m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2714n;

    /* renamed from: o, reason: collision with root package name */
    public final File f2715o;

    public a(Context context, String str, c.InterfaceC0143c interfaceC0143c, h.d dVar, List list, boolean z7, h.c cVar, Executor executor, Executor executor2, boolean z8, boolean z9, boolean z10, Set set, String str2, File file) {
        this.f2701a = interfaceC0143c;
        this.f2702b = context;
        this.f2703c = str;
        this.f2704d = dVar;
        this.f2705e = list;
        this.f2706f = z7;
        this.f2707g = cVar;
        this.f2708h = executor;
        this.f2709i = executor2;
        this.f2710j = z8;
        this.f2711k = z9;
        this.f2712l = z10;
        this.f2713m = set;
        this.f2714n = str2;
        this.f2715o = file;
    }

    public boolean a(int i7, int i8) {
        Set set;
        return (i7 <= i8 || !this.f2712l) && this.f2711k && ((set = this.f2713m) == null || !set.contains(Integer.valueOf(i7)));
    }
}
