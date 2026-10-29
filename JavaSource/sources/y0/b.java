package y0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import x0.c;

/* compiled from: MyApplication */
class b implements x0.c {

    /* renamed from: q, reason: collision with root package name */
    private final Context f27530q;

    /* renamed from: r, reason: collision with root package name */
    private final String f27531r;

    /* renamed from: s, reason: collision with root package name */
    private final c.a f27532s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f27533t;

    /* renamed from: u, reason: collision with root package name */
    private final Object f27534u = new Object();

    /* renamed from: v, reason: collision with root package name */
    private a f27535v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f27536w;

    /* compiled from: MyApplication */
    static class a extends SQLiteOpenHelper {

        /* renamed from: q, reason: collision with root package name */
        final y0.a[] f27537q;

        /* renamed from: r, reason: collision with root package name */
        final c.a f27538r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f27539s;

        /* compiled from: MyApplication */
        /* renamed from: y0.b$a$a, reason: collision with other inner class name */
        class C0151a implements DatabaseErrorHandler {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f27540a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y0.a[] f27541b;

            C0151a(c.a aVar, y0.a[] aVarArr) {
                this.f27540a = aVar;
                this.f27541b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f27540a.c(a.c(this.f27541b, sQLiteDatabase));
            }
        }

        a(Context context, String str, y0.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f27200a, new C0151a(aVar, aVarArr));
            this.f27538r = aVar;
            this.f27537q = aVarArr;
        }

        static y0.a c(y0.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            y0.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new y0.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        y0.a a(SQLiteDatabase sQLiteDatabase) {
            return c(this.f27537q, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f27537q[0] = null;
        }

        synchronized x0.b e() {
            this.f27539s = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f27539s) {
                return a(writableDatabase);
            }
            close();
            return e();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f27538r.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f27538r.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            this.f27539s = true;
            this.f27538r.e(a(sQLiteDatabase), i7, i8);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f27539s) {
                return;
            }
            this.f27538r.f(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            this.f27539s = true;
            this.f27538r.g(a(sQLiteDatabase), i7, i8);
        }
    }

    b(Context context, String str, c.a aVar, boolean z7) {
        this.f27530q = context;
        this.f27531r = str;
        this.f27532s = aVar;
        this.f27533t = z7;
    }

    private a a() {
        a aVar;
        synchronized (this.f27534u) {
            try {
                if (this.f27535v == null) {
                    y0.a[] aVarArr = new y0.a[1];
                    if (this.f27531r == null || !this.f27533t) {
                        this.f27535v = new a(this.f27530q, this.f27531r, aVarArr, this.f27532s);
                    } else {
                        this.f27535v = new a(this.f27530q, new File(this.f27530q.getNoBackupFilesDir(), this.f27531r).getAbsolutePath(), aVarArr, this.f27532s);
                    }
                    this.f27535v.setWriteAheadLoggingEnabled(this.f27536w);
                }
                aVar = this.f27535v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // x0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // x0.c
    public String getDatabaseName() {
        return this.f27531r;
    }

    @Override // x0.c
    public x0.b h0() {
        return a().e();
    }

    @Override // x0.c
    public void setWriteAheadLoggingEnabled(boolean z7) {
        synchronized (this.f27534u) {
            try {
                a aVar = this.f27535v;
                if (aVar != null) {
                    aVar.setWriteAheadLoggingEnabled(z7);
                }
                this.f27536w = z7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
