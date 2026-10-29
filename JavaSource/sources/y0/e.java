package y0;

import android.database.sqlite.SQLiteStatement;
import x0.f;

/* compiled from: MyApplication */
class e extends d implements f {

    /* renamed from: r, reason: collision with root package name */
    private final SQLiteStatement f27543r;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f27543r = sQLiteStatement;
    }

    @Override // x0.f
    public long I0() {
        return this.f27543r.executeInsert();
    }

    @Override // x0.f
    public int J() {
        return this.f27543r.executeUpdateDelete();
    }
}
