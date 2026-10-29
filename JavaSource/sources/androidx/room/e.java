package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: MyApplication */
public class e {

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f2720m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    final String[] f2722b;

    /* renamed from: c, reason: collision with root package name */
    private Map f2723c;

    /* renamed from: d, reason: collision with root package name */
    final h f2724d;

    /* renamed from: g, reason: collision with root package name */
    volatile x0.f f2727g;

    /* renamed from: h, reason: collision with root package name */
    private b f2728h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.room.d f2729i;

    /* renamed from: k, reason: collision with root package name */
    private f f2731k;

    /* renamed from: e, reason: collision with root package name */
    AtomicBoolean f2725e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f2726f = false;

    /* renamed from: j, reason: collision with root package name */
    final n.b f2730j = new n.b();

    /* renamed from: l, reason: collision with root package name */
    Runnable f2732l = new a();

    /* renamed from: a, reason: collision with root package name */
    final HashMap f2721a = new HashMap();

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        private Set a() {
            HashSet hashSet = new HashSet();
            Cursor p7 = e.this.f2724d.p(new x0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p7.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p7.getInt(0)));
                } catch (Throwable th) {
                    p7.close();
                    throw th;
                }
            }
            p7.close();
            if (!hashSet.isEmpty()) {
                e.this.f2727g.J();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                androidx.room.e r0 = androidx.room.e.this
                androidx.room.h r0 = r0.f2724d
                java.util.concurrent.locks.Lock r0 = r0.h()
                r1 = 0
                r0.lock()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 != 0) goto L18
                r0.unlock()
                return
            L18:
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f2725e     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 != 0) goto L28
                r0.unlock()
                return
            L28:
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.h r2 = r2.f2724d     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r2 = r2.k()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 == 0) goto L36
                r0.unlock()
                return
            L36:
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.h r2 = r2.f2724d     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r3 = r2.f2771g     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r3 == 0) goto L5f
                x0.c r2 = r2.i()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                x0.b r2 = r2.h0()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                r2.x()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L5a
                r2.X()     // Catch: java.lang.Throwable -> L5a
                r2.l0()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                goto L63
            L54:
                r1 = move-exception
                goto La1
            L56:
                r2 = move-exception
                goto L67
            L58:
                r2 = move-exception
                goto L67
            L5a:
                r3 = move-exception
                r2.l0()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                throw r3     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
            L5f:
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
            L63:
                r0.unlock()
                goto L6f
            L67:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L54
                goto L63
            L6f:
                if (r1 == 0) goto La0
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto La0
                androidx.room.e r0 = androidx.room.e.this
                n.b r0 = r0.f2730j
                monitor-enter(r0)
                androidx.room.e r2 = androidx.room.e.this     // Catch: java.lang.Throwable -> L9a
                n.b r2 = r2.f2730j     // Catch: java.lang.Throwable -> L9a
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9a
            L84:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L9a
                if (r3 == 0) goto L9c
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L9a
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L9a
                androidx.room.e$d r3 = (androidx.room.e.d) r3     // Catch: java.lang.Throwable -> L9a
                r3.a(r1)     // Catch: java.lang.Throwable -> L9a
                goto L84
            L9a:
                r1 = move-exception
                goto L9e
            L9c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
                goto La0
            L9e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
                throw r1
            La0:
                return
            La1:
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.e.a.run():void");
        }
    }

    /* compiled from: MyApplication */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final long[] f2734a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f2735b;

        /* renamed from: c, reason: collision with root package name */
        final int[] f2736c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2737d;

        /* renamed from: e, reason: collision with root package name */
        boolean f2738e;

        b(int i7) {
            long[] jArr = new long[i7];
            this.f2734a = jArr;
            boolean[] zArr = new boolean[i7];
            this.f2735b = zArr;
            this.f2736c = new int[i7];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                try {
                    if (this.f2737d && !this.f2738e) {
                        int length = this.f2734a.length;
                        int i7 = 0;
                        while (true) {
                            int i8 = 1;
                            if (i7 >= length) {
                                this.f2738e = true;
                                this.f2737d = false;
                                return this.f2736c;
                            }
                            boolean z7 = this.f2734a[i7] > 0;
                            boolean[] zArr = this.f2735b;
                            if (z7 != zArr[i7]) {
                                int[] iArr = this.f2736c;
                                if (!z7) {
                                    i8 = 2;
                                }
                                iArr[i7] = i8;
                            } else {
                                this.f2736c[i7] = 0;
                            }
                            zArr[i7] = z7;
                            i7++;
                        }
                    }
                    return null;
                } finally {
                }
            }
        }

        boolean b(int... iArr) {
            boolean z7;
            synchronized (this) {
                try {
                    z7 = false;
                    for (int i7 : iArr) {
                        long[] jArr = this.f2734a;
                        long j7 = jArr[i7];
                        jArr[i7] = 1 + j7;
                        if (j7 == 0) {
                            z7 = true;
                            this.f2737d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z7;
        }

        boolean c(int... iArr) {
            boolean z7;
            synchronized (this) {
                try {
                    z7 = false;
                    for (int i7 : iArr) {
                        long[] jArr = this.f2734a;
                        long j7 = jArr[i7];
                        jArr[i7] = j7 - 1;
                        if (j7 == 1) {
                            z7 = true;
                            this.f2737d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z7;
        }

        void d() {
            synchronized (this) {
                this.f2738e = false;
            }
        }
    }

    /* compiled from: MyApplication */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final String[] f2739a;

        public c(String[] strArr) {
            this.f2739a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        abstract boolean a();

        public abstract void b(Set set);
    }

    /* compiled from: MyApplication */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        final int[] f2740a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f2741b;

        /* renamed from: c, reason: collision with root package name */
        final c f2742c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f2743d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f2742c = cVar;
            this.f2740a = iArr;
            this.f2741b = strArr;
            if (iArr.length != 1) {
                this.f2743d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f2743d = Collections.unmodifiableSet(hashSet);
        }

        void a(Set set) {
            int length = this.f2740a.length;
            Set set2 = null;
            for (int i7 = 0; i7 < length; i7++) {
                if (set.contains(Integer.valueOf(this.f2740a[i7]))) {
                    if (length == 1) {
                        set2 = this.f2743d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f2741b[i7]);
                    }
                }
            }
            if (set2 != null) {
                this.f2742c.b(set2);
            }
        }

        void b(String[] strArr) {
            Set set = null;
            if (this.f2741b.length == 1) {
                int length = strArr.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    if (strArr[i7].equalsIgnoreCase(this.f2741b[0])) {
                        set = this.f2743d;
                        break;
                    }
                    i7++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f2741b;
                    int length2 = strArr2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length2) {
                            String str2 = strArr2[i8];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i8++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f2742c.b(set);
            }
        }
    }

    public e(h hVar, Map map, Map map2, String... strArr) {
        this.f2724d = hVar;
        this.f2728h = new b(strArr.length);
        this.f2723c = map2;
        this.f2729i = new androidx.room.d(hVar);
        int length = strArr.length;
        this.f2722b = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str = strArr[i7];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f2721a.put(lowerCase, Integer.valueOf(i7));
            String str2 = (String) map.get(strArr[i7]);
            if (str2 != null) {
                this.f2722b[i7] = str2.toLowerCase(locale);
            } else {
                this.f2722b[i7] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f2721a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap = this.f2721a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f2723c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) this.f2723c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(x0.b bVar, int i7) {
        bVar.D("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)");
        String str = this.f2722b[i7];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2720m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i7);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.D(sb.toString());
        }
    }

    private void k(x0.b bVar, int i7) {
        String str = this.f2722b[i7];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2720m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            bVar.D(sb.toString());
        }
    }

    public void a(c cVar) {
        d dVar;
        String[] h8 = h(cVar.f2739a);
        int[] iArr = new int[h8.length];
        int length = h8.length;
        for (int i7 = 0; i7 < length; i7++) {
            Integer num = (Integer) this.f2721a.get(h8[i7].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + h8[i7]);
            }
            iArr[i7] = num.intValue();
        }
        d dVar2 = new d(cVar, iArr, h8);
        synchronized (this.f2730j) {
            dVar = (d) this.f2730j.j(cVar, dVar2);
        }
        if (dVar == null && this.f2728h.b(iArr)) {
            l();
        }
    }

    boolean c() {
        if (!this.f2724d.o()) {
            return false;
        }
        if (!this.f2726f) {
            this.f2724d.i().h0();
        }
        if (this.f2726f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    void d(x0.b bVar) {
        synchronized (this) {
            try {
                if (this.f2726f) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    return;
                }
                bVar.D("PRAGMA temp_store = MEMORY;");
                bVar.D("PRAGMA recursive_triggers='ON';");
                bVar.D("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                m(bVar);
                this.f2727g = bVar.K("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f2726f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String... strArr) {
        synchronized (this.f2730j) {
            try {
                Iterator it = this.f2730j.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!((c) entry.getKey()).a()) {
                        ((d) entry.getValue()).b(strArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        if (this.f2725e.compareAndSet(false, true)) {
            this.f2724d.j().execute(this.f2732l);
        }
    }

    public void g(c cVar) {
        d dVar;
        synchronized (this.f2730j) {
            dVar = (d) this.f2730j.k(cVar);
        }
        if (dVar == null || !this.f2728h.c(dVar.f2740a)) {
            return;
        }
        l();
    }

    void i(Context context, String str) {
        this.f2731k = new f(context, str, this, this.f2724d.j());
    }

    void l() {
        if (this.f2724d.o()) {
            m(this.f2724d.i().h0());
        }
    }

    void m(x0.b bVar) {
        if (bVar.t0()) {
            return;
        }
        while (true) {
            try {
                Lock h8 = this.f2724d.h();
                h8.lock();
                try {
                    int[] a8 = this.f2728h.a();
                    if (a8 == null) {
                        return;
                    }
                    int length = a8.length;
                    bVar.x();
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            int i8 = a8[i7];
                            if (i8 == 1) {
                                j(bVar, i7);
                            } else if (i8 == 2) {
                                k(bVar, i7);
                            }
                        } finally {
                        }
                    }
                    bVar.X();
                    bVar.l0();
                    this.f2728h.d();
                } finally {
                    h8.unlock();
                }
            } catch (SQLiteException | IllegalStateException e8) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
                return;
            }
        }
    }
}
