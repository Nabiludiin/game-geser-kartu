package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import x0.c;

/* compiled from: MyApplication */
public class i extends c.a {

    /* renamed from: b, reason: collision with root package name */
    private androidx.room.a f2798b;

    /* renamed from: c, reason: collision with root package name */
    private final a f2799c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2800d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2801e;

    /* compiled from: MyApplication */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2802a;

        public a(int i7) {
            this.f2802a = i7;
        }

        protected abstract void a(x0.b bVar);

        protected abstract void b(x0.b bVar);

        protected abstract void c(x0.b bVar);

        protected abstract void d(x0.b bVar);

        protected abstract void e(x0.b bVar);

        protected abstract void f(x0.b bVar);

        protected abstract b g(x0.b bVar);
    }

    /* compiled from: MyApplication */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2803a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2804b;

        public b(boolean z7, String str) {
            this.f2803a = z7;
            this.f2804b = str;
        }
    }

    public i(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f2802a);
        this.f2798b = aVar;
        this.f2799c = aVar2;
        this.f2800d = str;
        this.f2801e = str2;
    }

    private void h(x0.b bVar) {
        if (!k(bVar)) {
            b g8 = this.f2799c.g(bVar);
            if (g8.f2803a) {
                this.f2799c.e(bVar);
                l(bVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g8.f2804b);
            }
        }
        Cursor v7 = bVar.v(new x0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = v7.moveToFirst() ? v7.getString(0) : null;
            v7.close();
            if (!this.f2800d.equals(string) && !this.f2801e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            v7.close();
            throw th;
        }
    }

    private void i(x0.b bVar) {
        bVar.D("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(x0.b bVar) {
        Cursor i02 = bVar.i0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z7 = false;
            if (i02.moveToFirst()) {
                if (i02.getInt(0) == 0) {
                    z7 = true;
                }
            }
            return z7;
        } finally {
            i02.close();
        }
    }

    private static boolean k(x0.b bVar) {
        Cursor i02 = bVar.i0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z7 = false;
            if (i02.moveToFirst()) {
                if (i02.getInt(0) != 0) {
                    z7 = true;
                }
            }
            return z7;
        } finally {
            i02.close();
        }
    }

    private void l(x0.b bVar) {
        i(bVar);
        bVar.D(u0.b.a(this.f2800d));
    }

    @Override // x0.c.a
    public void b(x0.b bVar) {
        super.b(bVar);
    }

    @Override // x0.c.a
    public void d(x0.b bVar) {
        boolean j7 = j(bVar);
        this.f2799c.a(bVar);
        if (!j7) {
            b g8 = this.f2799c.g(bVar);
            if (!g8.f2803a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g8.f2804b);
            }
        }
        l(bVar);
        this.f2799c.c(bVar);
    }

    @Override // x0.c.a
    public void e(x0.b bVar, int i7, int i8) {
        g(bVar, i7, i8);
    }

    @Override // x0.c.a
    public void f(x0.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f2799c.d(bVar);
        this.f2798b = null;
    }

    @Override // x0.c.a
    public void g(x0.b bVar, int i7, int i8) {
        List c8;
        androidx.room.a aVar = this.f2798b;
        if (aVar == null || (c8 = aVar.f2704d.c(i7, i8)) == null) {
            androidx.room.a aVar2 = this.f2798b;
            if (aVar2 != null && !aVar2.a(i7, i8)) {
                this.f2799c.b(bVar);
                this.f2799c.a(bVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i7 + " to " + i8 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f2799c.f(bVar);
        Iterator it = c8.iterator();
        while (it.hasNext()) {
            ((v0.a) it.next()).a(bVar);
        }
        b g8 = this.f2799c.g(bVar);
        if (g8.f2803a) {
            this.f2799c.e(bVar);
            l(bVar);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + g8.f2804b);
        }
    }
}
