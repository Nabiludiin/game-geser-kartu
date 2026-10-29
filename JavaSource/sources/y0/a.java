package y0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import java.util.List;
import x0.f;

/* compiled from: MyApplication */
class a implements x0.b {

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f27523r = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: s, reason: collision with root package name */
    private static final String[] f27524s = new String[0];

    /* renamed from: q, reason: collision with root package name */
    private final SQLiteDatabase f27525q;

    /* compiled from: MyApplication */
    /* renamed from: y0.a$a, reason: collision with other inner class name */
    class C0150a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.e f27526a;

        C0150a(x0.e eVar) {
            this.f27526a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f27526a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: MyApplication */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.e f27528a;

        b(x0.e eVar) {
            this.f27528a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f27528a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f27525q = sQLiteDatabase;
    }

    @Override // x0.b
    public List C() {
        return this.f27525q.getAttachedDbs();
    }

    @Override // x0.b
    public void D(String str) {
        this.f27525q.execSQL(str);
    }

    @Override // x0.b
    public f K(String str) {
        return new e(this.f27525q.compileStatement(str));
    }

    @Override // x0.b
    public void X() {
        this.f27525q.setTransactionSuccessful();
    }

    @Override // x0.b
    public void Y(String str, Object[] objArr) {
        this.f27525q.execSQL(str, objArr);
    }

    boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f27525q == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27525q.close();
    }

    @Override // x0.b
    public Cursor i0(String str) {
        return v(new x0.a(str));
    }

    @Override // x0.b
    public boolean isOpen() {
        return this.f27525q.isOpen();
    }

    @Override // x0.b
    public void l0() {
        this.f27525q.endTransaction();
    }

    @Override // x0.b
    public String r0() {
        return this.f27525q.getPath();
    }

    @Override // x0.b
    public Cursor s0(x0.e eVar, CancellationSignal cancellationSignal) {
        return this.f27525q.rawQueryWithFactory(new b(eVar), eVar.c(), f27524s, null, cancellationSignal);
    }

    @Override // x0.b
    public boolean t0() {
        return this.f27525q.inTransaction();
    }

    @Override // x0.b
    public Cursor v(x0.e eVar) {
        return this.f27525q.rawQueryWithFactory(new C0150a(eVar), eVar.c(), f27524s, null);
    }

    @Override // x0.b
    public void x() {
        this.f27525q.beginTransaction();
    }
}
