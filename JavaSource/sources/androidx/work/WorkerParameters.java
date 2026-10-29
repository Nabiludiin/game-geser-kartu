package androidx.work;

import android.net.Network;
import e1.f;
import e1.o;
import e1.v;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    private UUID f2954a;

    /* renamed from: b, reason: collision with root package name */
    private b f2955b;

    /* renamed from: c, reason: collision with root package name */
    private Set f2956c;

    /* renamed from: d, reason: collision with root package name */
    private a f2957d;

    /* renamed from: e, reason: collision with root package name */
    private int f2958e;

    /* renamed from: f, reason: collision with root package name */
    private Executor f2959f;

    /* renamed from: g, reason: collision with root package name */
    private o1.a f2960g;

    /* renamed from: h, reason: collision with root package name */
    private v f2961h;

    /* renamed from: i, reason: collision with root package name */
    private o f2962i;

    /* renamed from: j, reason: collision with root package name */
    private f f2963j;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List f2964a;

        /* renamed from: b, reason: collision with root package name */
        public List f2965b;

        /* renamed from: c, reason: collision with root package name */
        public Network f2966c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f2964a = list;
            this.f2965b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i7, Executor executor, o1.a aVar2, v vVar, o oVar, f fVar) {
        this.f2954a = uuid;
        this.f2955b = bVar;
        this.f2956c = new HashSet(collection);
        this.f2957d = aVar;
        this.f2958e = i7;
        this.f2959f = executor;
        this.f2960g = aVar2;
        this.f2961h = vVar;
        this.f2962i = oVar;
        this.f2963j = fVar;
    }

    public Executor a() {
        return this.f2959f;
    }

    public f b() {
        return this.f2963j;
    }

    public UUID c() {
        return this.f2954a;
    }

    public b d() {
        return this.f2955b;
    }

    public Network e() {
        return this.f2957d.f2966c;
    }

    public o f() {
        return this.f2962i;
    }

    public int g() {
        return this.f2958e;
    }

    public Set h() {
        return this.f2956c;
    }

    public o1.a i() {
        return this.f2960g;
    }

    public List j() {
        return this.f2957d.f2964a;
    }

    public List k() {
        return this.f2957d.f2965b;
    }

    public v l() {
        return this.f2961h;
    }
}
