package s2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import k2.t;

/* compiled from: MyApplication */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f26069a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    private List f26070b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f26071c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f26072d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f26073e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f26074f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private final List f26075g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f26076h = -1;

    /* renamed from: i, reason: collision with root package name */
    private String f26077i = null;

    /* renamed from: j, reason: collision with root package name */
    private final List f26078j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f26079k = 60000;

    /* renamed from: l, reason: collision with root package name */
    private final int f26080l = t.b.DEFAULT.c();

    /* renamed from: m, reason: collision with root package name */
    private long f26081m = 0;

    public final b5 a() {
        Bundle bundle = this.f26069a;
        Bundle bundle2 = this.f26073e;
        List list = this.f26070b;
        boolean z7 = this.f26071c;
        int i7 = this.f26072d;
        int i8 = this.f26076h;
        String str = this.f26077i;
        List list2 = this.f26078j;
        int i9 = this.f26080l;
        return new b5(8, -1L, bundle, -1, list, z7, i7, false, null, null, null, null, bundle2, this.f26074f, this.f26075g, null, null, false, null, i8, str, list2, this.f26079k, null, i9, this.f26081m, 0L);
    }

    public final c5 b(Bundle bundle) {
        this.f26069a = bundle;
        return this;
    }

    public final c5 c(List list) {
        this.f26070b = list;
        return this;
    }

    public final c5 d(boolean z7) {
        this.f26071c = z7;
        return this;
    }

    public final c5 e(int i7) {
        this.f26072d = i7;
        return this;
    }

    public final c5 f(int i7) {
        this.f26076h = i7;
        return this;
    }

    public final c5 g(String str) {
        this.f26077i = str;
        return this;
    }

    public final c5 h(int i7) {
        this.f26079k = i7;
        return this;
    }

    public final c5 i(long j7) {
        this.f26081m = j7;
        return this;
    }
}
