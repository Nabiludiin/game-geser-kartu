package y0;

import android.database.sqlite.SQLiteProgram;

/* compiled from: MyApplication */
class d implements x0.d {

    /* renamed from: q, reason: collision with root package name */
    private final SQLiteProgram f27542q;

    d(SQLiteProgram sQLiteProgram) {
        this.f27542q = sQLiteProgram;
    }

    @Override // x0.d
    public void E(int i7, String str) {
        this.f27542q.bindString(i7, str);
    }

    @Override // x0.d
    public void N(int i7, double d8) {
        this.f27542q.bindDouble(i7, d8);
    }

    @Override // x0.d
    public void W(int i7, long j7) {
        this.f27542q.bindLong(i7, j7);
    }

    @Override // x0.d
    public void Z(int i7, byte[] bArr) {
        this.f27542q.bindBlob(i7, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27542q.close();
    }

    @Override // x0.d
    public void p0(int i7) {
        this.f27542q.bindNull(i7);
    }
}
