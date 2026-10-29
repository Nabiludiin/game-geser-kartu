package x0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public interface c extends Closeable {

    /* compiled from: MyApplication */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f27201a;

        /* renamed from: b, reason: collision with root package name */
        public final String f27202b;

        /* renamed from: c, reason: collision with root package name */
        public final a f27203c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f27204d;

        /* compiled from: MyApplication */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            Context f27205a;

            /* renamed from: b, reason: collision with root package name */
            String f27206b;

            /* renamed from: c, reason: collision with root package name */
            a f27207c;

            /* renamed from: d, reason: collision with root package name */
            boolean f27208d;

            a(Context context) {
                this.f27205a = context;
            }

            public b a() {
                if (this.f27207c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f27205a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f27208d && TextUtils.isEmpty(this.f27206b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f27205a, this.f27206b, this.f27207c, this.f27208d);
            }

            public a b(a aVar) {
                this.f27207c = aVar;
                return this;
            }

            public a c(String str) {
                this.f27206b = str;
                return this;
            }

            public a d(boolean z7) {
                this.f27208d = z7;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z7) {
            this.f27201a = context;
            this.f27202b = str;
            this.f27203c = aVar;
            this.f27204d = z7;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: x0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0143c {
        c a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    x0.b h0();

    void setWriteAheadLoggingEnabled(boolean z7);

    /* compiled from: MyApplication */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f27200a;

        public a(int i7) {
            this.f27200a = i7;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e8) {
                Log.w("SupportSQLite", "delete failed: ", e8);
            }
        }

        public void c(x0.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.r0());
            if (!bVar.isOpen()) {
                a(bVar.r0());
                return;
            }
            List list = null;
            try {
                try {
                    list = bVar.C();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        a((String) ((Pair) it.next()).second);
                    }
                } else {
                    a(bVar.r0());
                }
            }
        }

        public abstract void d(x0.b bVar);

        public abstract void e(x0.b bVar, int i7, int i8);

        public abstract void g(x0.b bVar, int i7, int i8);

        public void b(x0.b bVar) {
        }

        public void f(x0.b bVar) {
        }
    }
}
