package g2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b2.a;
import b2.c;
import h2.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y1.i;

/* compiled from: MyApplication */
public class m0 implements g2.d, h2.b, g2.c {

    /* renamed from: v, reason: collision with root package name */
    private static final w1.b f23988v = w1.b.b("proto");

    /* renamed from: q, reason: collision with root package name */
    private final t0 f23989q;

    /* renamed from: r, reason: collision with root package name */
    private final i2.a f23990r;

    /* renamed from: s, reason: collision with root package name */
    private final i2.a f23991s;

    /* renamed from: t, reason: collision with root package name */
    private final e f23992t;

    /* renamed from: u, reason: collision with root package name */
    private final d6.a f23993u;

    /* compiled from: MyApplication */
    interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MyApplication */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f23994a;

        /* renamed from: b, reason: collision with root package name */
        final String f23995b;

        private c(String str, String str2) {
            this.f23994a = str;
            this.f23995b = str2;
        }
    }

    /* compiled from: MyApplication */
    interface d {
        Object a();
    }

    m0(i2.a aVar, i2.a aVar2, e eVar, t0 t0Var, d6.a aVar3) {
        this.f23989q = t0Var;
        this.f23990r = aVar;
        this.f23991s = aVar2;
        this.f23992t = eVar;
        this.f23993u = aVar3;
    }

    private static w1.b A0(String str) {
        return str == null ? f23988v : w1.b.b(str);
    }

    public static /* synthetic */ Long B(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    private static String C0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ Object F(Throwable th) {
        throw new h2.a("Timed out while trying to acquire the lock.", th);
    }

    static Object F0(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object G(String str, c.b bVar, long j7, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) F0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.c())}), new b() { // from class: g2.y
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0.getCount() > 0);
                return valueOf;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j7 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.c())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.c()));
        contentValues.put("events_dropped_count", Long.valueOf(j7));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object H(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j7 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j7));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j7), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Integer I(final m0 m0Var, long j7, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        String[] strArr = {String.valueOf(j7)};
        F0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: g2.s
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.n(m0.this, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object L(m0 m0Var, List list, y1.o oVar, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            long j7 = cursor.getLong(0);
            boolean z7 = cursor.getInt(7) != 0;
            i.a k7 = y1.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z7) {
                k7.h(new y1.h(A0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k7.h(new y1.h(A0(cursor.getString(4)), m0Var.y0(j7)));
            }
            if (!cursor.isNull(6)) {
                k7.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j7, oVar, k7.d()));
        }
        return null;
    }

    public static /* synthetic */ Object M(m0 m0Var, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m0Var.f23990r.a()).execute();
        return null;
    }

    public static /* synthetic */ b2.a O(final m0 m0Var, String str, final Map map, final a.C0062a c0062a, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        return (b2.a) F0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: g2.a0
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.t(m0.this, map, c0062a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long P(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ b2.f R(final long j7, SQLiteDatabase sQLiteDatabase) {
        return (b2.f) F0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: g2.d0
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.h(j7, (Cursor) obj);
            }
        });
    }

    private c.b S(int i7) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i7 == bVar.c()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i7 == bVar2.c()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i7 == bVar3.c()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i7 == bVar4.c()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i7 == bVar5.c()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i7 == bVar6.c()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i7 == bVar7.c()) {
            return bVar7;
        }
        c2.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i7));
        return bVar;
    }

    private void T(final SQLiteDatabase sQLiteDatabase) {
        z0(new d() { // from class: g2.l
            @Override // g2.m0.d
            public final Object a() {
                return m0.z(sQLiteDatabase);
            }
        }, new b() { // from class: g2.w
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.F((Throwable) obj);
            }
        });
    }

    private long U(SQLiteDatabase sQLiteDatabase, y1.o oVar) {
        Long j02 = j0(sQLiteDatabase, oVar);
        if (j02 != null) {
            return j02.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(j2.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private b2.b b0() {
        return b2.b.b().b(b2.e.c().b(V()).c(e.f23971a.f()).a()).a();
    }

    private long e0() {
        return a0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long f0() {
        return a0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private b2.f g0() {
        final long a8 = this.f23990r.a();
        return (b2.f) m0(new b() { // from class: g2.c0
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.R(a8, (SQLiteDatabase) obj);
            }
        });
    }

    public static /* synthetic */ b2.f h(long j7, Cursor cursor) {
        cursor.moveToNext();
        return b2.f.c().c(cursor.getLong(0)).b(j7).a();
    }

    public static /* synthetic */ List j(m0 m0Var, y1.o oVar, SQLiteDatabase sQLiteDatabase) {
        List q02 = m0Var.q0(sQLiteDatabase, oVar, m0Var.f23992t.d());
        for (w1.d dVar : w1.d.values()) {
            if (dVar != oVar.d()) {
                int d8 = m0Var.f23992t.d() - q02.size();
                if (d8 <= 0) {
                    break;
                }
                q02.addAll(m0Var.q0(sQLiteDatabase, oVar.f(dVar), d8));
            }
        }
        return m0Var.o0(q02, m0Var.v0(sQLiteDatabase, q02));
    }

    private Long j0(SQLiteDatabase sQLiteDatabase, y1.o oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(j2.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) F0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: g2.n
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.B((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List k(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(y1.o.a().b(cursor.getString(1)).d(j2.a.b(cursor.getInt(2))).c(w0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object l(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.e(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase m(Throwable th) {
        throw new h2.a("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Object n(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.e(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private boolean n0() {
        return e0() * f0() >= this.f23992t.f();
    }

    public static /* synthetic */ Object o(final m0 m0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        F0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: g2.v
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.l(m0.this, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    private List o0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k kVar = (k) listIterator.next();
            if (map.containsKey(Long.valueOf(kVar.c()))) {
                i.a l7 = kVar.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(kVar.c()))) {
                    l7.c(cVar.f23994a, cVar.f23995b);
                }
                listIterator.set(k.a(kVar.c(), kVar.d(), l7.d()));
            }
        }
        return list;
    }

    public static /* synthetic */ Boolean p(m0 m0Var, y1.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long j02 = m0Var.j0(sQLiteDatabase, oVar);
        return j02 == null ? Boolean.FALSE : (Boolean) F0(m0Var.a0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{j02.toString()}), new b() { // from class: g2.u
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object q(long j7, y1.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j7));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(j2.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(j2.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private List q0(SQLiteDatabase sQLiteDatabase, final y1.o oVar, int i7) {
        final ArrayList arrayList = new ArrayList();
        Long j02 = j0(sQLiteDatabase, oVar);
        if (j02 == null) {
            return arrayList;
        }
        F0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{j02.toString()}, null, null, null, String.valueOf(i7)), new b() { // from class: g2.x
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.L(m0.this, arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ byte[] r(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i7 += blob.length;
        }
        byte[] bArr = new byte[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            byte[] bArr2 = (byte[]) arrayList.get(i9);
            System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
            i8 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List s(SQLiteDatabase sQLiteDatabase) {
        return (List) F0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: g2.k0
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.k((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ b2.a t(m0 m0Var, Map map, a.C0062a c0062a, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b S = m0Var.S(cursor.getInt(1));
            long j7 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(b2.c.c().c(S).b(j7).a());
        }
        m0Var.x0(c0062a, map);
        c0062a.e(m0Var.g0());
        c0062a.d(m0Var.b0());
        c0062a.c((String) m0Var.f23993u.get());
        return c0062a.b();
    }

    private Map v0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < list.size(); i7++) {
            sb.append(((k) list.get(i7)).c());
            if (i7 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        F0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: g2.z
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.H(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    public static /* synthetic */ Long w(m0 m0Var, y1.i iVar, y1.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m0Var.n0()) {
            m0Var.e(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long U = m0Var.U(sQLiteDatabase, oVar);
        int e8 = m0Var.f23992t.e();
        byte[] a8 = iVar.e().a();
        boolean z7 = a8.length <= e8;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(U));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z7));
        contentValues.put("payload", z7 ? a8 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z7) {
            int ceil = (int) Math.ceil(a8.length / e8);
            for (int i7 = 1; i7 <= ceil; i7++) {
                byte[] copyOfRange = Arrays.copyOfRange(a8, (i7 - 1) * e8, Math.min(i7 * e8, a8.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i7));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    private static byte[] w0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void x0(a.C0062a c0062a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0062a.a(b2.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] y0(long j7) {
        return (byte[]) F0(a0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j7)}, null, null, "sequence_num"), new b() { // from class: g2.b0
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.r((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private Object z0(d dVar, b bVar) {
        long a8 = this.f23991s.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e8) {
                if (this.f23991s.a() >= this.f23992t.b() + a8) {
                    return bVar.apply(e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // g2.d
    public void A(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            a0().compileStatement("DELETE FROM events WHERE _id in " + C0(iterable)).execute();
        }
    }

    @Override // g2.d
    public void E0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m0(new b() { // from class: g2.l0
                @Override // g2.m0.b
                public final Object apply(Object obj) {
                    return m0.o(m0.this, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // g2.d
    public k G0(final y1.o oVar, final y1.i iVar) {
        c2.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) m0(new b() { // from class: g2.i0
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.w(m0.this, iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, oVar, iVar);
    }

    @Override // g2.d
    public void L0(final y1.o oVar, final long j7) {
        m0(new b() { // from class: g2.p
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.q(j7, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // g2.d
    public Iterable Q() {
        return (Iterable) m0(new b() { // from class: g2.g0
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.s((SQLiteDatabase) obj);
            }
        });
    }

    long V() {
        return e0() * f0();
    }

    @Override // h2.b
    public Object a(b.a aVar) {
        SQLiteDatabase a02 = a0();
        T(a02);
        try {
            Object a8 = aVar.a();
            a02.setTransactionSuccessful();
            return a8;
        } finally {
            a02.endTransaction();
        }
    }

    SQLiteDatabase a0() {
        final t0 t0Var = this.f23989q;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) z0(new d() { // from class: g2.e0
            @Override // g2.m0.d
            public final Object a() {
                return t0.this.getWritableDatabase();
            }
        }, new b() { // from class: g2.f0
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.m((Throwable) obj);
            }
        });
    }

    @Override // g2.c
    public void c() {
        m0(new b() { // from class: g2.q
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.M(m0.this, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // g2.d
    public long c0(y1.o oVar) {
        return ((Long) F0(a0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(j2.a.a(oVar.d()))}), new b() { // from class: g2.h0
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.P((Cursor) obj);
            }
        })).longValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23989q.close();
    }

    @Override // g2.c
    public void e(final long j7, final c.b bVar, final String str) {
        m0(new b() { // from class: g2.r
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.G(str, bVar, j7, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // g2.c
    public b2.a g() {
        final a.C0062a e8 = b2.a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (b2.a) m0(new b() { // from class: g2.t
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.O(m0.this, str, hashMap, e8, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // g2.d
    public boolean k0(final y1.o oVar) {
        return ((Boolean) m0(new b() { // from class: g2.o
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.p(m0.this, oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    Object m0(b bVar) {
        SQLiteDatabase a02 = a0();
        a02.beginTransaction();
        try {
            Object apply = bVar.apply(a02);
            a02.setTransactionSuccessful();
            return apply;
        } finally {
            a02.endTransaction();
        }
    }

    @Override // g2.d
    public Iterable u0(final y1.o oVar) {
        return (Iterable) m0(new b() { // from class: g2.m
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.j(m0.this, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // g2.d
    public int y() {
        final long a8 = this.f23990r.a() - this.f23992t.c();
        return ((Integer) m0(new b() { // from class: g2.j0
            @Override // g2.m0.b
            public final Object apply(Object obj) {
                return m0.I(m0.this, a8, (SQLiteDatabase) obj);
            }
        })).intValue();
    }
}
