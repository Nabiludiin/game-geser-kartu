package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: MyApplication */
public abstract class ActivityResultRegistry {

    /* renamed from: a, reason: collision with root package name */
    private Random f139a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private final Map f140b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f141c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f142d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    ArrayList f143e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    final transient Map f144f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    final Map f145g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    final Bundle f146h = new Bundle();

    /* compiled from: MyApplication */
    class a extends androidx.activity.result.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f151a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f152b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e.a f153c;

        a(String str, int i7, e.a aVar) {
            this.f151a = str;
            this.f152b = i7;
            this.f153c = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, androidx.core.app.c cVar) {
            ActivityResultRegistry.this.f143e.add(this.f151a);
            Integer num = (Integer) ActivityResultRegistry.this.f141c.get(this.f151a);
            ActivityResultRegistry.this.f(num != null ? num.intValue() : this.f152b, this.f153c, obj, cVar);
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f151a);
        }
    }

    /* compiled from: MyApplication */
    class b extends androidx.activity.result.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f156b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e.a f157c;

        b(String str, int i7, e.a aVar) {
            this.f155a = str;
            this.f156b = i7;
            this.f157c = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, androidx.core.app.c cVar) {
            ActivityResultRegistry.this.f143e.add(this.f155a);
            Integer num = (Integer) ActivityResultRegistry.this.f141c.get(this.f155a);
            ActivityResultRegistry.this.f(num != null ? num.intValue() : this.f156b, this.f157c, obj, cVar);
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f155a);
        }
    }

    /* compiled from: MyApplication */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final androidx.activity.result.b f159a;

        /* renamed from: b, reason: collision with root package name */
        final e.a f160b;

        c(androidx.activity.result.b bVar, e.a aVar) {
            this.f159a = bVar;
            this.f160b = aVar;
        }
    }

    /* compiled from: MyApplication */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final g f161a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f162b = new ArrayList();

        d(g gVar) {
            this.f161a = gVar;
        }

        void a(i iVar) {
            this.f161a.a(iVar);
            this.f162b.add(iVar);
        }

        void b() {
            ArrayList arrayList = this.f162b;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                this.f161a.c((i) obj);
            }
            this.f162b.clear();
        }
    }

    private void a(int i7, String str) {
        this.f140b.put(Integer.valueOf(i7), str);
        this.f141c.put(str, Integer.valueOf(i7));
    }

    private void d(String str, int i7, Intent intent, c cVar) {
        androidx.activity.result.b bVar;
        if (cVar != null && (bVar = cVar.f159a) != null) {
            bVar.a(cVar.f160b.c(i7, intent));
        } else {
            this.f145g.remove(str);
            this.f146h.putParcelable(str, new androidx.activity.result.a(i7, intent));
        }
    }

    private int e() {
        int nextInt = this.f139a.nextInt(2147418112);
        while (true) {
            int i7 = nextInt + 65536;
            if (!this.f140b.containsKey(Integer.valueOf(i7))) {
                return i7;
            }
            nextInt = this.f139a.nextInt(2147418112);
        }
    }

    private int k(String str) {
        Integer num = (Integer) this.f141c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int e8 = e();
        a(e8, str);
        return e8;
    }

    public final boolean b(int i7, int i8, Intent intent) {
        String str = (String) this.f140b.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        this.f143e.remove(str);
        d(str, i8, intent, (c) this.f144f.get(str));
        return true;
    }

    public final boolean c(int i7, Object obj) {
        androidx.activity.result.b bVar;
        String str = (String) this.f140b.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        this.f143e.remove(str);
        c cVar = (c) this.f144f.get(str);
        if (cVar != null && (bVar = cVar.f159a) != null) {
            bVar.a(obj);
            return true;
        }
        this.f146h.remove(str);
        this.f145g.put(str, obj);
        return true;
    }

    public abstract void f(int i7, e.a aVar, Object obj, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f143e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f139a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f146h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
            String str = stringArrayList.get(i7);
            if (this.f141c.containsKey(str)) {
                Integer num = (Integer) this.f141c.remove(str);
                if (!this.f146h.containsKey(str)) {
                    this.f140b.remove(num);
                }
            }
            a(integerArrayList.get(i7).intValue(), stringArrayList.get(i7));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f141c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f141c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f143e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f146h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f139a);
    }

    public final androidx.activity.result.c i(final String str, k kVar, final e.a aVar, final androidx.activity.result.b bVar) {
        g t7 = kVar.t();
        if (t7.b().c(g.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + kVar + " is attempting to register while current state is " + t7.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        int k7 = k(str);
        d dVar = (d) this.f142d.get(str);
        if (dVar == null) {
            dVar = new d(t7);
        }
        dVar.a(new i() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.i
            public void c(k kVar2, g.b bVar2) {
                if (!g.b.ON_START.equals(bVar2)) {
                    if (g.b.ON_STOP.equals(bVar2)) {
                        ActivityResultRegistry.this.f144f.remove(str);
                        return;
                    } else {
                        if (g.b.ON_DESTROY.equals(bVar2)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f144f.put(str, new c(bVar, aVar));
                if (ActivityResultRegistry.this.f145g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f145g.get(str);
                    ActivityResultRegistry.this.f145g.remove(str);
                    bVar.a(obj);
                }
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) ActivityResultRegistry.this.f146h.getParcelable(str);
                if (aVar2 != null) {
                    ActivityResultRegistry.this.f146h.remove(str);
                    bVar.a(aVar.c(aVar2.f(), aVar2.a()));
                }
            }
        });
        this.f142d.put(str, dVar);
        return new a(str, k7, aVar);
    }

    public final androidx.activity.result.c j(String str, e.a aVar, androidx.activity.result.b bVar) {
        int k7 = k(str);
        this.f144f.put(str, new c(bVar, aVar));
        if (this.f145g.containsKey(str)) {
            Object obj = this.f145g.get(str);
            this.f145g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f146h.getParcelable(str);
        if (aVar2 != null) {
            this.f146h.remove(str);
            bVar.a(aVar.c(aVar2.f(), aVar2.a()));
        }
        return new b(str, k7, aVar);
    }

    final void l(String str) {
        Integer num;
        if (!this.f143e.contains(str) && (num = (Integer) this.f141c.remove(str)) != null) {
            this.f140b.remove(num);
        }
        this.f144f.remove(str);
        if (this.f145g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f145g.get(str));
            this.f145g.remove(str);
        }
        if (this.f146h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f146h.getParcelable(str));
            this.f146h.remove(str);
        }
        d dVar = (d) this.f142d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f142d.remove(str);
        }
    }
}
